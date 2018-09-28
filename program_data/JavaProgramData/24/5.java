package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static String ss = new String(new char[1000]);
	public static String sl = new String(new char[1000]);
	public static int max;
	public static int min;

	public static int Main()
	{
		int t;
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		max = min = s.length();
		ss = s;
		sl = s;
		while ((s = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			  t = s.length();
			  if (t > max)
			  {
						max = t;
						sl = s;
			  }
			  if (t < min)
			  {
						min = t;
						ss = s;
			  }
		}
		System.out.print(sl);
		System.out.print("\n");
		System.out.print(ss);
		System.out.print("\n");
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		return 0;
	}

}

