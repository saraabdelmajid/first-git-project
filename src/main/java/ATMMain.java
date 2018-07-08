

import org.cdisource.beancontainer.BeanContainer;
import org.cdisource.beancontainer.BeanContainerManager;

import javax.inject.Inject;
import java.math.BigDecimal;

public class ATMMain {

    static BeanContainer beanContainer =  BeanContainerManager.getInstance();

    public static void main(String[] args) {
       AutomatedTellerMachine machine = (AutomatedTellerMachine) beanContainer.getBeanByName("atm");
        //AutomatedTellerMachine machine = new AutomatedTellerMachineImpl();
        machine.deposit(new BigDecimal(100));

    }

}
