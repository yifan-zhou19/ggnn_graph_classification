package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int left_i = -1;
		int left_j;
		int right_i;
		int right_j;
		int num;
		int temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			num = 0;
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					temp = Integer.parseInt(tempVar2);
				}
				if (temp == 0)
				{
					num++;
					if (num == 1 && left_i < 0)
					{
						left_i = i;
						left_j = j;
					}
					else
					{
						right_i = i;
						right_j = j;
					}
				}
			}
		}

		System.out.printf("%d\n", (right_i - left_i - 1) * (right_j - left_i - 1));

		return 0;
	}
}

