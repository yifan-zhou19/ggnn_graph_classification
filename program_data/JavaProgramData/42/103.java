package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int count;
		int sign;
		int x;
		int[] a = new int[100001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 0;
		for (j = 1,k = 0; j <= n; j++)
		{
			if (a[j] != x)
			{
				k++;
				a[k] = a[j];
			}
			else
			{
				count++;
			}
		}
		sign = 0;
		for (j = 1; j <= n - count; j++)
		{
			if (a[j] != x)
			{
				if (sign == 0)
				{
					System.out.print(a[j]);
					sign++;
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[j]);
				}
			}
		}
		return 0;
	}
}

