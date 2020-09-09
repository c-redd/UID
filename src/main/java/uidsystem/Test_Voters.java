/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uidsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author yd65
 */

@Entity
@Table(name="test_Voters")
public class Test_Voters{
    @Id
    private Long ClientID;
    private String CardNumber;
    @Temporal(TemporalType.DATE)
    private Date IssueDate;
    private Long PollingStation;
    
    public Long getClientID(){
        return ClientID;
    }    
    public void setClientID(Long ClientID){
        this.ClientID = ClientID;
    }    
    public String getCardNumber(){
        return CardNumber;
    }    
    public void setCardNumber(String CardNumber){
        this.CardNumber = CardNumber;
    }    
    public String getIssueDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd--MM-yyyy");
        String dateString = format.format(IssueDate);
        return dateString;
    }    
    


public void setIssueDate(Date IssueDate){
        this.IssueDate = IssueDate;
    }    
    public Long getPollingStation(){
        return PollingStation;
    }    
    public void setPollingStation(Long PollingStation){
        this.PollingStation = PollingStation;
    }    
}
