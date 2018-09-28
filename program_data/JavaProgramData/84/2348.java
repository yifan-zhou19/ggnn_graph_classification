package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int n;
	 int i;
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 i = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = Integer.parseInt(tempVar2);
	 }
	 a = x;
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 x = Integer.parseInt(tempVar3);
	 }
	 b = x;
	 if (a < b)
	 {
			c = b;
			b = a;
			a = c;
	 }
	for (n = 1;n <= (i - 2);n++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		   if (x >= a)
		   {
		   b = a;
		   a = x;
		   }
		   else
		   {
			  if (x > b)
			  {
			  b = x;
			  }
		   }
	}
	 System.out.printf("%d\n",a);
	 System.out.printf("%d",b);
	 return 0;
	}

}

