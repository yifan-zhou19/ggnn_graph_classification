package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int n;
		int i;
		int j;
		int flag = 0;
		int b = 0;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (num[i] == num[j])
				{
					num[j] = 0;
				}
			}
		}
		System.out.printf("%d",num[0]);
		for (i = 1;i < n;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf(",%d",num[i]);
			}
		}
		System.out.print("\n");
	}
}

