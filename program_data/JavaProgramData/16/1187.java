package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int n = 0;
		int i = 0;
		for (i = 0; s.charAt(i) != '\0'; i++)
		{
			n++;
		}
		for (i = n - 1; i >= 0; i--)
		{
			System.out.printf("%c", s.charAt(i));
		}
		return 0;
	}

}

