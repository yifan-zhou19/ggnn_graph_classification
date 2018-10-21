package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int last1;
		int last2;
		int b;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1 || n == 2)
			{
				System.out.print("1\n");
			}
			else
			{
				last1 = 1;
				last2 = 1;

				for (b = 3;b <= n;b++)
				{
					result = last1 + last2;
					last2 = last1;
					last1 = result;
				}
				System.out.printf("%d\n",result);
			}
		}
		return 0;
	}
}

