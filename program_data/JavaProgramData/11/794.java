package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int test = int n;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m;
		int d;
		int s;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (test(y) == 1) //???
		{
		   s = d;
		   for (i = 0;i < m;i++)
		   {
		   s = s + b[i];
		   }
		}
		else
		{
		   s = d;
		   for (i = 0;i < m;i++)
		   {
		   s = s + a[i];
		   }
		}
		System.out.printf("%d",s);
		System.in.read();
		System.in.read();
	}
	public static int test(int n)
	{
		if (n % 400 == 0)
		{
			n = 1;
		}
		else
		{
		   if (n % 100 != 0 && n % 4 == 0)
		   {
		   n = 1;
		   }
		   else
		   {
			   n = 0;
		   }
		}
		   return (n);
	}

}

