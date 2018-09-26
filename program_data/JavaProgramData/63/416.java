package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int s;
		int q;
		int i;
		int j;
		int k;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		for (i = 0;i < p * s;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < q * s;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				for (k = 0;k < s;k++)
				{
					c[i * q + j] += a[i * s + k] * b[k * q + j];
				}
			}
		}

		for (i = 0;i < p * q;i++)
		{
			System.out.print(c[i]);
			if ((i + 1) % q == 0)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}


		}


		return 0;

	}
}

