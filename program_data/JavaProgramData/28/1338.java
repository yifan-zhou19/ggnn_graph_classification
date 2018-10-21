package <missing>;

public class GlobalMembers
{
	public static int[] sums = new int[310];

	public static void Main()
	{
		int n = 0;
		int i;
		int sum = 0;
		char a;
		while (a = System.in.read())
		{
			if (a == '\0' || a == '\n')
			{
				sums[n] = sum;
				n++;
				break;
			}
			else if (a == ' ')
			{
				if (sum != 0)
				{
					sums[n] = sum;
					n++;
				}
				sum = 0;
			}
			else
			{
				sum++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",sums[i]);
		}
		System.out.printf("%d",sums[n - 1]);
	}

}
