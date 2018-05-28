package com.SNU.JS.Service;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.RList;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;
import org.springframework.stereotype.Service;

import com.SNU.JS.IService.rService;

@Service
public class rServiceImpl implements rService{

	public REXP x = null;
	public RConnection c = null;
	public String retStr = "";
	
	public rServiceImpl() throws RserveException {
		c = new RConnection();
	}
	
	@Override
	public String calR(String v1, String v2) throws RserveException, REXPMismatchException {
//			String vector = "c("+v1+","+v2+")";
//		    x = c.eval("mean("+vector+")");
//			retStr = x.asString();
//		    return retStr;
		    ///////
			
//		    REXP y = c.eval("rnorm(100,0,1)");
//		    REXP x = c.eval("rnorm(100,1,3)");
//		    REXP data = c.eval("data.frame(cbind(x,y)");
//		    REXP model = c.eval("lm("+y+"~"+x+",data="+data+")");
//
//		    REXP new_dat = c.eval("data.frame(cbind("+v1+","+v2+")");
//		    REXP test = c.eval("predict.lm("+model+",newdata="+new_dat+")");
		    
		    
			c.eval("y<-rnorm(100,0,1)");
			c.eval("x<-rnorm(100,1,3)");
			c.eval("data<-data.frame(cbind(x,y))");
			c.eval("model<-lm(y~x, data=data)");
			c.eval("new_dat<-data.frame(cbind("+v1+","+v2+"))");
			REXP test = c.eval("test<-predict.lm(model,newdata=new_dat)");
		    
		    return test.asString();
	}
}

