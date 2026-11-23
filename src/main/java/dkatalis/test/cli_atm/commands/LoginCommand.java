package dkatalis.test.cli_atm.commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
@Command(name = "login",
        description = "Login",
        mixinStandardHelpOptions = true)
public class LoginCommand implements Callable {

  public static void main(String[] args) {
      int exitCode = new CommandLine(new LoginCommand()).execute(args);
      System.exit(exitCode);
  }

  @Override
  public Integer call() {
      System.out.println("Hello World!");
      return 0;
  }

  /*@Override
  public void run() {
    AboutService.about();
  }*/
}
