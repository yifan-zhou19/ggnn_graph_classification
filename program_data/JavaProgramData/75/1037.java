package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] a = new int[1000];
		int[] b = new int[1000];
		int i = 0;
		int j;
		int kk = 0;
		int n;
		int al;
		int m = 0;
		int[] c = new int[1000];
		int chang;
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		i = 0;
		while (true)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			if (System.in.read() != ',')
			{
				break;
			}
		}
		chang = i - 1;





		for (i = 0;i <= 999;i++)
		{
			if ((a[i] == 0) && (b[i] > 0))
			{
				kk++;
			}
		}
			c[0] = kk;
	kk = 0;
			for (j = 1;j <= 1000;j++)
			{
			for (i = 0;i <= chang;i++)
			{
				if ((a[i] <= j) && (b[i]> j))
				{
					kk++;
				}
			}
			c[j] = kk;
			kk = 0;
			}

		for (i = 0;i <= 999;i++)
		{
			if (b[i] > 0)
			{

			m = m + 1;
			}
		}

		System.out.print(m + 1);
		System.out.print(" ");
		for (j = 0;j <= 999;j++)
		{
			if (c[j] > c[0])
			{

				c[0] = c[j];
			}
		}
		System.out.print(c[0]);
		return 0;
	}
}

