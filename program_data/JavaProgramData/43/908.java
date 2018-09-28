package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int a;
	 int b;
	 int i;
	 int j;
	 int mult;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 a = 2;
	 while (a <= (m + 1) / 2)
	 {
		 mult = 1,i = 2;
			 while (i < a)
			 {
				 mult = mult != 0 && (a % i);
				 i++;
			 }
			 if (mult != 0)
			 {
				 b = m - a,mult = 1,i = 2;
				 while (i < b)
				 {
					 mult = mult != 0 && (b % i);
					 i++;
				 }
				 if (mult != 0)
				 {
					 System.out.printf("%d %d\n",a,b);
				 }
			 }
		a++;
	 }
	}
}

