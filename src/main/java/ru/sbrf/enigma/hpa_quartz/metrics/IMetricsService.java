package ru.sbrf.enigma.hpa_quartz.metrics;

public interface IMetricsService {
    
    public String getVersion();
    
    public String getNamespace();
    
    public String getServiceName();
    
    public String getName();
    
    public String getValue();
    
}
