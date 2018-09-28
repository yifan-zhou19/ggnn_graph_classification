package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i;
		int len1;
		int len2;
		int j = 0;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		final String t = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		len1 = w.length();
		len2 = s.length();
		for (i = 0;i < len1 - len2;i++)
		{
		   for (j = 0;j < len2;j++)
		   {
			   t = tangible.StringFunctions.changeCharacter(t, j, w.charAt(i + j));
		   }
		   if (strcmp(t,s) == 0)
		   {
			   break;
		   }
		   else
		   {
			   n = n + 1;
			 t = "\0\0\0\0\0\0\0\0\0\0";
		   }
		}
		System.out.printf("%d",n);
	}



}

