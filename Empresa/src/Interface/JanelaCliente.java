package Interface;

import java.awt.*;
import javax.swing.*;

public class JanelaCliente extends JFrame
{
	public JLabel		texto;
	public JPanel 		portatexto, 
						login;
	public JTextField 	nome,
						cpf,
						telefone;
	public JButton 		entra;
	
	public JanelaCliente ()
	{
		/*Texto da barra superior*/
		setTitle("Empresa13 Soluções em Serviços");
		
		/*Texto de informação*/
		portatexto = new JPanel ();
		texto = new JLabel ("CLIENTE");
		texto.setHorizontalTextPosition(SwingConstants.CENTER);
		portatexto.add(texto);
		portatexto.setAlignmentX(Component.CENTER_ALIGNMENT); 
		add(portatexto, BorderLayout.PAGE_START);
		
		/*Conteudo*/
		login = new JPanel ();
		login.setLayout(new GridLayout(0, 1));
		
		login.add(new JLabel("Nome"));
		
		nome = new JTextField(20);
		JPanel portaTexto1 = new JPanel();
		portaTexto1.add(nome);
		login.add(portaTexto1);
		
		login.add(new JLabel("CPF"));
		
		cpf = new JTextField(20);
		JPanel portaTexto2 = new JPanel();
		portaTexto2.add(cpf);
		login.add(portaTexto2);
		
		login.add(new JLabel("Telefone"));
		
		telefone = new JTextField(20);
		JPanel portaTexto3 = new JPanel();
		portaTexto3.add(telefone);
		login.add(portaTexto3);
		
		add(login, BorderLayout.CENTER);

		entra = new JButton ("ENTRA");
		//entra.addActionListener(new BotaoCliente(this));
		JPanel portaBotao = new JPanel();
		portaBotao.add(entra);
		add(portaBotao, BorderLayout.PAGE_END);
		
		/*Configurações da Janela*/
		setSize(250, 250);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
