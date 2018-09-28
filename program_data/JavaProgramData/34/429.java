package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int q)
	{
		if (q % 2 != 0)
		{
			System.out.printf("%d*3+1=%d\n",q,q * 3 + 1);
			q = q * 3 + 1;
		}
		else if (q % 2 == 0)
		{
			System.out.printf("%d/2=%d\n",q,q / 2);
			q = q / 2;
		}
		return q;
	}

	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 1)
		{
		for (i = 0;;i++)
		{
			n = jiaogu(n);
			if (n == 1)
			{
				break;
			}
		}
		}
		System.out.print("End");
		return 0;
	}

}

