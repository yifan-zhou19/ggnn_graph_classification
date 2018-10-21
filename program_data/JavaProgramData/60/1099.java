package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s = 2;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == i)
			{
				count++;
				if ((i - s) == 2)
				{
					System.out.printf("%d %d\n",s,i);
				}
				s = i;
			}
		}
		if ((count == 0) || n == 3 || n == 4)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

