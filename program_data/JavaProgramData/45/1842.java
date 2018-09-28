package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i;
		int lena;
		int lenb;
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
		lena = a.length();
		lenb = b.length();
		for (i = 0;i <= lenb - lena;i++)
		{
			if (b.charAt(i) == a.charAt(0) && b.charAt(i + 1) == a.charAt(1) && b.charAt(i + lena - 1) == a.charAt(lena - 1))
			{
				System.out.printf("%d",i);
			break;
			}
		}
	return 0;
	}
}

