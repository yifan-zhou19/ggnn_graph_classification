package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int j;
	  int k;
	  int i = 0;
	String ch = new String(new char[50]);
	String str = new String(new char[50]);
	String ss = new String(new char[50]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ch = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead("  ");
	if (tempVar2 != null)
	{
		str = tempVar2.charAt(0);
	}
	while (ch.charAt(i++) != null)
	{
		;
	}
	i = i - 1;
	for (j = 0;str.charAt(j + i);j++)
	{
		for (k = 0;k < i;k++)
		{
			ss = tangible.StringFunctions.changeCharacter(ss, k, str.charAt(j + k));
		}
	 ss = tangible.StringFunctions.changeCharacter(ss, k, '\0');
	 if (strcmp(ss,ch) == 0)
	 {
		 break;
	 }
	}
	System.out.printf("%d",j);
	}
}

