package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] k = new int[300];
		int[] s = new int[300];
		int i;
		int j;
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
			k[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (k[j] == k[i])
				{
					s[j] = 1;
				}
			}
		}
		System.out.printf("%d",k[0]);
		for (i = 1;i < n;i++)
		{
			if (s[i] == 0)
			{
				System.out.printf(",%d",k[i]);
			}
		}

	}
}

