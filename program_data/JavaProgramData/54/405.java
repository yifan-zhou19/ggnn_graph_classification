package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i = 1;
		int a;
		int b = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		a = 1;
		for (;i < n;)
		{
			for (;(n * a + k) % (n - 1) != 0;)
			{
				b = b + 1;
				a = b;
				i = 1;
			}
			a = (n * a + k) / (n - 1);
			i = i + 1;
		}
		System.out.printf("%d\n",n * a + k);
	}
}

