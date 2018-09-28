package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int sum = 0;
		int[] c = new int[1002];
		int max = 0;
		char x;
		for (i = 1;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum++;
			x = System.in.read();
			if (x != ',')
			{
				break;
			}
		}
		for (i = 1;i <= sum;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		for (i = 1;i <= sum;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j]++;
			}
		}
		for (j = 1;j <= 1002;j++)
		{
			if (max < c[j])
			{
				max = c[j];
			}
		}
		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

