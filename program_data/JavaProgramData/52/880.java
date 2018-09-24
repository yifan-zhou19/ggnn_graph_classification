package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[100];
		int i;
		int n;
		int m;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - m;i++)
		{
			temp = num[i];
			num[i] = num[n + i];
			num[n + i] = temp;
		}
		for (i = 0;i < n;i++)
		{
			num[i] = num[n - m + i];
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",num[i]);
		}
	}

}

