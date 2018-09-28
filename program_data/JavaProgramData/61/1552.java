package <missing>;

public class GlobalMembers
{
	public static int Fibonacci(int x)
	{
		int i;
		int p;
		int q;
		int m;
		int result;
		p = 1;
		q = 1;
		if (x == 1)
		{
			result = p;
		}
		else if (x == 2)
		{
		result = q;
		}
		else if (x > 2)
		{
			for (i = 3;i <= x;i++)
			{
			m = p + q;
			p = q;
			q = m;
			}
			result = q;
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int n;
		int[] p = new int[30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p[i] = Integer.parseInt(tempVar2);
		 }
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",Fibonacci(p[i]));
		}
		return 0;
	}

}

