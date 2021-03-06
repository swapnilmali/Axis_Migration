package com;

public class CalculatorProxy implements com.Calculator {
  private String _endpoint = null;
  private com.Calculator calculator = null;
  
  public CalculatorProxy() {
    _initCalculatorProxy();
  }
  
  public CalculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculatorProxy();
  }
  
  private void _initCalculatorProxy() {
    try {
      calculator = (new com.CalculatorServiceLocator()).getCalculator();
      if (calculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculator != null)
      ((javax.xml.rpc.Stub)calculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.Calculator getCalculator() {
    if (calculator == null)
      _initCalculatorProxy();
    return calculator;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.add(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.sub(a, b);
  }
  
  public int mul(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.mul(a, b);
  }
  
  public int div(int a, int b) throws java.rmi.RemoteException{
    if (calculator == null)
      _initCalculatorProxy();
    return calculator.div(a, b);
  }
  
  
}