package edu.ncepu.cs.Ferriad;

import edu.ncepu.cs.wwk.incframe.IncFrame;
import edu.ncepu.ferriad.IncConfig;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncFrame inc_frame = new IncFrame("ass");
		inc_frame.setIncConf(new IncConfig(1, 1, 25, 0.05, "BPNetwork"));
		inc_frame.baseMainStart();
		inc_frame.incMainStart();
	}

}
