package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 char c;
	 String t = new String(new char[200]);
	 char[][] s = new char[51][200];
	 int i;
	 int j;
	 int n = 0;
	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 c = tempVar.charAt(0);
	 }
	 while (c != '\n')
	 {
	   n = n + 1;
	   s[n][0] = c;
	   i = 0;
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   c = tempVar2.charAt(0);
	   }
	   while ((c != ' ') && (c != '\n'))
	   {
		 i = i + 1;
		 s[n][i] = c;
		 String tempVar3 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar3 != null)
		 {
			 c = tempVar3.charAt(0);
		 }
	   }
	   s[n][i + 1] = '\0';
	   if (c != '\n')
	   {
		   String tempVar4 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar4 != null)
		   {
			   c = tempVar4.charAt(0);
		   }
	   }
	 }
	 for (i = 1;i <= n - 1;i++)
	 {
	   for (j = i + 1;j <= n;j++)
	   {
		 if (String.valueOf(s[i]).length() <= String.valueOf(s[j]).length())
		 {
		   t = s[i];
		   s[i] = s[j];
		   s[j] = t;
		 }
	   }
	 }
	 System.out.printf("%s\n%s\n",s[1],s[n]);
	}

}

