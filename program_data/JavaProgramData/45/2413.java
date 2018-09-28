package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int panduan = new int(char * a,char * b,int lenyi);
		String yi = new String(new char[50]);
		String er = new String(new char[50]);
		String a = yi;
		String b = er;
		int i;
		int lenyi;
		int lener;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yi = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			er = tempVar2.charAt(0);
		}
		lenyi = yi.length();
		lener = er.length();
		for (i = 0;i < lener;i++)
		{
			if (er.charAt(i) == yi.charAt(0))
			{
			tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
				if (panduan(tempRef_a, b.Substring(i), lenyi) != 0)
				{
					a = tempRef_a.argValue;
					System.out.printf("%d",i);
					break;
				}
				else
				{
					a = tempRef_a.argValue;
				}
			}
		}
		return 0;
	}
	public static int panduan(tangible.RefObject<String> a, tangible.RefObject<String> b, int lenyi)
	{
		int i;
		for (i = 0;i < lenyi;i++)
		{
			if (*(a.argValue.Substring(i)) != *(b.argValue.Substring(i)))
			{
				return 0;
			}
		}
		return 1;
	}
}

