package <missing>;

public class GlobalMembers
{
	public static int num = 1;
	public static int k = 0;
	public static int count(int n)
	{
		for (int i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0 && i >= k)
			{
				num++;
				k = i;
				count(n / i);
				k = 0;
			}
		}
		return (num);
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(count(a[i]));
			System.out.print("\n");
			num = 1;
			k = 0;
		}
		return 0;
	}
}

