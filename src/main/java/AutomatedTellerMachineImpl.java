import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named("atm")
public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {

    @Inject
    private ATMTransport transport;

    public void deposit(BigDecimal bd) {
        System.out.println("deposit called");
        transport.communicateWithBank(new byte[10]);
    }
    public void withdraw(BigDecimal bd) {
        System.out.println("withdraw called");
        transport.communicateWithBank(new byte[10]);
    }
}
