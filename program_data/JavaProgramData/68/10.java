package <missing>;

public class GlobalMembers
{
	public static int judgment(int n)
	{
		int i;
		int a = 1;
		for (i = 2;i <= (int)(Math.floor(Math.sqrt(n)));i++)
		{
			if (n % i == 0)
			{
				a = 0;
			}
		}
		return a;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 6 ;j <= n;j = j + 2)
		{
			for (i = 3; i <= j;i = i + 2)
			{
				if ((judgment(i) == 0) || (judgment(j - i) == 0))
				{
					continue;
				}
				else
				{
					;
				}
				{
					System.out.printf("%d=%d+%d\n",j,i,j - i);
					break;
			}
			}
		}
		return 0;
	}

}

