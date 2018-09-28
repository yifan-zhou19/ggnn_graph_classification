package <missing>;

public class GlobalMembers
{
	public static int why(tangible.RefObject<String> s)
	{
		int i;
		if (s.argValue.charAt(0) == '_' || (s.argValue.charAt(0) >= 'a' && s.argValue.charAt(0) <= 'z') || (s.argValue.charAt(0) >= 'A' && s.argValue.charAt(0) <= 'Z'))
		{
			for (i = 1;s.argValue.charAt(i);i++)
			{
				if (s.argValue.charAt(i) == '_' || (s.argValue.charAt(i) >= 'a' && s.argValue.charAt(i) <= 'z') || (s.argValue.charAt(i) >= 'A' && s.argValue.charAt(i) <= 'Z') || (s.argValue.charAt(i) >= '0' && s.argValue.charAt(i) <= '9'))
				{
					continue;
				}
				else
				{
					return 0;
				}
			}
		}
		else
		{
			return 0;
		}
		return 1;
	}
	public static int Main()
	{
		String s = new String(new char[1000]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
			System.out.printf("%d\n",why(tempRef_s));
			s = tempRef_s.argValue;
		}
		return 0;
	}
}

