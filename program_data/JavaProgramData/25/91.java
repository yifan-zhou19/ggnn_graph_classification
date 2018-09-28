package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[105];
		int N;
		int j;
		int i;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//memset( num, 0 , 105) ;
		num[0] = 1;
		for (i = 1; i <= 104 ; i++)
		{
			num[i] = 0;
		}
		for (i = 1; i <= N ; i++)
		{
			for (j = 0 ; j <= 104 ; j++)
			{
				num[j] = num[j] * 2;
			}
			for (j = 0 ; j <= 104 ; j++)
			{
				if (num[j] >= 10)
				{
					num[j + 1] += num[j] / 10;
					num[j] = num[j] % 10;
				}
			}
		}
		i = 104;
		while (num[i] == 0)
		{
			i--;
		}
		for (; i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		return 0;
	}
}

