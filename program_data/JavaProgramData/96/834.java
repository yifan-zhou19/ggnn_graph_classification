package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[102];
		int[] c = new int[101];
		b[0] = 0;
		a = new Scanner(System.in).nextLine();
		for (int i = 1;i <= a.length();i++)
		{
				b[i] = a.charAt(i - 1) - 48;
				c[i] = (b[i - 1] * 10 + b[i]) / 13;
				b[i] = (b[i - 1] * 10 + b[i]) % 13;
		}
		if (a.length() == 1 || (a.length() == 2 && c[2] == 0))
		{
		System.out.print("0");
		}
		else
		{
		if (c[2] > 0)
		{
		System.out.printf("%d",c[2]);
		}
		for (int i = 3;i <= a.length();i++)
		{
		System.out.printf("%d",c[i]);
		}
		}
		System.out.printf("\n%d",b[a.length()]);
		return 0;
	}
}
