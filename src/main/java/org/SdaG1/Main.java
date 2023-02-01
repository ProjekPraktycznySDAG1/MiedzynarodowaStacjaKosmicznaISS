package org.SdaG1;

import org.SdaG1.controller.ConsoleController;
import org.SdaG1.service.JsonSerializerService;

public class Main {
    public static void main(String[] args) throws Exception {

        JsonSerializerService jsonSerializerService = new JsonSerializerService();
        System.out.println(jsonSerializerService.issData());
        System.out.println(jsonSerializerService.peopleData());

        ConsoleController controller = new ConsoleController();
        controller.showMenuOptions();

    }
}