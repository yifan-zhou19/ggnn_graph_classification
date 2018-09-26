package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i = 0;
		int j = 0;
		if (a.argValue.length() != b.argValue.length())
		{
			return 0;
		}
		for (i = 0;i < a.argValue.length();i++)
		{
			for (j = 0;j < a.argValue.length();j++)
			{
				if (*(a.argValue.Substring(i)) == *(b.argValue.Substring(j)))
				{
					*(a.argValue.Substring(i)) = ' ';
					*(b.argValue.Substring(j)) = ' ';
				}
			}
		}
		for (i = 0;i < a.argValue.length();i++)
		{
			if (*(a.argValue.Substring(i)) != ' ')
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main(String[] args)
	{
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
		if (judge(tempRef_a, tempRef_b) == 1)
		{
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			System.out.print("YES");
		}
		else
		{
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			System.out.print("NO");
		}
	}
}

