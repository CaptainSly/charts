package eu.hansolo.fx.charts.event;

/**
 * Created by hansolo on 16.07.17.
 */
@FunctionalInterface
public interface ChartModelEventListener {
    void onModelEvent(final ChartModelEvent EVENT);
}
