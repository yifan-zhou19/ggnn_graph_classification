package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n != 1)
		{
			for (k = 1;t != 1;k++)
			{
			if (n % 2 == 0)
			{
				t = n / 2;
				System.out.printf("%d/2=%d\n",n,t);
				n = t;
				if (n == 1)
				{
					break;
				}
			}
		if (n % 2 != 0)
		{
			t = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,t);
			n = t;
			if (n == 1)
			{
				break;
			}
		}
			}
		}
		System.out.print("End");

	}

}

