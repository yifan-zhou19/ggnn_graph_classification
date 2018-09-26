package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[100000];
		int i;
		int j;
		int n = 0;
		int shan;
		int shuru;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shuru = Integer.parseInt(tempVar);
		}
		for (i = 0;i < shuru;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			shu[i] = a;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			shan = Integer.parseInt(tempVar3);
		}
		if (shuru == 1)
		{
			if (shu[0] == shan)
			{
				n = 0;
			}
			else
			{
				n = 1;
			}
		}
		if (shuru != 1)
		{
		  for (i = 0;i < shuru;i++)
		  {
			 if (shu[i] == shan)
			 {
				for (j = i;j < shuru - 1;j++)
				{
					shu[j] = shu[j + 1];

				}
				i = i - 1;
				shuru = shuru - 1;
			 }
			else
			{
					n = n + 1;
			}
		  }
		}
		if (n != 0)
		{
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.printf("%d",shu[i]);
			}
			else
			{
				System.out.printf("%d ",shu[i]);
			}
		}

		}
	   return 0;
	}
}

