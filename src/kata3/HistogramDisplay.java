/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author usuario
 */
public class HistogramDisplay  extends ApplicationFrame {

    public HistogramDisplay() {
        super("Kata3: Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel =new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400)); 
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart=
                ChartFactory.createBarChart("JFreeChart", 
                "Dominios email", 
                "Nº email", 
                dataSet, 
                PlotOrientation.VERTICAL,
                false,
                true,
                rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet=new DefaultCategoryDataset();
        dataSet.addValue(15, "", "ulpgc.es");
        dataSet.addValue(8,"","ull.es");
        dataSet.addValue(17,"","ulasdfasl.es");
        
        return dataSet;
    }
    
}
