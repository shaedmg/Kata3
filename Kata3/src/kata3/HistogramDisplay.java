package Kata3;

import java.awt.*;
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.*;
import org.jfree.ui.ApplicationFrame;

    
    public class HistogramDisplay extends ApplicationFrame {
        
        public HistogramDisplay() {
            super("Histograma");
            setContentPane(createPanel());
            pack();
        }
        
        public void execute(){
            setVisible(true);
        }
        
        private JPanel createPanel(){
            ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
            chartPanel.setPreferredSize(new Dimension(500,400));
            return chartPanel;
        }
        
        private JFreeChart createChart (DefaultCategoryDataset dataSet){
            
            JFreeChart chart = 
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
            
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
            dataSet.addValue(15,"","ulpgc.es");
            dataSet.addValue(8,"","ull.es");
            dataSet.addValue(2,"","hotmail.com");
            dataSet.addValue(6,"","gmail.com");
            
            return dataSet;
        }
    }