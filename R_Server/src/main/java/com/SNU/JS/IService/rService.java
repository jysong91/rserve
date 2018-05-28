package com.SNU.JS.IService;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RserveException;

public interface rService {
	public String calR(String a, String b) throws RserveException, REXPMismatchException;
}
