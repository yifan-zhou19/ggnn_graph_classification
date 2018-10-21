package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int[] a = new int[100];
		int k = 0;
		int m = 1;
		int min;
		int max;
		int result = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = 1;
			max = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			min = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (max < 90)
			{
				m = 0;
			}
			else
			{
				if (max > 140)
				{
					m = 0;
				}
			}
			if (min > 90)
			{
				m = 0;
			}
			else
			{
				if (min < 60)
				{
					m = 0;
				}
			}
			if (m == 1)
			{
				t++;
			}
			else
			{
				a[k] = t;
				k++;
				t = 0;
			}
		}
		a[k] = t;
		k++;
		for (i = 0;i < k;i++)
		{
			if (result < a[i])
			{
				result = a[i];
			}
		}
		System.out.print(result);
		System.out.print("\n");
		return 0;
	}
}

