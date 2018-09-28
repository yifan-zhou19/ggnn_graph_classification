package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = -1;
		int min = 9999999;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String c = new String(new char[1000]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			int l = a.length();
			if (max < l)
			{
				max = l;
				b = a;
			}
			if (min > l)
			{
				min = l;
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

