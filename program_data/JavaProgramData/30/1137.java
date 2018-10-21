package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
		{
			if ((i % 7) != 0 && (i % 10) != 7 && (i < 70))
			{
				k = k + i * i;
			}
					if ((i % 7) != 0 && (i % 10) != 7 && (i > 79))
					{
				k = k + i * i;
					}
		}
		System.out.printf("%d",k);
		return 0;
	}


}

