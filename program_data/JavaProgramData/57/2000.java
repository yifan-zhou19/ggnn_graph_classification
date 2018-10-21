package <missing>;

public class GlobalMembers
{
	/*
	 * post.c
	 *
	 *  Created on: 2010-1-5
	 *      Author: Administrator
	 */

	public static int Main()
	{
	 String a1 = new String(new char[50]);
	 String a2 = new String(new char[50]);
	 int n;
	 int i;
	 int j;
	 int len;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
	 // gets(a1);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a1 = tempVar2.charAt(0);
	  }
	  len = a1.length();
	  if (a1.charAt(a1.length() - 1) == 'r' || a1.charAt(a1.length() - 1) == 'y')
	  {
	   for (j = 0;j < len - 2;j++)
	   {
		a2 = tangible.StringFunctions.changeCharacter(a2, j, a1.charAt(j));
	   }
	   a2 = a2.substring(0, j);
	   System.out.printf("%s\n",a2);
	  }
	  else if (a1.charAt(a1.length() - 1) == 'g')
	  {
	   for (j = 0;j < len - 3;j++)
	   {
		a2 = tangible.StringFunctions.changeCharacter(a2, j, a1.charAt(j));
	   }
	   a2 = a2.substring(0, j);
	   System.out.printf("%s\n",a2);
	  }
	 }
	 return 0;
	}

}

