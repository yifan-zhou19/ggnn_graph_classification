package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		for (int i = 2;i <= Math.sqrt(n);i++)
		{
		if (n % i == 0)
		{
		return 0;
		}
		}
		return 1;
	}
	public static int g(int n)
	{
		int i = 0;
		int[] a = new int[20];
		int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * q;
		int q;
		while (n != 0)
		{
			a[i] = n % 10;
			n = n / 10;
			i++;
		}
		q = a[i - 1];
		while (p[0] == q && p <= q)
		{
			p++;
			q--;
		}
		if (p >= q)
		{
			return 1;
		}
		if (p < q)
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (f(i) == 1 && g(i) == 1)
			{
			  if (t == 0)
			  {
			 System.out.printf("%d",i);
			  }
			  if (t > 0)
			  {
			 System.out.printf(",%d",i);
			  }
			  t = 1;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
		return 0;
	}


}

