package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20001];
		int[] flag = new int[20001];
		int k = 0;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] == a[i])
				{
					flag[j] = 1;
				}
			}
			if (flag[i] == 0 && k == 0)
			{
					System.out.printf("%d",a[i]);
					k++;
			}
			else if (flag[i] == 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}
}

