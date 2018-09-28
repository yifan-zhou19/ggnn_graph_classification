package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz1 = new int[number];
		int[] sz2 = new int[number];
		int j;
		int k;
		int l;
		int mc;
		int go;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz1[j]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz2[j]) = Integer.parseInt(tempVar3);
			}
		}
		for (l = 0;l < n;l++)
		{
			for (j = 0;j < n - l;j++)
			{
				if (sz1[j] > sz1[j + 1])
				{
					mc = sz1[j];
					sz1[j] = sz1[j + 1];
					sz1[j + 1] = mc;
					mc = sz2[j];
					sz2[j] = sz2[j + 1];
					sz2[j + 1] = mc;
				}
			}
		}
		for (j = 2;j < n + 1;j++)
		{
			go = 0;
			for (l = 1;l < j;l++)
			{
				if (sz1[j] > sz2[l])
				{
					go++;
				}
			}
			if (go == j - 1)
			{
				break;
			}
		}
		if (go == j - 1)
		{
			System.out.print("no");
		}
		else if (go != j - 1)
		{
			for (l = 1;l < n + 1;l++)
			{
				for (j = 1;j < n + 1;j++)
				{
					if (sz2[j] > sz2[j + 1])
					{
						mc = sz2[j];
						sz2[j] = sz2[j + 1];
						   sz2[j + 1] = mc;
					}
				}
			}
			 System.out.printf("%d %d", sz1[1], sz2[n + 1]);
		}
		return 0;
	}
}

