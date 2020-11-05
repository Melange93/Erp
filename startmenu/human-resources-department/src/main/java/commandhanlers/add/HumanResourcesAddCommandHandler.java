package commandhanlers.add;

import domain.Employee;
import domain.EmployeeResponse;
import log.CommandHandler;

import java.util.Objects;

public class HumanResourcesAddCommandHandler extends CommandHandler {

    private static final String ADD_COMMAND = "Add";
    private final HumanResourcesAddScanner addScanner;
    private final HumanResourcesAddCommunicator addCommunicator;

    public HumanResourcesAddCommandHandler(CommandHandler next, HumanResourcesAddScanner addScanner, HumanResourcesAddCommunicator addCommunicator) {
        super(next);
        this.addScanner = addScanner;
        this.addCommunicator = addCommunicator;
    }

    @Override
    public void handleCommand(String command) {
        if (Objects.equals(command, ADD_COMMAND)) {
            Employee addRequestInformation = addScanner.getAddRequestInformation();
            EmployeeResponse employeeResponse = addCommunicator.registerNewEmployee(addRequestInformation);
            System.out.println(employeeResponse);
            return;
        }
        super.handleCommand(command);
    }
}
