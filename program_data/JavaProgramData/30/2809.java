package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		for (int i = 0;i <= n;i++)
		{
			if (i % 7 != 0 && i % 10 != 7 && i / 10 != 7)
			{
				s += i * i;
			}
		}
		System.out.printf("%d\n",s);
		return 0;
	}

}

