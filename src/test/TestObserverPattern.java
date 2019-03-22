import observerpattern.StudentObserver;
import observerpattern.TeacherSubject;
import observerpattern.jdkobserver.Watched;
import observerpattern.jdkobserver.Watcher;

import java.util.Observer;

public class TestObserverPattern {
    public static void main(String[] args) {

//        TeacherSubject teacher=new TeacherSubject();
//        StudentObserver zhangSan=new StudentObserver("张三", teacher);
//        StudentObserver LiSi=new StudentObserver("李四", teacher);
//        StudentObserver WangWu=new StudentObserver("王五", teacher);
//
//        teacher.setHomework("第二页第六题");
//        System.out.println("---------------------");
//        teacher.setHomework("第三页第七题");
//        System.out.println("---------------------");
//        teacher.setHomework("第五页第八题");
//        System.out.println("---------------------");
//        teacher.deleteObserver(zhangSan);
//        teacher.setHomework("布置作业");


        //jdk测试代码
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");


    }
}
