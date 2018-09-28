package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int n;
		int j;
		int i;
		int k;
		int l;
		int max;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = a;
		c = a;
		max = min = a.length();
		for (i = 2;i <= n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			k = a.length();
			if (k > max)
			{
				max = k;
				b = a;
			}
			else if (k < min)
			{
				min = k;
				c = a;
			}
		}
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		return 0;
	}

}

