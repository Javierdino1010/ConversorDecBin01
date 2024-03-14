package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConversorDecBin1 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField numDecimal;
    private JLabel numBinario;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ConversorDecBin1 frame = new ConversorDecBin1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ConversorDecBin1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        GridBagLayout gbl_contentPane = new GridBagLayout();
        gbl_contentPane.columnWidths = new int[] { 0, 0 };
        gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 25, 0 };
        gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
        gbl_contentPane.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
        contentPane.setLayout(gbl_contentPane);

        JLabel lblNewLabel = new JLabel("Decimal");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        contentPane.add(lblNewLabel, gbc_lblNewLabel);

        numDecimal = new JTextField();
        GridBagConstraints gbc_numDecimal = new GridBagConstraints();
        gbc_numDecimal.insets = new Insets(0, 0, 5, 0);
        gbc_numDecimal.gridx = 0;
        gbc_numDecimal.gridy = 1;
        contentPane.add(numDecimal, gbc_numDecimal);
        numDecimal.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Binario");
        GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
        gbc_lblNewLabel_1.gridx = 0;
        gbc_lblNewLabel_1.gridy = 2;
        contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);

        numBinario = new JLabel("");
        GridBagConstraints gbc_numBinario = new GridBagConstraints();
        gbc_numBinario.insets = new Insets(0, 0, 5, 0);
        gbc_numBinario.gridx = 0;
        gbc_numBinario.gridy = 3;
        contentPane.add(numBinario, gbc_numBinario);

        JButton Convertir = new JButton("Convertir");
        Convertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertirBinario();
            }
        });
        GridBagConstraints gbc_Convertir = new GridBagConstraints();
        gbc_Convertir.gridx = 0;
        gbc_Convertir.gridy = 4;
        contentPane.add(Convertir, gbc_Convertir);
    }

    // Función para convertir decimal a binario
    private void convertirBinario() {
        try {
            int decimal = Integer.parseInt(numDecimal.getText());
            String binario = Integer.toBinaryString(decimal);
            numBinario.setText(binario);
        } catch (NumberFormatException e) {
            numBinario.setText("Error: Ingresa un número válido");
        }
    }
}