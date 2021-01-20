package es.studium.tema5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class IVA extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	Label lblIntriduzca= new Label("Introduzca la cantidad");
	Label lblPorcentaje= new Label("Introduzca el porcentaje");
	Label lblResultado= new Label("Resultado");
	TextField Cantidad = new TextField(10);
	TextField Porcentaje = new TextField(10);
	TextField Resultado = new TextField(20);
	Button btnCalcular = new Button("Calcular");
	
	public IVA()
	{
		setResizable(false);
		setTitle("IVA");
		setLayout(new FlowLayout());
		add(lblIntriduzca);
		add(Cantidad);
		add(lblPorcentaje);
		add(Porcentaje);
		add(btnCalcular);
		add(lblResultado);
		add(Resultado);
		setSize(300,200);
		setResizable(false);
		setLocationRelativeTo(null);
		btnCalcular.addActionListener(this);
		addWindowListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new IVA();
	}
	
	@Override
	public void windowActivated(WindowEvent arg0){}
	@Override
	public void windowClosed(WindowEvent arg0){}
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0){}
	@Override
	public void windowDeiconified(WindowEvent arg0){}
	@Override
	public void windowIconified(WindowEvent arg0){}
	@Override
	public void windowOpened(WindowEvent arg0){}
	@Override
	public void actionPerformed(ActionEvent eventoGenerado)
	{
		float resultado=(float)((Float.parseFloat(Cantidad.getText()))*(Float.parseFloat(Porcentaje.getText()))/100);
			Porcentaje.selectAll();
			Porcentaje.setText("");
			Cantidad.selectAll();
			Cantidad.setText("");
			Resultado.setText(Float.toString(resultado));
	}
}
