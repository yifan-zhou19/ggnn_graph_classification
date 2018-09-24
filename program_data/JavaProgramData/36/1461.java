package <missing>;

public class GlobalMembers
{
	public static void in(int n, String a, int[] c) //??????????
	{
		for (int i = 0; i < n; i++)
		{
			c[a[i]]++;
		}
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		int[] c_a = new int[300];
		int[] c_b = new int[300];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (a.length() != b.length()) //???????????????
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		in(a.length(), a, c_a);
		in(b.length(), b, c_b);
		for (int i = 0; i < 300; i++) //?????????????
		{
			if (c_a[i] != c_b[i])
			{
				System.out.print("NO");
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("YES");
		System.out.print("\n");
		return 0;
	}
}

