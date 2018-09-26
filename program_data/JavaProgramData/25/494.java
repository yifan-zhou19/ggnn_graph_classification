package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long sum = 1;
		int sum = 1;
		int[] num = new int[1000];
		int n;
		int i;
		int k = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1;
		if (n == 0)
		{
			System.out.print(1);
		}
		else
		{
			for (i = 0; i < n; i++)
			{
				k = 0;
				while (num[k] != 0 || num[k + 1] != 0 || num[k + 2] != 0 || num[k + 3] != 0)
				{
					num[k] *= 2;
					k++;
				}
				for (j = 0; j < k; j++)
				{
					if (num[j] >= 10)
					{
						num[j + 1] += num[j] / 10;
						num[j] = num[j] % 10;
					}
				}
			}

		k = 40;
		while (num[k] == 0)
		{
			k--;
		}
		for (;k >= 0; k--)
		{
			System.out.print(num[k]);
		}
		}
		return 0;
	}
}

