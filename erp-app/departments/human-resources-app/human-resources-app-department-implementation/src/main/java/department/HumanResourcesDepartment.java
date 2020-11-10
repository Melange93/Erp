package department;

import commandhanlers.add.HumanResourcesAddCommandHandler;
import commandhanlers.add.HumanResourcesAddCommunicator;
import commandhanlers.add.HumanResourcesAddScanner;
import logicdomain.CommandHandler;
import logicdomain.Department;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Scanner;

@Component
public class HumanResourcesDepartment implements Department {

    private CommandHandler chain;

    public HumanResourcesDepartment() {
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
