package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[300];
	public static int N;
	public static void Main()
	{
		char c;
		int i = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				a[i] = 10 * a[i] + c - '0';
			}
			else
			{
				i++;
			}
		}
		N = i + 1;
		if (N == 1)
		{
			System.out.print("No");
		}
		else
		{
			int max = 0;
			for (i = 0;i < N;i++)
			{
				if (a[i] > max)
				{
					max = a[i];
				}
			}
			for (i = 0;i < N;i++)
			{
				if (a[i] == max)
				{
					a[i] = 0;
				}
			}
			max = 0;
			for (i = 0;i < N;i++)
			{
				if (a[i] > max)
				{
					max = a[i];
				}
			}
			if (max != 0)
			{
				System.out.printf("%d",max);
			}
			else
			{
				System.out.print("No");
			}
		}
	}
}
