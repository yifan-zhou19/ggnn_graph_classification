package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i = 0;
		int j;
		int w;
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
		for (j = 0;j < b.length();j++)
		{
		   if (a.charAt(i) == b.charAt(j) && a.charAt(i + 1) == b.charAt(j + 1) && i < a.length() - 1)
		   {
			   i++;
		   }
		   w = j - a.length() + 2;
		   if (i == a.length() - 1)
		   {
			break;
		   }
		}
		System.out.printf("%d", w);
		return 0;
	}


}

