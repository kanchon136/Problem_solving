package mathMeticalpractice.com.problemSolving;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.Consumer;

public class ProblemSolving {
	
	public static void main(String[] arg) throws InterruptedException {
		
//	System.out.println("=======how do you remove spaces from a String=======");
//	String value = "adfd  fadsfasfas";
//	
//	removeWhiteSpaces(value);
//	
//	System.out.println("=============================");
//	
//	String st = "sdfdf dev\n";
//	st = st.strip();
//	
//	System.out.println(st);
//	
//	
//	 String sd = """
//	 		
//	 		""";
//	 
//	 
//	 int [] array = {1,2,3,4,5,6,7};
//	 System.out.println("array length==="+array.length);
//	 Random random = new Random();
//	
//	 
//	 for (int i = 0; i < array.length; i++) {
//		 int  randomIndexToswap = random.nextInt(array.length);
//		 System.out.println("randomInt==="+randomIndexToswap);
//		 int temp = array[randomIndexToswap];
//		 array[randomIndexToswap]= array[i];
//		 array[i]= temp;  
//	}
//	 
//	 Arrays.stream(array).forEach(System.out::println);
//	 
//	 
//	System.out.println("==========swap two variable value without third varible======");
//	
//	 int a= 10;
//	 int b = 20; 
//	 b = a+b;
//	 a = b-a;
//	 b= b-a;
//	 
//	 System.out.println("=========+a=:"+a +"b="+b);
//	 
//	 System.out.println("Resvers a String withus in buil function");
//	 
//	 String input = "kanchon";
//	 
//	 char [] chararay = input.toCharArray();
//	 StringBuilder reversevalue = new StringBuilder();
//	 System.out.println("chararay last value ="+chararay[chararay.length-1]);
//	 for(int i = chararay.length-1; i>=0;i--) {
//		 System.out.println(chararay[i]);
//		 reversevalue.append(chararay[i]);	 
//	 }
//	  
//	  System.out.println("reversevalue=:"+reversevalue);
//	  
//	  
//	  
//	int [] [] arrtwo = new int [10][20];
//	
//	for (int i = 0; i < arrtwo.length; i++) {
//		 for (int j = 0; j < arrtwo[i].length; j++) { 
//			 arrtwo[i][j]=i*j;	
//		}	
//	}
//	System.out.println("=================two dimension array=======================");
//	for(int i =0; i<arrtwo.length; i++) {
//		for(int j=0; j<arrtwo[i].length; j++) {
//			System.out.println(arrtwo[i][j]);
//		}
//	}
	 
	
//	 int[][][][]arrkk =  new int [3][3][4][6];
//	 
//	   for(int i=0;i<arrkk.length;i++) {
//		    for(int b=0;b<arrkk[i].length;b++) {  
//		    	for(int c=0;c<arrkk[b].length;c++) {
//		    		for(int d=0;d<arrkk[c].length; d++) {
//		    			arrkk[i][b][c][d]= i+b+c+d;
//		    		}
//		    		
//		    	}
//		    }
//	   }
	  
	// int c = hasVowel("kanchon");
	// System.out.println(c);
//		System.out.println("============find the first repeted character is s string using stream api======================");
//		String input = "Java Hungry Blog Alive is Awesome";
//		
//		 Character result = input.chars() // Stream of String       
//                 .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
//                 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
//                 .entrySet()
//                 .stream()
//                 .filter(entry -> entry.getValue() > 1L)
//                 .map(entry -> entry.getKey())
//                 .findFirst()
//                 .get();
//		 
//		 List<Character> chars = input.chars()
//				 .mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s))).toList();
//		 chars.stream().filter(f->!Character.isWhitespace(f)).toList().forEach(System.out::println);
//		 
//		// find a first repeted cahracter from  a string using stream api 
//		//  Map<Character, Long>
//		 Character	 tongv= input.chars().mapToObj(o-> Character.toLowerCase(Character.valueOf((char)o)))
//				 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//				 .entrySet().stream().filter(f-> f.getValue()>1L)
//				 .map(f->f.getKey()).findFirst().orElseGet(null);
//		 
//		 System.out.println("kkkk===="+tongv);
//		 
//		 System.out.println("================How to find duplicate element from a IntegerList using stream api=====================");
//		 
//		 
//		 List<Integer> intlist = Arrays.asList(200,600,100,900,200,20000,10);
//		 
//		// List<Integer> Map<Integer,Long>
//		 List<Integer>	 duplilist = intlist.stream()
//				 .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//				 .entrySet().stream().filter(f-> f.getValue()>1L)
//				 .map(m->m.getKey()).toList();
//  
//	
//	System.out.println("duplilist"+duplilist);
//	
//	System.out.println("find out all the number which number shatring wiht 1 form a integer lit using streem");
//	
//	List<Integer> inlst = Arrays.asList(2,34,5,6,7,1,78,8,9,7,7,7,7,55,411,120,146);
//	
//	List<String> listStartwithone = inlst.stream().map(m->m+"").filter(f->f.startsWith("1")).toList();
//	
//	System.out.println("listStartwithone==="+listStartwithone);
//	
//	
//	System.out.println("==find out all the even numbers exist in the list using Stream functions=");
//	
//	List<Integer> allEvenList = inlst.stream().filter(f -> f > 1 && f % 2 == 0).collect(Collectors.toList());
//	
//	Integer allOddSum = inlst.stream().filter(f-> f%2!=0).reduce(0, (a,b)-> a+b);
//	int firstsum = inlst.stream().filter(f->f%2!=0).mapToInt(Integer::intValue).sum();
//	Integer secondSum = inlst.stream().filter(f->f%2!=0).reduce(Integer::sum).orElse(0);
//	int thirdsum = inlst.stream().filter(f->f%2!=0).collect(Collectors.summingInt(Integer::intValue));
//	IntSummaryStatistics statistics = inlst.stream().filter(f->f%2!=0).collect(Collectors.summarizingInt(Integer::intValue));
//	System.out.println("toatl count="+statistics.getCount());
//	System.out.println("toatl sum ==="+statistics.getSum());
//	System.out.println("max value ==="+statistics.getMax());
//	System.out.println("min value  ==="+statistics.getMin());
//	Long totalcount =  statistics.getCount();
//	double totoalSum = statistics.getSum();
//	int maxvalue = statistics.getMax();
//	int minvalue = statistics.getMin();
//	double averagee = statistics.getAverage();
//	
//	System.out.println("===============core java problem solving==================");
//	
//	
//	
//	
//	System.out.println("min average  ==="+statistics.getAverage());
//    
//	
//	
//	//		 
////		 Set<Integer> set = new HashSet<>();
////		  intlist.stream()
////				 .filter(f-> !set.add(f)).forEach(System.out::println);
//		  
//	boolean n = isPrime(127);	
//	System.out.println(" prime  ==="+n);
//	
//	
//	System.out.println(" fibonacciSeriese  ==="+n);
// 
// 
//		
// for(int i=0; i<5; i++) {
//	 System.out.println(fibonacciRecursion(i)+"");
// }
//	
// 
// 
//     boolean palindrom = checkPalindrome("MADAM");
//     System.out.println("palindrom=:"+palindrom);
//	
//     String spacesString = "How do you remove spaces form a string in java";
//     String valunonSpces = removeWhiteSpaces(spacesString);
//     System.out.println("valunonSpces=:"+valunonSpces);
//     
//     
//     
//     
////     Object obj1 = new Object();
////     Object obj2 = new Object();
////     Object obj3 = new Object();
//// 
////     Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1");
////     Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2");
////     Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");
////     
////     t1.start();
////     Thread.sleep(5000);
////     t2.start();
////     Thread.sleep(5000);
////     t3.start();  
     System.out.println("============java 8 Function=================");
     
     String [] countries = {"India", "Australia", "England", "South Africa", "Srilanka", "Newzealand", "West Indies", "Scotland"};
    Function<String[], String> converter = (all)->{
    	String resalt ="";
    	for(String n1:all) {
    		String s= n1.substring(0, n1.indexOf(""));
    		s = n1.substring(n1.indexOf(""))+" "+s;
    		resalt += s+ " ";	
    	}
    	
    	return resalt;
    };
     
       
    
    System.out.println(converter.apply(countries));
    
    System.out.println("===========java function Supplier===========================");
    listWithBegin(Arrays.asList(countries), (s)-> s.startsWith("I"));
    
    
    
    BiFunction<String, Integer, String> repeater= (st,num)-> {
    	StringBuilder s = new StringBuilder();
    	for(int i=0; i<num;i++) {
    	   s.append(st).append(",")	;
    	}
    	return s.toString();
    };
    
    System.out.println(repeater.apply("Kanchon", 5));
    
    
    Order order = new Order(150.00);
    
    BiFunction<Double, Double, Double> discountedPrice= (price,discountRate)-> price*(1-discountRate);
    BiFunction<Double, Double, Double> discountPrice = (price,discountRate)->  price*discountRate;
    
    double discountrate = discountPrice.apply(order.getPrice(), 0.20);
    System.out.println("discountrate==:"+discountrate);
    
    double pricebyfunciton = discountedPrice.apply(order.getPrice(), 0.20);
    
    System.out.println("pricebyfunciton==:"+pricebyfunciton);
    
    System.out.println("=====================UnaryOperator  It represents an operation on a single operand that produces a result of the same type as its operand=======================");
     String originaltext = " unaryOperator function";
     UnaryOperator<String> tremerlamda= text-> text.trim();
     UnaryOperator<String> trimmerMethodrefe = String::trim;
     UnaryOperator<String> upperLamda = t-> t.toUpperCase();
     UnaryOperator<String> lowerMehodRefe = String::toLowerCase;
     UnaryOperator<String> addSufix = s-> s+"SuFFIX";
     
     String stranformatedString = tremerlamda.andThen(upperLamda).andThen(addSufix).apply(originaltext);
       System.out.println("stranformatedString==  "+stranformatedString);
      
       List<Double> celciusTemparatures = Arrays.asList(0.00,20.00,21.00,15.00,32.00);
     
     UnaryOperator<Double> celciusToFerenHight = celsius->(celsius*9/5)+32;
     
     List<Double> fehenHightTempatures = convertTempeture(celciusTemparatures, celciusToFerenHight);
     for(int i=0;i<fehenHightTempatures.size();i++) {
    	 System.out.println("celciusTemparatures==: "+celciusTemparatures.get(i)+ "  fehenHightTempatures==: "+fehenHightTempatures.get(i));
     }
     
     
     System.out.println("================BinaryOperator======================");
     BinaryOperator<Integer> add = (a,b)-> a+b;
     System.out.println("Mathmetical Operation using Binary Operator=:"+add.apply(3, 6));
     BinaryOperator<String> concatst =(c,k)-> c.concat(k);
     System.out.println("string concat=:"+concatst.apply("t", "K"));
     BinaryOperator<Integer> maxvalue = BinaryOperator.maxBy(Comparator.naturalOrder());
     
     System.out.println(maxvalue.apply(30, 20));
     
     BinaryOperator<List<Integer>> margeList = (list1,list2)->{
    	 List<Integer> margedlist = new ArrayList<>(list1);
    	 margedlist.addAll(list2);
    	 
    	 return margedlist;
     };
     
    System.out.println("Consumer functinal interface in java represents an operation that accept one argumrnt and returns no results");
    
    List<String> consumStringlist = Arrays.asList("Function","Consumer","Supplier","Predicate");
    Consumer<String> consume1 = System.out::println;
    
     Map<String, Integer> nameAndGrade = new HashMap<>();
     nameAndGrade.put("english", 100);
     nameAndGrade.put("Bangla", 90);
     nameAndGrade.put("Physics", 34);
     
     BiConsumer<String, Integer> printmap = (name,grade)-> System.out.println(name +" = "+grade);
     
     nameAndGrade.forEach(printmap);
     
     System.out.println("=we can use biconsumer to aggrigade data from two sources into third one ");
//     List<String> products = Arrays.asList("shirt","panjabi");
//     List<Integer> quantities = Arrays.asList(100,200);
//     Map<String, Integer> productAndQuantities= new HashMap<>();
//     
//     BiConsumer<String, Integer> addToMap = productAndQuantities::put;
//     
//     IntStream.range(0, products.size())
//     .forEach(i-> addToMap.accept(products.get(i), quantities.get(i)));
//     BiConsumer<String, Integer> printMap = (key, value)-> System.out.println(key+"="+value);
//     productAndQuantities.forEach(printMap);
     
     List<String> products = Arrays.asList("a","b","c");
     List<Integer> quantities = Arrays.asList(20,30,5);
     
     Map<String, Integer> productAndQuantityMap= new HashMap<>();
     
     BiConsumer<String, Integer> addToMap = productAndQuantityMap::put;
     IntStream.range(0, products.size())
     .forEach(i-> addToMap.accept(products.get(i), quantities.get(i)));
     
     BiConsumer<String, Integer> printMap = (key,value)-> System.out.println(key+"== "+value);
     productAndQuantityMap.forEach(printMap);
     
     for(Map.Entry<String, Integer> entry : productAndQuantityMap.entrySet()) {
    	 System.out.println(entry.getKey()+" = "+ entry.getValue());
     } 
     
     Supplier<LocalDate> localdate =  LocalDate::now;
     LocalDate date = localdate.get();
     System.out.println("date===:"+date);
     
    
//     for(Map.Entry<String, Integer> entry :  productAndQuantities.entrySet() ) {
//    	 System.out.println("key="+entry.getKey()+"  value=:"+entry.getValue());
//     }
      
      System.out.println("========================");
       
	} // main method block
	 
	
	 public static<T> List<T> convertTempeture(List<T> temperatures, UnaryOperator<T> converter){
		List<T> convertedTemperatures = new ArrayList<>();
		for(T t: temperatures) {
			convertedTemperatures.add(converter.apply(t));
		} 
		 return convertedTemperatures;
	 }
	
	private static void printName(Supplier<String> arg) {
		   System.out.println(arg.get());
	}
	
	public static void listWithBegin(List<String> list, Predicate<String> valid) {
		printName(()-> "List of countries");
		list.forEach(country-> {
			if(valid.test(country)) {
				printName(()-> country);
			}
		});
		
		
	}
	
	
	

	// how can you find the factorial in an integer in java 
	
	public static int findFactorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("value not pass less than one");
		}
		
		int result = 1;
		for(int i =1; i<n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static BigInteger factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("value not less than 0");
		}
		
		BigInteger bigint = BigInteger.ONE;
		 for(int i =1;i<n;i++) {
			 bigint = bigint.multiply(BigInteger.valueOf(i)); 
		 }
		 return bigint;
	}
	
	//  how do you remove spaces from a string in java;
	
	public String removeSpaces(String value) {
		
		char [] ch = value.toCharArray();
		StringBuilder b = new StringBuilder();
		for(int i=0; i<ch.length;i++) {
			if(!Character.isWhitespace(i)) {
				b.append(i);
			}
		}
		return b.toString();
	}
	
	
	
	
	
	//How do you chec whether a String is Palindrome in java;
	
	public static boolean checkPalindrome(String n ) {
		int length = n.length();
		System.out.println("length=:"+length);
		//mam
		for(int i=0;i<length/2;i++) {
			System.out.println(n.charAt(i)+"   "+n.charAt(length-i-1));
			if(n.charAt(i) != n.charAt(length-i-1)) {
				 
				return false;
			}
		}
		return true;
	}
	
	public static boolean isBooleanInList(List<Integer>list) {
		return list.parallelStream().anyMatch(m->m %2!=0);
	}
	
	public static boolean checkOddNumber(List<Integer> list) {
		  for(int i: list) {
			  if(i%2==0) {
				  return false;
			  }
		  }
		  return true;
	}
	
	public static boolean ifContainOddNumberinList(List<Integer> list) {
		
		if(list.isEmpty() && list != null) {
			for(Integer i: list) {
				if(i%2==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	

	public static int fibonacciRecursion(int n) {
		if(n <=1) {
			return n;
		}
		
		return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
		
	}
	
public static void printFebonacciSequence(int number) {
	int a = 0;
	int b = 1;
	int c = 1;
	
	for(int i=1; i<=number; i++) {
		System.out.println(a);
		
		a = b;
		b = c;
		c = a+b;
	}
	
	
}
	
	 public static boolean isPrime(int n) {
		 if(n==0|| n==1) {
			 return false;
		 }
		 if(n==2) {
			 return true;
		 }
		 
		 for(int i=2; i<=n/2;i++) {
			 if(n%i==0) {
				 System.out.println("index of matching=:"+i);
				 return false;
			 }
		 }
		 
		 return true;
	 }
	
	public static boolean hasVowel(String s) {
		  if(s == null && s.isBlank()) {
			  return false;
		  }
		  
		  s = s.toLowerCase();
		  
		  for(char c : s.toCharArray())
		  {
			  if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u') {
				  return true;
			  }
		  }
		
		return false;
	}
	 
	
	static String removeWhiteSpaces(String input ) {
		StringBuilder stbuilder= new StringBuilder();
		
		char [] chararray = input.toCharArray();
		 for (char c: chararray) {
			 if(!Character.isWhitespace(c)) {
				stbuilder.append(c); 
			 }
		}
		System.out.println(stbuilder.toString());
		return stbuilder.toString();
		
	}
	

}

@FunctionalInterface
interface test{
String	test();
default String test1() {
	return null;
}
static boolean checkNull() {
	return false;
			
}
	
}



class SyncThread implements Runnable{
    private Object ob1;
    private Object ob2;
    
     public SyncThread(Object o1,Object o2) {
    	 this.ob1= o1;
    	 this.ob2=o2;
     }
	
	
     @Override
     public void run() {
         String name = Thread.currentThread().getName();

         System.out.println(name + " acquiring lock on " + ob1);
         synchronized (ob1) {
             System.out.println(name + " acquired lock on " + ob1);
             work();
             System.out.println(name + " acquiring lock on " + ob2);
             synchronized (ob2) {
                 System.out.println(name + " acquired lock on " + ob2);
                 work();
             }
             System.out.println(name + " released lock on " + ob2);
         }
         System.out.println(name + " released lock on " + ob1);
         System.out.println(name + " finished execution.");
     }
	
	private void work() {
		try {
		Thread.sleep(30000);	
		}catch (InterruptedException e) {
		  System.out.println(e.getMessage());
		}
	}
	
}

 class Order{
	 private double price;
	 
	 
	 
	 

	public Order(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 
	 
	 
 }
