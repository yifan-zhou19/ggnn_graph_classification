package <missing>;

public class GlobalMembers
{
	public static String f(tangible.RefObject<String> s, tangible.RefObject<String> t)
	{
		int i;
		int j = 1;
		t.argValue.charAt(0) = s.argValue.charAt(0);
		for (i = 1;s.argValue.charAt(i);i++)
		{
			t.argValue.charAt(j) = s.argValue.charAt(i);
			if (s.argValue.charAt(i - 1) == ' ' && s.argValue.charAt(i) == ' ')
			{
				;
			}
			else
			{
				j++;
			}
		}
		t.argValue.charAt(j) = s.argValue.charAt(i);
		return t.argValue;
	}
	public static int Main()
	{
		String s = new String(new char[110]);
		String t = new String(new char[110]);
		s = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	tangible.RefObject<String> tempRef_t = new tangible.RefObject<String>(t);
		System.out.println(f(tempRef_s, tempRef_t));
		t = tempRef_t.argValue;
		s = tempRef_s.argValue;
		return 0;
	}
}

