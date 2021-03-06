package ApiEx.withWebFlux.services.smssender;

import ApiEx.withWebFlux.forms.SmsForm;
import ApiEx.withWebFlux.models.SmsModels;
import org.jsmpp.bean.Address;
import org.jsmpp.session.SMPPSession;
import java.util.List;


public interface MessageSender {
    boolean saveAndSend(SmsForm smsForm);

    void broadcastMessage(String message, String number);

    Address[] prepareAddress(String number);

    SMPPSession initSession();

    List<SmsModels> findAll();

}