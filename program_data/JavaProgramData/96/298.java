package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int l;
		int r;
		int L;
		int j;
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		if (l == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(a.charAt(0) - '0');
		}
		if (l == 2)
		{
			b[0] = (10 * (a.charAt(0) - '0') + a.charAt(1) - '0') / 13;
			r = (10 * (a.charAt(0) - '0') + a.charAt(1) - '0') % 13;
			System.out.print(b[0]);
			System.out.print("\n");
			System.out.print(r);
		}
		if (l > 2)
		{
			L = l - 2;
			b[0] = (100 * (a.charAt(0) - '0') + 10 * (a.charAt(1) - '0') + a.charAt(2) - '0') / 13;
			r = (100 * (a.charAt(0) - '0') + 10 * (a.charAt(1) - '0') + a.charAt(2) - '0') % 13;
			for (i = 1; i < L; i++)
			{
				b[i] = (10 * r + a.charAt(i + 2) - '0') / 13;
				r = (10 * r + a.charAt(i + 2) - '0') % 13;
			}
			for (i = 0; i < L; i++)
			{
				System.out.print(b[i]);
			}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}
}
