package command;

public class InsertCommand extends Command {
    Content content;

    String strToInsert = "http://www.mashibing.com";

    public InsertCommand(Content content) {
        this.content = content;
    }

    @Override
    public void doit() {
        content.msg += strToInsert;
    }

    @Override
    public void undo() {
        content.msg = content.msg.substring(0, content.msg.length() - strToInsert.length());
    }
}
