package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int start;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[101]; //??num????????
		num[100] = 1;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= 100; j++) //?????????2
			{
				num[j] = num[j] * 2;
			}
			for (j = 1; j <= 100; j++) //????10??????????-10
			{
				if (num[j] >= 10)
				{
					num[j] = num[j] - 10;
					num[j - 1]++;
				}
			}
		}
		//????????? 
		for (i = 1; ; i++)
		{
			if (num[i] != 0)
			{
				start = i;
				break;
			}
		}
		// ???? 
		for (i = start; i <= 100; i++)
		{
		System.out.print(num[i]);
		}
		return 0;
	}
}

