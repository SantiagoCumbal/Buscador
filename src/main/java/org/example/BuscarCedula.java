package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class BuscarCedula {
    private JPanel CedulaPanel;
    /*private JButton buscarButton;
    private JTextField consultar;
    private JLabel resultado;
    public JPanel MainPanel;
    private JButton BUSCARPORNOMBREButton;
    private JButton BUSCARPORCEDULAButton;
    String url="jdbc:mysql://localhost:3306/EstudiantesA24";
    String user="root";
    String password="123456";

    public BuscarCedula() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(Connection connection= DriverManager.getConnection(url,user,password)){
                    System.out.println("Conexion exitosa");
                    String query="select * from estudiantesA where cedula='"+consultar.getText()+"'";
                    Statement statement=connection.createStatement();
                    ResultSet resultSet=statement.executeQuery(query);
                    while(resultSet.next()){
                        System.out.println(resultSet.getString("nombre"));
                        resultado.setText(resultSet.getString("nombre"));
                    }
                }
                catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
            }
        });*/



}
