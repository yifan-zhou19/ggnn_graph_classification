package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int[] a = new int[300];
		int max;
		int i = 0;
		final String b = "";
		b = new Scanner(System.in).nextLine();
		while (b.charAt(i) != null)
		{
			if (b.charAt(i) == ',')
			{
				n++;
			}
			else
			{
				a[n] = a[n] * 10 + b.charAt(i) - '0';
			}
			i++;
		}

		max = 0;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i <= n;i++)
		{
			if (a[i] == max)
			{
				a[i] = 0;
			}
		}
		max = 0;
		for (i = 0;i <= n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		if (max == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%u",max);
		}

	}




}
