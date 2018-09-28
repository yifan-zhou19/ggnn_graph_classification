package <missing>;

public class GlobalMembers
{
	public static int print1(int q)
	{
		int r;
	r = q * 3 + 1;
		System.out.printf("%d*3+1=%d\n",q,r);
		return (r);
	}

	public static int print2(int q)
	{
		int r;
	r = q / 2;
		System.out.printf("%d/2=%d\n",q,r);
		return (r);
	}


	public static void Main()
	{
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		do
		{
			if (q == 1)
			{
				break;
			}
			if ((q % 2) == 1)
			{
				q = print1(q);
			}
			if ((q % 2) == 0)
			{
				q = print2(q);
			}
		}while (q != 1);
		System.out.print("End");
	}
}

