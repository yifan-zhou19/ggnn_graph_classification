package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int input;
		int output;
		int[] num = new int[300];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[0] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d", num[0]);
		for (i = 1; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
			output = 1;
			for (j = 0; j < i; j++)
			{
				if (num[j] == num[i])
				{
					output = 0;
				}
			}
			if (output == 1)
			{
				System.out.printf(",%d",num[i]);
			}
		}
	}

}

