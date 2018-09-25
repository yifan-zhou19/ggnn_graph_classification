package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int cnt = 0;
		int i = 1;
		int j;
		int max = 0;
		int[] c = new int[1000];
		char dou;
		while (true)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
			cnt++;
		if (System.in.read() != ',')
		{
			break;
		}


		}

		for (i = 0;i <= 999;i++)
		{
			c[i] = 0;
		}

		for (i = 1;i <= cnt - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dou = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		b[cnt] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= cnt;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j]++;
			}
		}
		   for (i = 0;i <= 999;i++)
		   {
			if (c[i] > max)
			{
				max = c[i];
			}
		   }
		System.out.print(cnt);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

