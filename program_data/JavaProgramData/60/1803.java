package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	if (a < 5)
	{
	 System.out.print("empty");
	}
	for (b = 3;b <= a - 2;b = b + 2)
	{
	   for (c = 2;c <= b;c++)
	   {
		d = b % c;
		 if (d == 0)
		 {
			 break;
		 }
	   }
		for (e = 2;e <= b + 2;e++)
		{
		f = (b + 2) % e;
		 if (f == 0)
		 {
			 break;
		 }
		}
	   if (c == b)
	   {
		   if (e == (b + 2))
		   {
	   System.out.printf("%d %d\n",b,b + 2);
		   }
	   }
	}
	}

}

