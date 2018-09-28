package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int max = 0;
		int[] a = new int[1001];
		int[] b = new int[1001];
		int[] sum = new int[1001];
		int count = 0;

		char ch;

		while (true)
		{
			a[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count++;
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		count = 0;
		while (true)
		{
			b[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count++;
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (i = 0;i < count;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				sum[j]++;
			}
		}
		for (i = 1;i <= 1000;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
			}
		}
		System.out.print(count);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");


		return 0;
	}
}

