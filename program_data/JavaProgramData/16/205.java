package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		final String a = "\0\0\0\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 4;i >= 0;i--)
		{
			if (a.charAt(i) != '\0')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
	}

}

