package <missing>;

public class GlobalMembers
{
	public static int f(int n,int a,int b)
	{
	   int x = 0;
	   int y;
	   int i;
	   int[] m = new int[13];
	   if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0))
	   {
		   if (a > b)
		   {
			   y = f(n, b, a);
		   }
		   else
		   {
		   m[1] = 31;
		   m[2] = 29;
		   m[3] = 31;
		   m[4] = 30;
		   m[5] = 31;
		   m[6] = 30;
		   m[7] = 31;
		   m[8] = 31;
		   m[9] = 30;
		   m[10] = 31;
		   m[11] = 30;
		   m[12] = 31;
		   for (i = a;i < b;i++)
		   {
			   x = x + m[i];
		   }
		   if (x % 7 == 0)
		   {
			   y = 1;
		   }
		   else
		   {
			   y = 0;
		   }
		   }
	   }
	   else
	   {
		   if (a > b)
		   {
			   y = f(n, b, a);
		   }
		   else
		   {
		   m[1] = 31;
		   m[2] = 28;
		   m[3] = 31;
		   m[4] = 30;
		   m[5] = 31;
		   m[6] = 30;
		   m[7] = 31;
		   m[8] = 31;
		   m[9] = 30;
		   m[10] = 31;
		   m[11] = 30;
		   m[12] = 31;
		   for (i = a;i < b;i++)
		   {
			   x = x + m[i];
		   }
		   if (x % 7 == 0)
		   {
			   y = 1;
		   }
		   else
		   {
			   y = 0;
		   }
		   }
	   }
	   return (y);
	}
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int y;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			y = f(m, a, b);
			if (y == 1)
			{
				System.out.print("YES\n");
			}
			if (y == 0)
			{
				 System.out.print("NO\n");
			}
		}
		return 0;
	}



}

