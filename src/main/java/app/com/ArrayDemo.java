package app.com;

import java.util.concurrent.atomic.AtomicLong;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int testArray[] = {1,2,053,4,5};
        System.out.println("testArray.length: "+testArray.length); // output: testArray.length: 5
        
        AtomicLong idGenerator = new AtomicLong();
        System.out.println(idGenerator.getAndIncrement());
        System.out.println(idGenerator.getAndIncrement());
        System.out.println(idGenerator.getAndIncrement());
        System.out.println(idGenerator.getAndIncrement());
        System.out.println(idGenerator.getAndIncrement());
        System.out.println(idGenerator.getAndIncrement());
	}

}
