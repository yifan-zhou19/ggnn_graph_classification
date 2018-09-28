package <missing>;

public class GlobalMembers
{
	public static int isright(tangible.RefObject<String> s, tangible.RefObject<String> w, int i)
	{
	String t = new String(new char[50]);
	int j;
	for (j = 0;j < s.argValue.length();j++)
	{
		t = tangible.StringFunctions.changeCharacter(t, j, w.argValue.charAt(i + j));
	}
	t = tangible.StringFunctions.changeCharacter(t, s.argValue.length(), '\0');
	if (strcmp(s.argValue,t) == 0)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}

	public static int Main()
	{
	String s = new String(new char[50]);
	String w = new String(new char[50]);
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		w = tempVar2.charAt(0);
	}
	for (i = 0;i <= w.length() - s.length();i++)
	{
   tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
   tangible.RefObject<String> tempRef_w = new tangible.RefObject<String>(w);
	   if (isright(tempRef_s, tempRef_w, i) != 0)
	   {
		   w = tempRef_w.argValue;
		   s = tempRef_s.argValue;
			 System.out.printf("%d",i);
			 break;
	   }
	   else
	   {
		   w = tempRef_w.argValue;
		   s = tempRef_s.argValue;
	   }
	}
	return 0;
	}
}

