package es.studium.tema5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;



public class CelsiusaFahrenheit extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	//Creamos los botones
	Button btnC_F = new Button("Celsius a Fahrenheit");
	Button btnF_C = new Button("Fahrenheit a Celsius");
	// Creamos las label
	Label lblCelsius = new Label("Celsius");//3ª
	Label lblFahrenheit = new Label("Fahrenheit");
	// Creamos el texto
	TextField txtCelsius = new TextField(20);
	TextField txtFahrenheit = new TextField(20);
	
	//Constructor
	public CelsiusaFahrenheit()
	{
		setTitle("Conversion de Temperaturas");
		setLayout(new GridLayout(3,2));//4ª
		add(lblCelsius);
		add(txtCelsius);
		add(lblFahrenheit);
		add(txtFahrenheit);
		//Añadir botones
		btnC_F.addActionListener(this);
		add(btnC_F);
		btnF_C.addActionListener(this);
		add(btnF_C);
		//Añadir LIstener a la ventana
		addWindowListener(this);
		setSize(650,150);//2ª
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}


	public static void main(String[] args)
	{
		new CelsiusaFahrenheit();
	}


	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Saliendo...");
        System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent evento)
	{
		// Primero averiguar que boton genero este evento
		Object botonPulsado = evento.getSource();
		float resultado;
		if(botonPulsado==btnC_F)
		{
			resultado = (float)((Float.parseFloat(txtCelsius.getText())*9.0/5.0)+32.0);
			txtFahrenheit.setText(Float.toString(resultado));
			
		}
		else
		{
			resultado=(Float)(Float.parseFloat(txtFahrenheit.getText())-32)*(float)(5.0/9.0);
			txtCelsius.setText(Float.toString(resultado));
		}
	}
}
