package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int[] a = new int[1001];
		int i;
		int j;
		int flag = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n && flag == 0;i++)
		{
			for (j = 0;j < n && flag == 0;j++)
			{
				if (j > i && a[i] + a[j] == k)
				{
					System.out.print("yes\n");
					flag = 1;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
	}
}

