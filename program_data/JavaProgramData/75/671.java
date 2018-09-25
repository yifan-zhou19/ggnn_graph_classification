package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int i;
		int m;
		int k;
		int max;
		int num;
		char c;
		char d;
		i = 1;
		k = 1;
		max = 0;
		num = 0;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			i = i + 1;
		}while (c == ',');
		do
		{
			b[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = System.in.read();
			k = k + 1;
		}while (d == ',');
		for (m = 0; m < 1000; m++)
		{
			for (i = 1; i < k; i++)
			{
				if (a[i] <= m != 0 && b[i] > m)
				{
				num = num + 1;
				}
			}
			if (num > max)
			{
			max = num;
			}
			num = 0;
		}
		System.out.print(k - 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

