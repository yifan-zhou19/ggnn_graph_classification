package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int flag;
		int[] a = new int[300];
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
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i = i + 1)
		{
			flag = 0;
			for (k = 0;k < i;k++)
			{
				if (a[k] == a[i])
				{
					flag = 1;
				}
			}
		if (flag == 0)
		{
			System.out.printf(",%d",a[i]);
		}
		}
	}

}

