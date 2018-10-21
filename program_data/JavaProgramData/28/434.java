package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[300][100];
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[i] = tempVar.charAt(0);
		}
		System.out.printf("%d",String.valueOf(s[i]).length());
		while (true)
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			if (strcmp(s[i],s[i - 1]) == 0 || String.valueOf(s[i]).length() == 0)
			{
				break;
			}
			else
			{
				System.out.print(",");
				System.out.printf("%d",String.valueOf(s[i]).length());
			}
		}
	}
}

