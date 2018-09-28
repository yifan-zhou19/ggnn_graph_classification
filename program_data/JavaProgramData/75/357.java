package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p; //n?????p????????
		int i = 1;
		int j;
		int k = 1;
		int[] a = new int[1002];
		int[] b = new int[1002];
		int count;
		int max1 = 0;
		int max = 0;
		int min = 1004;
		char c;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (a[i] < min)
			{
				min = a[i];
			}
			i++;
		} while (c == ',');
		p = i - 1;
		i = 1;
		do
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (b[i] > max)
			{
				max = b[i];
			}
			i++;
		} while (c == ',');
		for (i = min;i <= max;i++)
		{
			count = 0;
			for (j = 1;j <= p;j++)
			{
				if (a[j] <= i != 0 && b[j] >= (i + 1))
				{
					count++;
				}
			}
			if (count > max1)
			{
				max1 = count;
			}
		}
		System.out.print(p);
		System.out.print(" ");
		System.out.print(max1);
		System.out.print("\n");
		return 0;
	}

}

