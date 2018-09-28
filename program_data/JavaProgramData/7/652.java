package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int same;
		int i;
		int j;
		int k;
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String repl = new String(new char[256]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sub = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   repl = tempVar3.charAt(0);
	   }
	   for (i = 0;i < str.length();i++)
	   {
		   same = 1;
		 for (j = 0;j < sub.length();j++)
		 {
			 if (str.charAt(i + j) != sub.charAt(j))
			 {
		  same = 0;
			 }
		 }
		 if (same == 0)
		 {
		 System.out.printf("%c",str.charAt(i));
		 }
		 if (same == 1)
		 {
			 System.out.printf("%s",repl);
		   for (k = i + sub.length();str.charAt(k) != 0;k++)
		   {
			   System.out.printf("%c",str.charAt(k));
		   }
		   break;
		 }
	   }
	return 0;
	}

}

