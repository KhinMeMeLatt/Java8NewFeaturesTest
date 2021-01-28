package streamsApi;

import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
		Stream<String> stream 
        	= Stream.of("Hello"," Everybody","!");
		
		stream.forEach(System.out::print);
		
		System.out.println();
		Stream<Integer> Intstream
			= Stream.of(1,2,3,4);
		Intstream.forEach(System.out::println);
	}
}
