package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] s = new int[1000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (s[i] + s[j] == k)
				{
					System.out.print("yes");
					return 0;
				}
			}
			for (j = i + 1;j < n;j++)
			{
				if (s[i] + s[j] == k)
				{
					System.out.print("yes");
					return 0;
				}
			}
		}
		System.out.print("no");
		return 0;
	}

}

