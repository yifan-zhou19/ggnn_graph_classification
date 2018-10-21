package <missing>;

public class GlobalMembers
{
	/*	???:2?N??
		???:1000012896 leo
		??:2010.12.17
		????:??2?N??
		*/
	public static int Main()
	{
		int[] num = new int[31];
		int N;
		int i;
		int j;
		int flag;
		num[30] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			flag = 0;
			for (j = 30; j >= 0; j--)
			{
				if (num[j] * 2 + flag >= 10)
				{
					num[j] = num[j] * 2 + flag - 10;
					flag = 1;
				}
				else
				{
					num[j] = num[j] * 2 + flag;
					flag = 0;
				}
			}
		}
		for (i = 0; i <= 30; i++)
		{
			if (num[i] != 0)
			{
				break;
			}
		}
		for (; i <= 30; i++)
		{
			System.out.print(num[i]);
		}
		return 0;
	}


}

