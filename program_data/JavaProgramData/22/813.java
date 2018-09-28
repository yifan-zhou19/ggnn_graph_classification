package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] a = new int[301];
		int i = 1;
		int value = 0;
		int max;
		int second;
		int k;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ',')
			{
				value = value * 10 + c - '0';
			}
			else
			{
				a[i] = value;
				value = 0;
				i++;
			}
		}
		a[i] = value;
		k = i;
		max = a[1];
		second = -1;
		for (i = 2;i <= k;i++)
		{
			if (a[i] > max)
			{
				second = max;
				max = a[i];
			}
			else if (a[i] < max && a[i]> second)
			{
				second = a[i];
			}
		}
		if (second == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",second);
		}
		return 0;
	}
}
