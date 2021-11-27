
import javax.swing.JFrame;

/**
*   ************************  PROYECYO  *****************************
*
*   Elegir destino.          ->     Nacional / Internaccional
*   Elegir tipo de envio.    ->     1. Ordinario    - Ordinario Certificado 
*                                   2. Urgente      - Urgente certificado.
*
*   Peso.                    ->     Peso de cada carta.
*   Acuse recibo.            ->     Doble certificado.
*   Valor declarado.         ->     Por si se pierde la carta o paquete.
*   Calcular.                ->     Boton calcular.  
*  
*/

public class Main {

    public static void LookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App_tarifa_correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_tarifa_correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_tarifa_correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_tarifa_correos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        LookAndFeel();
        new App_tarifa_correos("APPLICACIÓN DE CORREOS").setVisible(true);  
    }
}
