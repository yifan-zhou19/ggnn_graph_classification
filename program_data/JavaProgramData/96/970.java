package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] q = new int[101];
		int[] r = new int[101];
		int len;
		int i;
		String b = new String(new char[101]);
		b = new Scanner(System.in).nextLine();
		len = b.length();
		for (i = 0;i < len;i++)
		{
			a[len - i - 1] = b.charAt(i) - '0';
		}
		for (i = len - 1;i >= 0;i--)
		{
			a[i] = r[i + 1] * 10 + a[i];
			q[i] = a[i] / 13;
			r[i] = a[i] % 13;
		}
		i = len;
		while (q[i] == 0 && i > 0)
		{
			i--;
		}
		for (i = i;i >= 0;i--)
		{
			System.out.printf("%d",q[i]);
		}
		System.out.printf("\n%d",r[0]);
		return 0;
	}
}
