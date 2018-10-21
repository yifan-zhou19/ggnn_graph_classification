package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int mark;
		String a = new String(new char[52]);
		String b = new String(new char[52]);
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
		for (i = 0;i < b.length() - a.length() + 1;i++)
		{
			mark = 0;
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) != b.charAt(i + j))
				{
					mark = 1;
					break;
				}
			}
			if (mark == 0)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
}

