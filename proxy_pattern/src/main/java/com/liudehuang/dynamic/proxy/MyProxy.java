package com.liudehuang.dynamic.proxy;

import com.liudehuang.dynamic.proxy.impl.LdhExtJdkInvocationHandler;
import com.liudehuang.dynamic.service.OrderService;
import com.liudehuang.dynamic.service.impl.OrderServiceImpl;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * @BelongProject: design_pattern
 * @BelongPackage: com.liudehuang.dynamic.proxy
 * @Author: liudehuang
 * @CreateTime: 2019-07-18 16:05:01
 * @Description: todo
 **/
public class MyProxy {

    public static String rt = "\r\t";

    public static Object newProxyInstance(JavaClassLoader classLoader,
                                          Class<?> classInfo,
                                          MyExtJdkInvocationHandler h){
        //1.拼接代理类的源代码
        try{
            //1.创建代理类java源代码文件，写入到磁盘中。。。
            Method[] methods = classInfo.getMethods();
            String proxyClass = "package com.liudehuang.dynamic.proxy;"+rt
                    + "import java.lang.reflect.Method;"+rt
                    + "import com.liudehuang.dynamic.proxy.MyExtJdkInvocationHandler;"+rt
                    + "public class $Proxy0 implements "+classInfo.getName()+" {"+rt
                    + "     private MyExtJdkInvocationHandler h;" + rt
                    + "     public $Proxy0(MyExtJdkInvocationHandler h)" + "{" + rt
                    + "         this.h= h;" + rt
                    + "     }"
                    + getMethodString(methods, classInfo) + rt
                    + "}";
            // 2. 写入到到本地文件中..
            String filename = "F:\\百度云盘下载\\code\\$Proxy0.java";
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            fw.write(proxyClass);
            fw.flush();
            fw.close();
            // 3. 将源代码编译成class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileMgr.getJavaFileObjects(filename);
            JavaCompiler.CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
            t.call();
            fileMgr.close();
            // 4.使用classLoader 加载到内存中..
            Class<?> $Proxy0 = classLoader.findClass("$Proxy0");
            // 5.指明初始化有参数构造函数
            Constructor<?> constructor = $Proxy0.getConstructor(MyExtJdkInvocationHandler.class);
            Object o = constructor.newInstance(h);
            return o;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getMethodString(Method[] methods, Class intf) {
        String proxyMe = "";
        for (Method method : methods) {
            proxyMe += "public void " + method.getName() + "() throws Throwable {" + rt
                    + "Method md= " + intf.getName() + ".class.getMethod(\"" + method.getName()
                    + "\",new Class[]{});" + rt
                    + "this.h.invoke(this,md,null);" + rt + "}" + rt;

        }
        return proxyMe;
    }


}
