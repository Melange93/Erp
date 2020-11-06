package department;

import commandhanlers.add.HumanResourcesAddCommandHandler;
import commandhanlers.add.HumanResourcesAddCommunicator;
import commandhanlers.add.HumanResourcesAddScanner;
import log.CommandHandler;
import log.Department;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Scanner;

public class HumanResourcesDepartment extends Department {

    private CommandHandler chain;

    public HumanResourcesDepartment(String departmentName, List<String> menuCommands) {
        super(departmentName, menuCommands);
        buildChain();
    }

    @Override
    public void command(String command) {
        chain.handleCommand(command);
    }

    private void buildChain() {
        chain = new HumanResourcesAddCommandHandler(
                null,
                new HumanResourcesAddScanner(new Scanner(System.in)),
                new HumanResourcesAddCommunicator(new RestTemplate())
        );
    }
}
