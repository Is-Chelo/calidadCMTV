/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenpracticocalidadtdd;

/**
 *
 * @author CHELO
 */
public class Obtener {

    private String respuesta = "";

    public String obtenerAccion(boolean matricula) {

        if (matricula) {
            respuesta = "yamatriculado";
        }
        return respuesta;
    }

    public String obtenerAccion(boolean va1, boolean va2) {
        if (va1 && va2) {
            this.respuesta = "yamatriculado";
        } else {
            this.respuesta = "registrarse y matricularse";
        }
        if (va1 && !va2) {
            this.respuesta = "registrarse y matricularse";

        }

        return respuesta;
    }

    public String obtenerAccion(boolean va1, boolean va2, boolean va3) {
        if (!va1 && va2 && va3) {
            this.respuesta = "nodestinado";
        }
        return this.respuesta;
    }

    public String obtenerAccion(boolean matricula, boolean registro, boolean esDocente, boolean curso) {
        if (!matricula && registro && esDocente && !curso) {
            this.respuesta = "matricularse";
        }
        return this.respuesta;
    }

    public String obtenerAccion(boolean matricula, String estadoRegistro) {
        if (matricula && estadoRegistro.equals("porConfirmar")) {
            this.respuesta = "registrarse";
        }
        return this.respuesta;
    }

    public String obtenerAccion(boolean matricula, boolean registro, boolean esDocente, boolean esInstitucion, boolean esExterno) {
        if (!matricula && registro && !esDocente) {
            if (esInstitucion || esExterno) {
                this.respuesta = "matricularse";
            }
        }
        return this.respuesta;
    }

    public String obtenerAccion(boolean doc, String esObligatorio, boolean va1) {
        if (doc && esObligatorio.equals("si") && !va1) {
            this.respuesta = "nodestinado";
        }
        return this.respuesta;
    }

}
