package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			b[i] = (a.Substring(i)) + *(a.Substring(i) + 1);
		}
		b[n - 1] = (a.Substring(n) - 1) + *a;
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",b[i]);
		}
	}
}
