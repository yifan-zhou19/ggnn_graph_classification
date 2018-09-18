package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10001];
		int n;
		int i;
		int x;
		char ch;
		n = 0;
		while ((ch = System.in.read()) != '\n')
		{
			a[n] = ch - '0';
			n++;
		}
		for (i = 0; i < n / 2; i++)
		{
			x = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = x;
		}
		for (i = 0; i < n; i++)
		{
			System.out.print(a[i]);
		}
	   return 0;
	}
}
