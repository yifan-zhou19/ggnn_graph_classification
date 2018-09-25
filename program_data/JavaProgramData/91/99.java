package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[100]);
		int[] a = new int[100];
		int i;
		int n;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 1;i < n;i++)
		{
			a[i] = str.charAt(i - 1) + str.charAt(i);
		}
		a[n] = str.charAt(0) + str.charAt(n - 1);
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%c",a[i]);
		}
		return 0;
	}
}
