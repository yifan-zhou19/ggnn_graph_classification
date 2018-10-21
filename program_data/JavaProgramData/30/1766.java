package <missing>;

public class GlobalMembers
{
	public static int have7(int i)
	{
		if (i % 10 == 7 || (int)((i / 10)) % 10 == 7)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			if ((i % 7 != 0) && (have7(i)) != 0)
			{
				s = s + i * i;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}

}

