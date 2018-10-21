package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] SZ = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				SZ[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (j == 0)
			{
			   System.out.printf("%d",SZ[j]);
			}
			for (int k = 0;k < j;k++)
			{
				if (SZ[j] == SZ[k])
				{
				   break;
				}
				   else if (k == j - 1)
				   {
					System.out.printf(" %d",SZ[j]);
				   }
			}
		}
		return 0;
	}
}

