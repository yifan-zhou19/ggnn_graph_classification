package <missing>;

public class GlobalMembers
{
	public static int num;
	public static char right(char c)
	{
		char ch;
		if (c != '(' && c != ')')
		{
		   ch = ' ';
		}
		else if (c == ')')
		{
			 if (num == 0)
			 {
				 ch = '?';
			 }
		   else
		   {
				num--;
			  ch = ' ';
		   }
		}
		else
		{
			 num++;
		   ch = c;
		}
		return ch;
	}
	public static char left(char c,char a)
	{
		char ch;
	  if (a == ' ' || a == '?')
	  {
		   ch = a;
		 if (c == ')')
		 {
			 num++;
		 }
	  }
	  else if (num == 0)
	  {
		  ch = '$';
	  }
		   else
		   {
				num--;
			  ch = ' ';
		   }
	  return ch;
	}
	public static int Main()
	{
		int i;
		int n;
	  String s = new String(new char[101]);
	  String a = new String(new char[101]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  while (gets(s))
	  {
		   num = 0;
		 for (i = 0;i < s.length();i++)
		 {
		   a = tangible.StringFunctions.changeCharacter(a, i, right(s.charAt(i)));
		 }
		 num = 0;
		 for (i = s.length() - 1;i >= 0;i--)
		 {
		   a = tangible.StringFunctions.changeCharacter(a, i, left(s.charAt(i), a.charAt(i)));
		 }
		 System.out.println(s);
		 for (i = 0;i < s.length();i++)
		 {
		   System.out.printf("%c",a.charAt(i));
		 }
		   System.out.print("\n");
	  }
	  return 0;
	}
}

