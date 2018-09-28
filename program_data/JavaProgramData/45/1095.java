package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int i;
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
		for (i = 0;i < b.length();i++)
		{
			if (b.charAt(i) == a.charAt(0))
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}

}

