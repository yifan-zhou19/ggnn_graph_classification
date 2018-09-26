package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] s = new int[100];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (s[j] == s[i])
				{
					s[j] = 0;
				}
			}
		}
		int a = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] == 0)
			{
				continue;
			}
			if (s[i] != 0)
			{
				System.out.printf("%d",s[i]);
				for (j = i;j < n - 1;j++)
				{
				a = a + s[j + 1];
				}
				if (a == 0)
				{
					continue;
				}
				else
				{
					System.out.print(",");
				}
			}
			a = 0;
		}
		return 0;
	}
}

