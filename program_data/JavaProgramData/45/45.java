package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		String a = new String(new char[51]);
		String b = new String(new char[51]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (int i = 0;b.charAt(i) != '\0';i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				c = i;
				break;
			}
		}
		System.out.printf("%d",c);
		return 0;
	}
}

