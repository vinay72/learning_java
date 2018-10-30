public class Example{
	public static void main(String []args){
		Double d = Double.valueOf("1.34");
		int a = Integer.parseInt("23");
		int s=0;	
		for (int i=0;i<args.length;i++)
			s+=Integer.parseInt(args[i]);
		System.out.println(s);
	}
}
