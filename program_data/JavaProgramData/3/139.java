package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int n;
		int sum;
		int flag = 0;
		int[] num = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sum = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (num[i] + num[j] == sum)
				{
					System.out.print("yes");
					flag = 1;
					break;
				}
				if (flag == 1)
				{
					break;
				}

			}
			if (flag == 1)
			{
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}


		return 0;
	}

}

