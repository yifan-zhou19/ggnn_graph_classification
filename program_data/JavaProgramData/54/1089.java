package <missing>;

public class GlobalMembers
{
	public static int f()
	{
		int n;
		int k;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int last = 0;
		while (true)
		{
			last++;
			m = last * n + k;
			int t = 1;
			for (i = 1; (i < n) && t != 0; i++)
			{
				t = (m % (n - 1) == 0);
				m = m / (n - 1) * n + k;
			}
			if (t != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n", m);

	  return 0;
	}

	public static int Main()
	{
		f();
	}

}

