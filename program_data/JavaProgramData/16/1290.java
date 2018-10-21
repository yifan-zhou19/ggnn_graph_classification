package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int x;
	 int a;
	 int b;
	 int c;
	 int d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x = Integer.parseInt(tempVar);
	 }
	 a = x % 10;
	  b = (x % 100 - a) / 10;
	  c = (x % 1000 - b * 10 - a) / 100;
	  d = x / 1000;
	 if (x > 999 && x < 10000)
	 {
		 System.out.printf("%d%d%d%d\n",a,b,c,d);
	 }
	 else if (x > 99 && x < 1000)
	 {
		 System.out.printf("%d%d%d\n",a,b,c);
	 }
	 else if (x > 9 && x < 100)
	 {
		 System.out.printf("%d%d\n",a,b);
	 }
	 else if (x > 0 && x < 10)
	 {
		 System.out.printf("%d\n",a);
	 }
	 else if (x == 0)
	 {
		 System.out.print("0\n");
	 }
	 else if (x == 10000)
	 {
		 System.out.print("00001\n");
	 }

	}


}

