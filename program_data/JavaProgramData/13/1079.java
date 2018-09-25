package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] num = new int[20000];
		int i;
		int[] num_cout = new int[20000];
		int k;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num_cout[0] = num[0];
		k = 1;
		for (i = 1; i < n; i++)
		{
			m = 0;
			for (j = 0; j < k; j++)
			{
				if (num[i] == num_cout[j])
				{
					m++;
				}
			}
			if (m == 0)
			{
				num_cout[k] = num[i];
				k++;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			System.out.print(num_cout[i]);
			System.out.print(" ");
		}
		System.out.print(num_cout[k - 1]);
		return 0;
	}
}

