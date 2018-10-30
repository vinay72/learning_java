public class Example{
	public static void main(String []args){
	//	Integer i = Integer.valueOf("134");
		Double d = Double.valueOf("1.34");
	//	System.out.println(i+d);
		int a = Integer.parseInt("23");
	//	int x = i.intValue();
		int s=0;	
		for (int i=0;i<args.length;i++)
			s+=Integer.parseInt(args[i]);
		System.out.println(s);
	}
}
