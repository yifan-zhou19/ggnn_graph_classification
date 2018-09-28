package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] number = new int[NUMBER];
		int[] odds = new int[NUMBER];
		int i = 0;
		int j = 0;
		int k;
		int r;
		while (i < N)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		i = 0;
		while (i < N)
		{
			if ((number[i] % 2) != 0)
			{
				odds[j] = number[i];
				j++;
				i++;
			}
			else
			{
				i++;
			}
		}
		for (k = j - 1;k > 0;k--)
		{
			for (r = 0;r < k;r++)
			{
				if (odds[r] > odds[r + 1])
				{
					int tmp;
					tmp = odds[r + 1];
					odds[r + 1] = odds[r];
					odds[r] = tmp;
				}
			}
		}
		i = 0;
		while (i < j)
		{
			if (i < (j - 1))
			{
				System.out.printf("%d,", odds[i]);
				i++;
			}
			else if (i = (j - 1))
			{
				System.out.printf("%d", odds[i]);
				i++;
			}
		}




			return 0;
	}
}

