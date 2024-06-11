import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.DefaultCategoryDataset;


    public class ChartBuilder extends ApplicationFrame {

        public ChartBuilder(String title, int[] dataSizes, long[] executionTimes) {
            super(title);
            JFreeChart lineChart = ChartFactory.createLineChart(
                    "Execution Time vs Data Size",
                    "Data Size",
                    "Execution Time (ns)",
                    createDataset(dataSizes, executionTimes),
                    PlotOrientation.VERTICAL,
                    true, true, false);

            ChartPanel chartPanel = new ChartPanel(lineChart);
            chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
            setContentPane(chartPanel);
        }

        private DefaultCategoryDataset createDataset(int[] dataSizes, long[] executionTimes) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (int i = 0; i < dataSizes.length; i++) {
                dataset.addValue(executionTimes[i], "Execution Time", Integer.toString(dataSizes[i]));
            }
            return dataset;
        }

        public static void buildChart(int[] dataSizes, long[] executionTimes) {
            ChartBuilder chart = new ChartBuilder("Execution Time Chart", dataSizes, executionTimes);
            chart.pack();
            chart.setVisible(true);
        }
    }

