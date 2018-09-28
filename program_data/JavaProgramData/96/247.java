package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[105];
		int[] a = new int[105];
		int b = 0;
		int sum;
		int i = 0;
		int n;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			num[i] = c - '0';
			i++;
		}
		n = i;
		if (n < 3)
		{
			if (n == 1)
			{
				sum = num[0];
			}
			else
			{
				sum = num[0] * 10 + num[1];
			}
			System.out.print(sum / 13);
			System.out.print("\n");
			System.out.print(sum % 13);
			System.out.print("\n");
		}
		else
		{
			sum = num[0] * 100 + num[1] * 10 + num[2];
			for (int i = 3; i < n; i++)
			{
				a[i - 1] = sum / 13;
				sum = sum % 13 * 10 + num[i];
				b = sum % 13;
			}
			a[n - 1] = sum / 13;
			for (int i = n - 1; i > 1; i--)
			{
				a[i - 1] += a[i] / 10;
				a[i] = a[i] % 10;
			}
			for (int i = 1; i < n; i++)
			{
				if (a[1] == 0 && i == 1)
				{
					continue;
				}
				System.out.print(a[i]);
			}
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}

		return 0;
	}

}
