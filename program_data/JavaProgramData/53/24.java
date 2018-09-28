package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int n;
		int i;
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
				num[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",num[0]);
		a[num[0]] = 1;
		for (i = 1;i < n;i++)
		{
			if (a[num[i]] == 0)
			{
				System.out.printf(",%d",num[i]);
				a[num[i]] = 1;
			}
		}
		System.out.print("\n");
	}
}

