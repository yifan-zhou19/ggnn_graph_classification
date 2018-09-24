package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[5];
		int count = 1;
		for (int i = 0;i < 5;i++)
		{
			a[i] = n % 10;
			if (n >= 10)
			{
			n = (n - a[i]) / 10;
			count++;
			}
		}
		for (int i = 0;i < count;i++)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

