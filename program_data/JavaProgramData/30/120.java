package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int jieguo = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if ((i - 7) % 10 == 0)
			{
				jieguo = jieguo;
			}
			else if ((i / 10) == 7)
			{
				jieguo = jieguo;
			}
			else if (i % 7 == 0)
			{
				jieguo = jieguo;
			}
			else
			{
				jieguo += i * i;
			}
		}
		System.out.printf("\n%d",jieguo);
		return 0;
	}

}

