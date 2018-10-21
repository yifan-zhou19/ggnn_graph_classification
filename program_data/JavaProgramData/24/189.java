package <missing>;

public class GlobalMembers
{
	public static String ls = new String(new char[1000]);
	public static String ss = new String(new char[1000]);
	public static int max;
	public static int min;
	public static int cl;
	public static String buf = new String(new char[1000]);

	public static int Main()
	{
		max = -1;
		min = 0x7fffffff;
		while (scanf("%s", buf) != EOF)
		{
			cl = buf.length();
			if (cl > max)
			{
				max = cl;
				ls = buf;
			}
			if (cl < min)
			{
				min = cl;
				ss = buf;
			}
		}
		System.out.println(ls);
		System.out.println(ss);
	return 0;
	}

}
