package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1001];
		int i;
		int p;
		int j;
		int s = 0;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			count = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				if (a[j] == 0)
				{
					count++;
				}
				if (count == 1 && a[j] != 0)
				{
					s++;
				}
			}
		}
		System.out.printf("\n%d",s);
		return 0;
	}
}

