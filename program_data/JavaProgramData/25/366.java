package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 0;
		int k;
		int i;
		int j;
		int[] sum = new int[100001];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		sum[0] = 1;
		for (i = 0;i < k;i++)
		{
			for (j = 0;j <= 100000;j++)
			{
			   sum[j] *= 2;
			}
			for (j = 0;j <= 100000;j++)
			{
			   if (sum[j] >= 10)
			   {
				   sum[j] -= 10;
					  sum[j + 1] += 1;
			   }
			}

		}
		for (i = 100000;i >= 0;i--)
		{
			if (flag == 0 && sum[i] == 0)
			{
				continue;
			}
			else if (flag == 0 && sum[i] != 0)
			{
				flag = 1;
				System.out.print(sum[i]);
			}
			else
			{
				System.out.print(sum[i]);
			}
		}
		return 0;
	}
}

