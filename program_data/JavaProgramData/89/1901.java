package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100000];
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		int count = 0;
		for (int l = 0;l < n;l++)
		{
			count = count + l;
		}
		for (int j = 0;j < n;j++)
		{
			int count1 = 0;
			int count2 = 0;
			for (int k = 0;k < i;k++)
			{
				if (a[k] == j)
				{
					count1++;
				}
				if (b[k] == j)
				{
					count2 = count2 + a[k];
				}
			}
			if (count1 == 0 && count2 == count - j)
			{
				System.out.printf("%d\n",j);
			}
		}
		return 0;
	}
}

