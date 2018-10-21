package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int sum = 0;
		int p = 0;
		int t;

		//??	
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		//???????k?????sum? 
		for (j = 0; j < n; j++)
		{
			if (k != a[j])
			{
				sum++;
			}
		}

		//?????????????p < sum - 1??????????? 
		//???????????(p == sum - 1)????????? 
		for (t = 0; t < n; t++)
		{
			if (k != a[t])
			{
				if (p == sum - 1)
				{
					System.out.print(a[t]);
					p++;
				}
				else
				{
					System.out.print(a[t]);
					System.out.print(" ");
					p++;
				}
			}
		}
		return 0;
	}
}

