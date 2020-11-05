package log;

public abstract class CommandHandler {

    private final CommandHandler next;

    public CommandHandler(CommandHandler next) {
        this.next = next;
    }

    public void handleCommand(String command) {
        if (next != null) {
            next.handleCommand(command);
        }
    }
}
