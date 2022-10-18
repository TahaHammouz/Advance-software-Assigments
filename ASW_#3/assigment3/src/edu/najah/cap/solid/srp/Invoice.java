package edu.najah.cap.solid.srp;

import edu.najah.cap.solid.srp.impl.ICloseDb;
import edu.najah.cap.solid.srp.impl.IConnectDb;
import edu.najah.cap.solid.srp.impl.IDeleteDb;
import edu.najah.cap.solid.srp.impl.IInsertDb;

import java.util.Date;


/**
 * What are the responsibilities for this class?
 * Do the required change to make this class single responsibility
 */
public class Invoice {
    private IConnectDb connect;
    private IDeleteDb delete;
    private IInsertDb insert;
    private ICloseDb close;


    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }

    public void add()  {
        connect.connectDb();
        delete.deleteDb();
        insert.InsertDb();
        close.CloseDb();
        MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
        this.sendEmail(mailMessage);
    }
    public void delete(){
        connect.connectDb();
        delete.deleteDb();
        close.CloseDb();
    }
    public void sendEmail(MailMessage mailMessage)  {
        Validation Check = new Validation();
        try {
            Check.isValid(mailMessage);
        }catch(Exception e){
            System.err.println("Something went wrong."+e);
        }
    }
}
