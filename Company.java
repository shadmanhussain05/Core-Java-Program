package Thread;

public class Company {

	int n;
	
	boolean f= false;
	//if f= false: chance  : producer
	// if f=true : chance: Consume
	synchronized public void produce_item(int n) throws Exception {
		if(f)
		{
			wait();
		}
			
		
		this.n =n;
		System.out.println("produce :"+ this.n);
		f=true;
		notify();
	}
	synchronized public int consume_item() throws Exception {
		if(!f)
		{
			wait();
		}
		System.out.println("Consume :"+this.n);
	f=false;
	notify();
	return this.n;
		
	}
	
		
	}

