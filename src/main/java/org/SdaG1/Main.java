package org.SdaG1;

import org.SdaG1.controller.ConsoleController;
import org.SdaG1.utils.JsonSerializer;

public class Main {
    public static void main(String[] args) throws Exception {

        JsonSerializer jsonSerializerService = new JsonSerializer();
     //   System.out.println(jsonSerializerService.issData());
     //   System.out.println(jsonSerializerService.peopleData());

        ConsoleController controller = new ConsoleController();
        controller.showMenuOptions();


    }
}