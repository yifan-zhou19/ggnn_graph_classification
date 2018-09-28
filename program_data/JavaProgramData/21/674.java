package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int k;
		int j;
		int p;
		int[] a = new int[300];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float ave;
		float max;

		s = 0;
		max = 0F;
		k = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = s + a[i];
		}
		ave = s / 1.0 / n;


		for (i = 0;i < n;i++)
		{
			if (Math.abs(ave - a[i]) >= max)
			{
				max = Math.abs(ave - a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max - Math.abs(ave - a[i]) < 0.001)
			{
				a[k] = a[i];
				k++;
			}
		}
		if (k == 1)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				for (j = 0;j < k - 1 - i;j++)
				{
					if (a[j] > a[j + 1])
					{
						p = a[j];
						a[j] = a[j + 1];
						a[j + 1] = p;
					}
				}
			}
			System.out.print(a[0]);
			for (i = 1;i < k;i++)
			{
				System.out.print(",");
				System.out.print(a[i]);
			}
			System.out.print("\n");

		}

		return 0;

	}
}

