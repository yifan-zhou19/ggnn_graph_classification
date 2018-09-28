package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[257]);
	   String substr = new String(new char[257]);
	   String rep = new String(new char[257]);
	   int i;
	   int j = 0;
	   int m;
	   int n;
	   int g = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   substr = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   rep = tempVar3.charAt(0);
	   }
	   m = str.length();
	   n = substr.length();
	   for (i = 0;i < m;i++)
	   {
		   if (str.charAt(i) == substr.charAt(j) && g < n)
		   {
			   j++;
			   g++;
		   }
		   else if (g >= n)
		   {
			   break;
		   }
		   else
		   {
			   g = 0;
			   j = 0;
		   }
	   }
	   if (g == n)
	   {
		   for (j = 0,i = i - n;j < n;j++,i++)
		   {
			   str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
		   }
	   }
	   System.out.printf("%s",str);
	   return 0;
	}

}

