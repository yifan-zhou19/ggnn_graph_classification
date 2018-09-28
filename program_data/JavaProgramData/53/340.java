package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int[] t = new int[100];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
				if (s[i] == s[j])
				{
					s[j] = -1;
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] >= 0)
			{
				t[j++] = s[i];
			}
		}
		n = j - 1;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",t[i]);
		}
		System.out.printf("%d\n",t[n]);
	}

}

