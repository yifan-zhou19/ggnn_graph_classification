package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 a = m / 100;
	 System.out.printf("%d\n",a);
	 m = m - a * 100;
	 a = m / 50;
	 System.out.printf("%d\n",a);
	 m = m - a * 50;
	 a = m / 20;
	 System.out.printf("%d\n",a);
	 m = m - a * 20;
	 a = m / 10;
	 System.out.printf("%d\n",a);
	 m = m - a * 10;
	 a = m / 5;
	 System.out.printf("%d\n",a);
	 m = m - a * 5;
	 a = m / 1;
	 System.out.printf("%d\n",a);
	 m = m - a * 1;


	   return 0;
	}


}

