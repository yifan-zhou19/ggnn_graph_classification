package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[30];
		int[] b = new int[30];
		int max = 0;
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = n, k ; j >= 1 ; j--)
		{
			max = 0;
			flag = 0;
			for (k = j ; k <= n ;k++)
			{
				if (a[j] >= a[k])
				{
					flag = 1;
				 if (b[k] >= max)
				 {
					 max = b[k];
				 }
				}
			}
			if (flag != 0)
			{
				b[j] = max + 1;
			}
			else
			{
				b[j] = max;
			}

		}
		for (int i = 1 ; i <= n ; i++)
		{
			if (b[i] >= max)
			{
				max = b[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}



}

