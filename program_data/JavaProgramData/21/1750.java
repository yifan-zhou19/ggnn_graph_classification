package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[400];
		int i;
		int j;
		int[] b = new int[400];
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		double sum = 0;
		double ave;
		double max = 0;
		for (i = 1;i <= n;i++)
		{
			sum += a[i];
		}
		ave = sum / n;
		for (i = 1;i <= n;i++)
		{
			if (Math.abs(ave - (double)a[i]) > max)
			{
				max = Math.abs(ave - (double)a[i]);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (max - Math.abs(ave - (double)a[i]) < 0.0001)
			{
				count++;
				b[count] = a[i];
			}
		}
		if (count == 1)
		{

			System.out.print(b[1]);
		}
		else
		{
			for (i = count;i > 0;i--)
			{
				for (j = 1;j < i;j++)
				{
					if (b[j] > b[j + 1])
					{
						swap(b[j],b[j + 1]);
					}
				}
			}
			for (i = 1;i < count;i++)
			{
				System.out.print(b[i]);
				System.out.print(',');
			}
			System.out.print(b[count]);
		}

		return 0;
	}





}

