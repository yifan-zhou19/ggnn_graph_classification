package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int sum = 0;
		int[] c = new int[2000];
		int max;
		char ch;
		for (int i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum++;
			ch = System.in.read();
			if (ch == '\n')
			{
				break;
			}

		}
		for (int i = 0;i < 2000;i++)
		{
			c[i] = 0;
		}
		for (int j = 0;j < sum;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			for (int k = a[j];k < b[j];k++)
			{
				c[k]++;
			}
		}

		max = c[0];
		for (int i = 0; i < 2000; i++)
		{

			if (max < c[i])
			{

				max = c[i];
			}
		}






		System.out.print(sum);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}
}

