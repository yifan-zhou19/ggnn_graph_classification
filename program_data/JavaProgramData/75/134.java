package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int ctr = 0;
		int[] a = new int[1100];
		int b;
		int[] x = new int[1100];
		int max = 0;
		while (true)
		{
			a[++ctr] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (cin.peek() == '\n')
			{
				break;
			}
			System.in.read();
		}
		System.in.read();
		for (i = 1;i <= ctr;i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = a[i];j < b;j++)
			{
				x[j]++;
			}
			if (!cin.eof())
			{
				System.in.read();
			}
		}
		for (i = 1;i < 1050;i++)
		{
			max = (x[i] > max)?x[i]:max;
		}
		System.out.print(ctr);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

