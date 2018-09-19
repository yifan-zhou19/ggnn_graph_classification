package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		x = n;
		while (m >= 1)
		{
			n = x;
			while (n >= 1)
			{
			  if (m == n)
			  {
				System.out.printf("%d\n",m);
				break;
			  }
			  n = n / 2;
			}
			if (m == n)
			{
				break;
			}
			m = m / 2;
		}
	}

}

