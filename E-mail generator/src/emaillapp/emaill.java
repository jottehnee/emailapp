package emaillapp;

import java.util.Scanner;

public class emaill

{
private String _vorname;
private String _nachname;
private String _abteilung;
private String _password;
private int _kapazitaet=500;
private String _alternativemail;
private String _mail;

// constructor
public emaill(String vorname, String nachname) {
    _vorname=vorname;
    _nachname=nachname;
    System.out.println("E-Mail erstellt: " + this._vorname +" "+  this._nachname );
    this._abteilung =setAbteilung();
    System.out.println("Abteilung:" +this._abteilung);
    this._password= zufallsPasswort(8);
    System.out.println("Passwort:" +this._password);
    this._mail=setMail();
    System.out.println("Passwort:" +this._mail);
    
}

private String setAbteilung()
{
    System.out.print("Wählen Sie die Abteilung:/n 1 Vertrieb/n 2 Personal/n 3 IT/n");
    Scanner in= new Scanner(System.in);
    int auswahl = in.nextInt();
    switch(auswahl) {
        case 1: return "Vertrieb";
        case 2: return "Personal";
        case 3: return "IT";
        default: return "";}
}

// generiert ein passwort
private String zufallsPasswort(int length)
{
    String inputSet = "ABCDEFGHIJKLMNOPQRSTUVW1234567890!'§$%&/()";
    char[] password= new char [length];
    for( int i = 0;i<length;i++)
    { int random= (int) (Math.random() * inputSet.length());
    password[i] = inputSet.charAt(random);
    

    }
    return new String (password);            
    
    
    
    
}

//generiert eine Mailadresse

private String setMail()
{
    String mail= _vorname+"."+_nachname+"@"+_abteilung+".de";
    return mail; 
    
}

// ändert die Kapazität der Mailbox
private void setKapazitaet(int neueKapazitaet)
{
    this._kapazitaet= neueKapazitaet;

}
// legt eine alternative Mail an 
private void setaltMail(String altMail)
{
    this._alternativemail= altMail;

}
//passwort ändern
public void änderePasswort(String neuespassword)
{
    this._password= neuespassword;
}

//gibt ein Passwort wieder
public String getPasswort()
{ 
    return _password;
}
//gibt die alterantive Mail wieder
public String getalternativeMail()
{ 
    return _alternativemail;
}
//gibt die Kapazität wieder
public int getKapazitaet()
{ 
    return _kapazitaet;
}
}
