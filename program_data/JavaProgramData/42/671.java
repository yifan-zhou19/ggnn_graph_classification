package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int num;
		int del;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			del = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < num;i++)
		{
			if (a[i] == del)
			{
				for (j = i;j < num;j++)
				{
					a[j] = a[j + 1];
				}
				num--;
				i--;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < num;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return 0;
	}

}

