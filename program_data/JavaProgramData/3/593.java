package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int[] a = new int[1000];

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

		int flag;
		for (i = 0;i < n;i++)
		{
			flag = 0;
			for (j = 0;j < n;j++)
			{
				if (k == a[i] + a[j])
				{
					flag = 1;
					break;
				}
			}

			if (flag != 0)
			{
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print("yes");

		}
		else
		{
			System.out.print("no");
		}
		return 0;

	}

}

