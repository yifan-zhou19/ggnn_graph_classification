package <missing>;

public class GlobalMembers
{
	public static int f(char c)
	{
	 if (c >= 'a' && c <= 'z')
	 {
		 return 1;
	 }
	 if (c >= 'A' && c <= 'Z')
	 {
		 return 1;
	 }
	 if (c == '_')
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
	 int a;
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String str1 = new String(new char[2]);
	 str1 = new Scanner(System.in).nextLine();
	 while (n-- != 0)
	 {
	  final String str = "";
	  str = new Scanner(System.in).nextLine();
	  int len = str.length();
	  if (f(str.charAt(0)) == 1)
	  {
	   for (i = 1;str.charAt(i) != '\0';i++)
	   {
	   if ((str.charAt(i) >= '0' && str.charAt(i) <= '9') || f(str.charAt(i)) == 1)
	   {
		   continue;
	   }
	   else
	   {
		   break;
	   }
	   }
	   if (i == len)
	   {
		   System.out.printf("%d\n",1);
	   }
	   else
	   {
		   System.out.printf("%d\n",0);
	   }
	  }
	  else
	  {
	  System.out.printf("%d\n",0);
	  }
	 }
	}
}

