/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author sofia
 */
public class DesignCadastrarEquipa extends Design {

    public DesignCadastrarEquipa(JFrame frame) {
        super(frame);
    }

    public void JLabel(JLabel nome, JLabel username, JLabel passe, JLabel repetirPasse, JLabel tipo) {

        Dimension sizeNome = nome.getPreferredSize();
        Dimension sizeUsername = nome.getPreferredSize();
        Dimension sizePasse = nome.getPreferredSize();
        Dimension sizeRepetirPasse = nome.getPreferredSize();
        Dimension sizeTipo = nome.getPreferredSize();

        getJFrame().setLayout(null);

        nome.setBounds(70, 155, sizeNome.width, sizeNome.height);
        tipo.setBounds(70, 205, sizeTipo.width, sizeTipo.height);

        username.setBounds(400, 155, 250, sizeUsername.height);
        passe.setBounds(400, 200, 205, sizePasse.height);
        repetirPasse.setBounds(400, 255, 250, sizeRepetirPasse.height);

    }

    public void JTextField(JTextField nome, JTextField username, JTextField passe, JTextField repetirPasse) {

        Dimension sizeNome = nome.getPreferredSize();
        Dimension sizeUsername = nome.getPreferredSize();
        Dimension sizePasse = nome.getPreferredSize();
        Dimension sizeRepetirPasse = nome.getPreferredSize();
        Dimension sizeTipo = nome.getPreferredSize();

        getJFrame().setLayout(null);

        nome.setBounds(140, 150, 225, sizeNome.height);

        username.setBounds(600, 150, 225, sizeUsername.height);
        passe.setBounds(600, 200, 225, sizePasse.height);
        repetirPasse.setBounds(600, 250, 225, sizeRepetirPasse.height);

    }

    public void JCombobox(JComboBox tipo) {

        Dimension sizeTipo = tipo.getPreferredSize();

        getJFrame().setLayout(null);

        tipo.setBounds(140, 200, 225, sizeTipo.height);

    }

    public void textErro(JLabel erro) {

        Dimension sizeErro = erro.getPreferredSize();

        getJFrame().setLayout(null);

        erro.setBounds(140, 250, 225, sizeErro.height);
        
        super.textoErro(erro);
    }
}
