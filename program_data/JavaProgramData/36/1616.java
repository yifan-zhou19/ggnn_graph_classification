package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_a = new String(new char[100]);
String b = new String(new char[100]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char a[100],b[100];
		int i;
		int j;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Main_a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;Main_a.charAt(i) != 0;i++)
		{
			for (j = 0;b.charAt(j) != 0;j++)
			{
			if (b.charAt(j) == Main_a.charAt(i))
			{
				b = tangible.StringFunctions.changeCharacter(b, j, 1);
				break;
			}
			}
			if (b.charAt(j) == 0)
			{
				k = 0;
				break;
			}
		}
		for (j = 0;b.charAt(j) != 0;j++)
		{
			if (b.charAt(j) != 1)
			{
			k = 0;
			}
		}
		if (k != 0)
		{
		System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

