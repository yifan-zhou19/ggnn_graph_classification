package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		float average;
		float m = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			average += a[i];
		}
		average /= n;
		for (i = 0 ; i < n ; i++)
		{
			if (m < Math.abs(a[i] - average))
			{
				m = Math.abs(a[i] - average);
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			if (m == Math.abs(a[i] - average))
			{
				b[j] = a[i];
				j++;
			}
		}
		int l = j;
		int temp;
		for (i = 0 ; i < l ; i++)
		{
			for (j = 0 ; j < l - i - 1 ; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0 ; i < l - 1 ; i++)
		{
			System.out.print(b[i]);
			System.out.print(",");
		}
		System.out.print(b[i]);
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}




}

