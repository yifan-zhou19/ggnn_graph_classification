package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] content = new int[300];
		int i;
		int n;
		int m = 0;
		int j;
		int temp;
		short flag;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			flag = 0;
			for (j = 0; j < m; j++)
			{
				if (content[j] == temp)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				content[m++] = temp;
			}
		}

		for (i = 0; i < m; i++)
		{
			System.out.printf("%d", content[i]);
			if (i < m - 1)
			{
				System.out.print(",");
			}
		}

		return 0;
	}


}

