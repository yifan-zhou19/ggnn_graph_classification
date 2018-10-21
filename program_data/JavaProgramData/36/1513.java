package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		for (i = 1;i <= a.length();i++)
		{
								for (k = 0;k < a.length() - i;k++)
								{
														  if (a.charAt(k + 1) > a.charAt(k))
														  {
																				 e = a.charAt(k + 1);
																				 a = tangible.StringFunctions.changeCharacter(a, k + 1, a.charAt(k));
																				 a = tangible.StringFunctions.changeCharacter(a, k, e);
														  }
								}
		}
			for (i = 1;i <= b.length();i++)
			{
								for (k = 0;k < b.length() - i;k++)
								{
														  if (b.charAt(k + 1) - b.charAt(k) > 0)
														  {
																				 e = b.charAt(k + 1);
																				 b = tangible.StringFunctions.changeCharacter(b, k + 1, b.charAt(k));
																				 b = tangible.StringFunctions.changeCharacter(b, k, e);
														  }
								}
			}
		if (strcmp(a,b) == 0)
		{
		System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
		return 0;
	}
}

