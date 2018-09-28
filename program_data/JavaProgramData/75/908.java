package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int i;
		int j = 0;
		int temp = 0;
		int max = 0;
		float c = 0.5F;
		for (i = 0;i < 10000;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				j++;
			}
			if (j == 2)
			{
				break;
			}
		}
		for (;c <= 998.5F;)
		{
			for (j = 0;j <= (i - 1) / 2;j++)
			{
				if (a[j] < c && a[(i + 1) / 2 + j]> c)
				{
					temp++;
				}
			}
			if (temp > max)
			{
				max = temp;
			}
			temp = 0;
			c++;
		}
		System.out.print((i + 1) / 2);
		System.out.print(" ");
		System.out.print(max);
		return 0;
	}

}

