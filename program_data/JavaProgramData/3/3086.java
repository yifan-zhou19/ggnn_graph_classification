package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int[] data = new int[n];
		int i;
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(data[i]) = Integer.parseInt(tempVar3);
			}
		}

		int j;
		int s = 0;
		for (i = 0;i < n;i = i + 1)
		{
			for (j = 0;j < n;j = j + 1)
			{
				if (i != j && data[i] + data[j] == k)
				{
					s = 1;
					break;
				}
			}
		}

		if (s == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		return (0);

	}
}

