//Aqui se logra una evolucion separada del medio (Email y SMS) y el tipo de notificacion (Alerta,
//Promocion y Recordatorio), ahorrando el trabajo de tener que generar una clase para cada tipo
//de caso (EmailAlerta, EmailNotificacion, EMailPromocion, SMSAlerta, SMSNotificacion, SMSPromocion)

package Bridge;

public class Main {
    public static void main(String[] args) {
        Medio EmailAlerta = new Email(new Alerta());
        Medio EmailPromocion = new Email(new Promocion());
        Medio EmailRecordatorio = new Email(new Recordatorio());
        Medio SMSAlerta = new SMS(new Alerta());
        Medio SMSPromocion = new SMS(new Promocion());
        Medio SMSRecordatorio = new SMS(new Recordatorio());
        EmailAlerta.Aplicar();
        EmailPromocion.Aplicar();
        EmailRecordatorio.Aplicar();
        SMSAlerta.Aplicar();
        SMSPromocion.Aplicar();
        SMSRecordatorio.Aplicar();
    }
}