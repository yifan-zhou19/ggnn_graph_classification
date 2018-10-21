package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s1 = new String(new char[257 * 2]);
	 String a = new String(new char[257]);
	 String b = new String(new char[257]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s1 = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = tempVar3.charAt(0);
	 }
	 int i;
	 int j;
	 int k;
	 int st;
	 int end;
	 st = 0;
	 end = 0;
	 for (i = 0;s1.charAt(i) != 0;i++)
	 {
	  if (s1.charAt(i) == a.charAt(0))
	  {
	   for (k = i + 1, j = 1;s1.charAt(k) != 0 && a.charAt(j) != 0;k++, j++)
	   {
		if (s1.charAt(k) != a.charAt(j))
		{
		 break;
		}
	   }
	   if (a.charAt(j) == 0)
	   {
		   st = i;
		   end = k;
		   break;
	   }
	  }
	 }
	 if (st < end)
	 {
		 if (a.length() > b.length())
		 {
			 for (i = st,j = 0;b.charAt(j) != 0;i++,j++)
			 {
				 s1 = tangible.StringFunctions.changeCharacter(s1, i, b.charAt(j));
			 }
			 for (k = end;s1.charAt(k) != 0;k++,i++)
			 {
				 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(k));
			 }
			 s1 = s1.substring(0, i);
		 }
		 else
		 {
			 i = s1.length() + b.length() - a.length();
			 for (k = s1.length();k >= end;k--,i--)
			 {
				 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(k));
			 }
			 for (i = st,j = 0;b.charAt(j) != 0;i++,j++)
			 {
				 s1 = tangible.StringFunctions.changeCharacter(s1, i, b.charAt(j));
			 }
		 }
	 }
	 System.out.printf("%s",s1);
	 return 0;
	}

}

