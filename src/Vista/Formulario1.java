/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ButtonModel;

/**
 *
 * @author David
 */
public class Formulario1 extends javax.swing.JPanel {

    /**
     * Creates new form Formulario1
     */
    public Formulario1() {
        initComponents();
        rbEmpresas.add(rbClaro);
        rbEmpresas.add(rbCnt);
        rbEmpresas.add(rbEtapa);
        rbEmpresas.add(rbInteractive);
        rbEmpresas.add(rbMovistar);
        rbEmpresas.add(rbNetlife);
        rbEmpresas.add(rbOnnet);
        rbEmpresas.add(rbOtros);
        rbEmpresas.add(rbPanchonet);
        rbEmpresas.add(rbPuntonet);
        rbEmpresas.add(rbTelconet);
        rbEmpresas.add(rbTvcable);
        
        bgCalidad.add(rbCalidad1);
        bgCalidad.add(rbCalidad2);
        bgCalidad.add(rbCalidad3);
        bgCalidad.add(rbCalidad4);
        bgCalidad.add(rbCalidad5);
        
    }
    
    public String Resultado1(){
        String res="ninguna";
        if(rbClaro.isSelected()){
            res=rbClaro.getText();
        }
        else if (rbCnt.isSelected()){
            res=rbCnt.getText();
        }
        else if (rbEtapa.isSelected()){
            res=rbEtapa.getText();
        }
        else if (rbInteractive.isSelected()){
            res=rbInteractive.getText();
        }
        else if (rbMovistar.isSelected()){
            res=rbMovistar.getText();
        }
        else if (rbNetlife.isSelected()){
            res=rbNetlife.getText();
        }
        else if (rbOnnet.isSelected()){
            res=rbOnnet.getText();
        }
        else if (rbOtros.isSelected()){
            res=txtOtros.getText();
        }
        else if (rbPanchonet.isSelected()){
            res=rbPanchonet.getText();
        }
        else if (rbPuntonet.isSelected()){
            res=rbPuntonet.getText();
        }
        else if (rbTelconet.isSelected()){
            res=rbTelconet.getText();
        }
        else if (rbTvcable.isSelected()){
            res=rbTvcable.getText();
        }
        else{
            res="ninguno";
        }
        return res;
    }

    public String Resultado2(){
        String res;
        res=txtTiempo.getText();
        return res;
    }
    
    public String Resultado3(){
        String res="ninguno";
        if(rbCalidad1 .isSelected()){
            res="Muy malo";
        }
        else if (rbCalidad2.isSelected()){
            res="Malo";
        }
        else if (rbCalidad3.isSelected()){
            res="Aceptable";
        }
        else if (rbCalidad4.isSelected()){
            res="Bueno";
        }
        else if (rbCalidad5.isSelected()){
            res="Muy Bueno";
        }
        else{
            res="ninguno";
        }
        return res;
    }
    
    public void Busqueda1(String boton){
        if(null != boton)switch (boton) {
            case "Claro":
                rbClaro.setSelected(true);
                break;
            case "Cnt":
                rbCnt.setSelected(true);
                break;
            case "Etapa":
                rbEtapa.setSelected(true);
                break;
            case "Interactive":
                rbInteractive.setSelected(true);
                break;
            case "Movistar":
                rbMovistar.setSelected(true);
                break;
            case "Netlife":
                rbNetlife.setSelected(true);
                break;
            case "Onnet":
                rbOnnet.setSelected(true);
                break;
            case "Panchonet":
                rbPanchonet.setSelected(true);
                break;
            case "Puntonet":
                rbPuntonet.setSelected(true);
                break;
            case "Telconet":
                rbTelconet.setSelected(true);
                break;
            case "Tvcable":
                rbTvcable.setSelected(true);
                break;
            default:
                rbOtros.setSelected(true);
                txtOtros.setText(boton);
                break;
        }
    }
    
    public void Busqueda2(String respuesta){
        txtTiempo.setText(respuesta);
    }
    
    public void Busqueda3(String boton){
        if(null != boton)switch (boton) {
            case "Muy malo":
                rbCalidad1.setSelected(true);
                break;
            case "Malo":
                rbCalidad2.setSelected(true);
                break;
            case "Aceptable":
                rbCalidad3.setSelected(true);
                break;
            case "Bueno":
                rbCalidad4.setSelected(true);
                break;
            case "Muy bueno":
                rbCalidad5.setSelected(true);
                break;
            default:
                break;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbEmpresas = new javax.swing.ButtonGroup();
        bgCalidad = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rbClaro = new javax.swing.JRadioButton();
        rbMovistar = new javax.swing.JRadioButton();
        rbCnt = new javax.swing.JRadioButton();
        rbEtapa = new javax.swing.JRadioButton();
        rbPuntonet = new javax.swing.JRadioButton();
        rbNetlife = new javax.swing.JRadioButton();
        rbOnnet = new javax.swing.JRadioButton();
        rbPanchonet = new javax.swing.JRadioButton();
        rbTvcable = new javax.swing.JRadioButton();
        rbInteractive = new javax.swing.JRadioButton();
        rbTelconet = new javax.swing.JRadioButton();
        rbOtros = new javax.swing.JRadioButton();
        txtOtros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbCalidad1 = new javax.swing.JRadioButton();
        rbCalidad2 = new javax.swing.JRadioButton();
        rbCalidad3 = new javax.swing.JRadioButton();
        rbCalidad4 = new javax.swing.JRadioButton();
        rbCalidad5 = new javax.swing.JRadioButton();

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("CLARO - CUESTIONARIO EMPRESAS (SVA) - Internet");

        jLabel13.setText("Buenos días / tardes soy ________ entrevistador/a de DATANALISIS, empresa de investigación de mercados.  ");

        jLabel14.setText("Estamos haciendo una encuesta sobre servicios de internet a diferentes empresas en todo el país y quisiera ");

        jLabel15.setText("hacerle algunas preguntas.  Sus respuestas serán estrictamente confidenciales y serán usadas para obtener ");

        jLabel16.setText("datos estadísticos de toda la población. Le ruego que sus respuestas sean concretas y sobre todo muy honestas.  ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Proveedor de Internet");

        jLabel18.setText("1. ¿Qué empresa o empresas le proveen actualmente el servicio de Internet?");

        rbClaro.setText("Claro");

        rbMovistar.setText("Movistar");

        rbCnt.setText("CNT - Easynet");

        rbEtapa.setText("Etapa");

        rbPuntonet.setText("Puntonet");

        rbNetlife.setText("Netlife");

        rbOnnet.setText("Onnet");

        rbPanchonet.setText("Panchonet");

        rbTvcable.setText("Tv cable");

        rbInteractive.setText("Interactive");

        rbTelconet.setText("Telconet");

        rbOtros.setText("Otros");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("(E: CONTINUE SOLO SI ENTREVISTADO ES O FUE USUARIO DE CLARO, CASO CONTRARIO REGISTRE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("EN DATOS DE CLASIFICACIÓN Y TERMINE LA ENTREVISTA)");

        jLabel19.setText("2. ¿Hace cuánto tiempo son clientes del servicio de Internet de Claro?");

        jLabel3.setText("En años");

        jLabel20.setText("3. ¿En la escala del 1 al 5 siendo 1 Muy malo y 5 Muy Bueno, como percibe Ud. la amabilidad y cortesía de la gente ");

        jLabel21.setText("de CLARO que en alguna ocasión les atendieron por alguna situación relacionada al servicio de Internet de su ");

        jLabel22.setText("empresa?");

        jLabel4.setText("Muy malo");

        jLabel5.setText("Malo");

        jLabel6.setText("Aceptable");

        jLabel7.setText("Bueno");

        jLabel8.setText("Muy bueno");

        rbCalidad1.setText("1");

        rbCalidad2.setText("2");

        rbCalidad3.setText("3");

        rbCalidad4.setText("4");

        rbCalidad5.setText("5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbClaro)
                                            .addComponent(rbMovistar)
                                            .addComponent(rbCnt))
                                        .addGap(116, 116, 116)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbOnnet)
                                            .addComponent(rbPanchonet)
                                            .addComponent(rbTvcable)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbEtapa)
                                            .addComponent(rbPuntonet)
                                            .addComponent(rbNetlife))
                                        .addGap(142, 142, 142)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbTelconet)
                                            .addComponent(rbInteractive)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(rbOtros)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbCalidad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbCalidad2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5)))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbCalidad3)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(rbCalidad4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rbCalidad5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbClaro)
                    .addComponent(rbOnnet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMovistar)
                    .addComponent(rbPanchonet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCnt)
                    .addComponent(rbTvcable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEtapa)
                    .addComponent(rbInteractive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPuntonet)
                    .addComponent(rbTelconet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNetlife)
                    .addComponent(rbOtros)
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCalidad1)
                    .addComponent(rbCalidad2)
                    .addComponent(rbCalidad3)
                    .addComponent(rbCalidad4)
                    .addComponent(rbCalidad5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgCalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbCalidad1;
    private javax.swing.JRadioButton rbCalidad2;
    private javax.swing.JRadioButton rbCalidad3;
    private javax.swing.JRadioButton rbCalidad4;
    private javax.swing.JRadioButton rbCalidad5;
    private javax.swing.JRadioButton rbClaro;
    private javax.swing.JRadioButton rbCnt;
    private javax.swing.ButtonGroup rbEmpresas;
    private javax.swing.JRadioButton rbEtapa;
    private javax.swing.JRadioButton rbInteractive;
    private javax.swing.JRadioButton rbMovistar;
    private javax.swing.JRadioButton rbNetlife;
    private javax.swing.JRadioButton rbOnnet;
    private javax.swing.JRadioButton rbOtros;
    private javax.swing.JRadioButton rbPanchonet;
    private javax.swing.JRadioButton rbPuntonet;
    private javax.swing.JRadioButton rbTelconet;
    private javax.swing.JRadioButton rbTvcable;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
