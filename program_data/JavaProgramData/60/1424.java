package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int m = 0;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n - 2;a++)
		{
			for (i = 2;i <= a / 2;i++)
			{
			   if (a % i == 0)
			   {
				   break;
			   }
			}
			if (i == a / 2 + 1)
			{
			   b = a + 2;
			   for (c = 2;c <= b / 2;c++)
			   {
				  if (b % c == 0)
				  {
					  break;
				  }
			   }
			   if (c == b / 2 + 1)
			   {
				  m++;
				  System.out.printf("%d %d\n",a,b);
			   }
			}
		}
		 if (m == 0)
		 {
			 System.out.print("empty");
		 }
	}



}

