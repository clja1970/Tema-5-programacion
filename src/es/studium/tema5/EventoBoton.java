package es.studium.tema5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoBoton implements ActionListener, WindowListener
{
        Frame ventana = new Frame();
        Button btnAceptar = new Button("Aceptar");
        Button btnCancelar = new Button("Cancelar");
        Button btnVolver = new Button("Volver");
        Button btnSalir = new Button("Salir");

        public EventoBoton()
        {
                ventana.setTitle("Eventos");
                ventana.setSize(230,100);
                ventana.setLayout(new FlowLayout());
                btnAceptar.addActionListener(this);
                btnCancelar.addActionListener(this);
                btnVolver.addActionListener(this);
                btnSalir.addActionListener(this);
                ventana.addWindowListener(this);
                ventana.add(btnAceptar);
                ventana.add(btnCancelar);
                ventana.add(btnVolver);
                ventana.add(btnSalir);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);
        }

        public static void main(String[] args)
        {
                new EventoBoton();
        }

        @Override
        public void actionPerformed(ActionEvent eventoGenerado)
        {
                if(eventoGenerado.getSource().equals(btnAceptar))
                {
                        System.out.println("Pulsaste el botón ACEPTAR...");
                }
                else if(eventoGenerado.getSource().equals(btnCancelar))
                {
                        System.out.println("Pulsaste el botón CANCELAR...");
                }
                else if(eventoGenerado.getSource().equals(btnVolver))
                {
                        System.out.println("Pulsaste el botón VOLVER...");
                }
                else if(eventoGenerado.getSource().equals(btnSalir))
                {
                        System.out.println("Hasta luego Lucas...");
                        System.exit(0);
                }
        }

        @Override
        public void windowActivated(WindowEvent arg0)
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void windowClosed(WindowEvent arg0)
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void windowClosing(WindowEvent arg0)
        {
                System.exit(0);
        }

        @Override
        public void windowDeactivated(WindowEvent arg0)
        {
                // TODO Auto-generated method stub
                
        }

        @Override
        public void windowDeiconified(WindowEvent arg0)
        {
                System.out.println("Me han restaurado...");
                
        }

        @Override
        public void windowIconified(WindowEvent arg0)
        {
                System.out.println("Me han minimizado...");
                
        }

        @Override
        public void windowOpened(WindowEvent arg0)
        {
                // TODO Auto-generated method stub
                
        }
}