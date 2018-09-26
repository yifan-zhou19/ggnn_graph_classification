package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int r = 1;
		String a = new String(new char[60]);
		String b = new String(new char[60]);
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
		for (i = 0;r == 1;i++)
		{
		if (a.charAt(0) == b.charAt(i))
		{
		System.out.printf("%d\n",i);
		r = 0;
		}
		}
	}
}

