package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Line line = context.getBean("lineBean", Line.class);
        line.setColor("Fuchsia");

        GraphStation graphStation = context.getBean("graphStationBean", GraphStation.class);

        graphStation.drawObject();

        context.close();
    }


}
