package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	   int s;
	   if (n != 1)
	   {
		   if (m >= n)
		   {
			   s = f(m, n - 1) + f(m - n, n);
		   }
		else
		{
			s = f(m, n - 1);
		}
	   }
	   else
	   {
		   s = 1;
	   }
	   return s;
	}
	public static int Main()
	{
	   int t;
	   int m;
	   int n;
	   int i;
	   int s;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   if (t == 0)
	   {
		   System.out.print("0");
	   }
	   else
	   {
		 for (i = 1;i <= t;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			s = f(m, n);
			System.out.printf("%d\n",s);
		 }
	   }
	   System.in.read();
	   System.in.read();
	}

}

