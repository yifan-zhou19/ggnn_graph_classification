package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] num = new int[n];
		int de;
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			de = Integer.parseInt(tempVar3);
		}
		for (i = 0,j = 0;i < n - j;i++)
		{
			if (num[i] == de)
			{
				for (k = i;k < n - j;k++)
				{
				num[k] = num[k + 1];
				}
				j++;
				i--;
			}
		}
		for (i = 0;i < n - j - 1;i++)
		{
		System.out.printf("%d ",num[i]);
		}
		System.out.printf("%d\n",num[n - j - 1]);
	}
}

