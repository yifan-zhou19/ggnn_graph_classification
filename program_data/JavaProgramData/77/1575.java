package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[111];
		int i;
		int n = 0;
		String s = new String(new char[111]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char boy = s.charAt(0);
		for (i = 0; s.charAt(i); ++i)
		{
			if (s.charAt(i) == boy)
			{
				a[++n] = i;
			}
			else
			{
				System.out.print(a[n--]);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

