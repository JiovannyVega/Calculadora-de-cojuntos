/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conjuntos;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author roble
 */
public class Interfaz extends javax.swing.JFrame {

    Vector<String> universo;
    Vector<Vector<String>> lenguajes;
    Map<Character, Vector<String>> mapaLenguajes;

    public Interfaz() {
        initComponents();
        // insertar_imagen("union_c.png", Boton);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Operacion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConjuntos = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnUnion = new javax.swing.JButton();
        btnInterseccion = new javax.swing.JButton();
        btnDifSim = new javax.swing.JButton();
        btnDiferencia = new javax.swing.JButton();
        btnComplemento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtOperacion.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtOperacion.setText("(C)∁");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese las operaciones a realizar");

        Operacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Operacion.setText("Realizar operacion");
        Operacion.setIconTextGap(0);
        Operacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Ingrese los lenguajes a utilizar (Separados por llaves {})");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Historial de las operaciones realizadas");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Botones de operaciones");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Resultado Final");

        txtConjuntos.setColumns(20);
        txtConjuntos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtConjuntos.setRows(5);
        txtConjuntos.setText("{2, 4, 6, 8, 10}{1, 3, 5, 7, 9}{1, 2, 3, 4, 5}");
        jScrollPane2.setViewportView(txtConjuntos);

        txtHistorial.setColumns(20);
        txtHistorial.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtHistorial.setRows(5);
        jScrollPane4.setViewportView(txtHistorial);

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnUnion.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnUnion.setText("∪");
        btnUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnionActionPerformed(evt);
            }
        });

        btnInterseccion.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnInterseccion.setText("∩");
        btnInterseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterseccionActionPerformed(evt);
            }
        });

        btnDifSim.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnDifSim.setText("∆");
        btnDifSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDifSimActionPerformed(evt);
            }
        });

        btnDiferencia.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnDiferencia.setText("-");
        btnDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiferenciaActionPerformed(evt);
            }
        });

        btnComplemento.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        btnComplemento.setText("∁");
        btnComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComplementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addComponent(jLabel3)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane2)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 75, Short.MAX_VALUE)
                                                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 430,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(99, 99, 99))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addGap(135, 135, 135))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel5)
                                                                        .addGap(206, 206, 206))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                333,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(90, 90, 90))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(Operacion)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(btnUnion)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnInterseccion)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDifSim)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnDiferencia)
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(btnComplemento)))
                                                                        .addGap(171, 171, 171)))))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnUnion)
                                                        .addComponent(btnInterseccion)
                                                        .addComponent(btnDifSim)
                                                        .addComponent(btnDiferencia)
                                                        .addComponent(btnComplemento))
                                                .addGap(73, 73, 73)
                                                .addComponent(Operacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel3)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUnionActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "∪");
    }// GEN-LAST:event_btnUnionActionPerformed

    private void btnInterseccionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInterseccionActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "∩");
    }// GEN-LAST:event_btnInterseccionActionPerformed

    private void btnDifSimActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDifSimActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "∆");
    }// GEN-LAST:event_btnDifSimActionPerformed

    private void btnDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDiferenciaActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "-");
    }// GEN-LAST:event_btnDiferenciaActionPerformed

    private void btnComplementoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnComplementoActionPerformed
        txtOperacion.setText(txtOperacion.getText() + "∁");
    }// GEN-LAST:event_btnComplementoActionPerformed

    private void OperacionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_OperacionActionPerformed
        char abcedario = 'A';
        lenguajes = Operaciones.obtenerLenguajes(txtConjuntos.getText());
        universo = Operaciones.obtenerUniverso(lenguajes);
        mapaLenguajes = new HashMap<>();

        txtHistorial.setText("Universo: ");
        for (String Simbolo : universo) {
            txtHistorial.append(Simbolo + " ");
        }

        txtHistorial.append("\nLenguajes:");
        for (Vector<String> lenguas : lenguajes) {
            mapaLenguajes.put(abcedario, lenguas);
            txtHistorial.append("\n" + abcedario + ": " + lenguas);
            abcedario++;
        }

        validarParentesis();

        txtResultado.setText(realizarOperacion(txtOperacion.getText()).toString());

    }// GEN-LAST:event_OperacionActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    /*
     * Union ∪
     * Interseccion ∩
     * Diferencia simetrica ∆
     * Diferencia -
     * Complemento ∁
     */
    public void insertar_imagen(String imagen, JButton boton) {
        String imagePath = imagen;
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            int newWidth = 40;
            int newHeight = 40;

            Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            boton.setIcon(scaledIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void validarParentesis() {
        boolean esValida = Operaciones.validarParentesis(txtOperacion.getText());
        boolean sonValidos = Operaciones.validarCorchetes(txtConjuntos.getText());
        if (esValida && sonValidos) {
            System.out.println("Los parentesis son validos");
        } else {
            JOptionPane.showMessageDialog(this, "Los parenteis NO son validos");
        }

    }

    private static int getPrecedencia(char operador) {
        switch (operador) {
            case '∪':
            case '∩':
                return 1;
            case '∆':
            case '-':
                return 2;
            default:
                return 0; // Paréntesis
        }
    }

    public Vector<String> realizarOperacion(String expresion) {
        Stack<Character> pilaOperadores = new Stack<>();
        Stack<Vector<String>> pilaConjuntos = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);
            switch (caracter) {
                case '(':
                    pilaOperadores.push(caracter);
                    break;
                case ')':
                    while (!pilaOperadores.isEmpty() && pilaOperadores.peek() != '(') {
                        realizarOperacionBinaria(pilaOperadores, pilaConjuntos);
                    }
                    pilaOperadores.pop(); // Sacar el '(' de la pila de operadores
                    break;
                case '∪':
                case '∩':
                case '∆':
                case '-':
                    while (!pilaOperadores.isEmpty()
                            && getPrecedencia(caracter) <= getPrecedencia(pilaOperadores.peek())) {
                        realizarOperacionBinaria(pilaOperadores, pilaConjuntos);
                    }
                    pilaOperadores.push(caracter);
                    break;
                case '∁':
                    // Encontró un complemento, buscar el paréntesis de apertura correspondiente
                    int startIndex = i - 1; // Posición del primer paréntesis
                    int count = 1; // Contador para encontrar el paréntesis de cierre
                    int endIndex = -1; // Índice del paréntesis de cierre
                    int j = startIndex - 1; // Comenzar la búsqueda desde el índice anterior al paréntesis de apertura
                    while (j >= 0 && count != 0) {
                        char currentChar = expresion.charAt(j);
                        if (currentChar == '(') {
                            count--;
                            if (count == 0) {
                                endIndex = j; // Encontrado el paréntesis de cierre
                            }
                        } else if (currentChar == ')') {
                            count++;
                        }
                        j--;
                    }

                    if (endIndex != -1) {
                        // Obtener el conjunto dentro de los paréntesis
                        String conjuntoStr = expresion.substring(j + 1, startIndex);
                        // Calcular el complemento del conjunto
                        Vector<String> conjunto = realizarOperacion(conjuntoStr);
                        // Agregar el complemento a la pila
                        pilaConjuntos.push(Operaciones.complemento(conjunto, universo));
                    } else {
                        // Error: paréntesis de cierre no encontrado
                        // Manejar el error según sea necesario
                    }
                    break;
                default:
                    // Si es una letra de conjunto, agregarlo a la pila de conjuntos
                    Vector<String> conjuntoA = mapaLenguajes.get(caracter);
                    pilaConjuntos.push(conjuntoA);
                    break;
            }
        }

        // Realizar operaciones restantes si quedan en la pila de operadores
        while (!pilaOperadores.isEmpty()) {
            realizarOperacionBinaria(pilaOperadores, pilaConjuntos);
        }

        // El resultado final debe estar en la cima de la pila de conjuntos
        return pilaConjuntos.pop();
    }

    private int findClosingParenthesis(String expresion, int startIndex) {
        int count = 1;
        int i = startIndex + 1; // Comenzamos desde el siguiente carácter después del paréntesis de apertura

        while (i < expresion.length()) {
            char currentChar = expresion.charAt(i);
            if (currentChar == '(') {
                count++;
            } else if (currentChar == ')') {
                count--;
                if (count == 0) {
                    return i; // Se encontró el paréntesis de cierre correspondiente
                }
            }
            i++;
        }

        return -1; // Paréntesis de cierre no encontrado
    }

    private void realizarOperacionBinaria(Stack<Character> pilaOperadores, Stack<Vector<String>> pilaConjuntos) {
        if (!pilaConjuntos.isEmpty() && !pilaOperadores.isEmpty()) {
            char operador = pilaOperadores.pop();
            // Verificar si hay al menos dos conjuntos en la pila antes de intentar sacarlos
            if (pilaConjuntos.size() >= 2) {
                Vector<String> conjunto2 = pilaConjuntos.pop();
                Vector<String> conjunto1 = pilaConjuntos.pop();
                txtHistorial.append("\n" + conjunto1 + " " + operador + " " + conjunto2);
    
                switch (operador) {
                    case '∪':
                        pilaConjuntos.push(Operaciones.union(conjunto1, conjunto2));
                        break;
                    case '∩':
                        pilaConjuntos.push(Operaciones.interseccion(conjunto1, conjunto2));
                        break;
                    case '∆':
                        pilaConjuntos.push(Operaciones.diferenciaSimetrica(conjunto1, conjunto2));
                        break;
                    case '-':
                        pilaConjuntos.push(Operaciones.diferencia(conjunto1, conjunto2));
                        break;
                    default:
                        // No debería llegar aquí
                        break;
                }
            } else {
                // Manejar el caso en que no haya suficientes conjuntos en la pila para realizar la operación
                // Por ejemplo, puedes mostrar un mensaje de error o lanzar una excepción
            }
        } else {
            // Manejar el caso en que la pila de conjuntos o la pila de operadores estén vacías
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Operacion;
    private javax.swing.JButton btnComplemento;
    private javax.swing.JButton btnDifSim;
    private javax.swing.JButton btnDiferencia;
    private javax.swing.JButton btnInterseccion;
    private javax.swing.JButton btnUnion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtConjuntos;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextField txtOperacion;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
