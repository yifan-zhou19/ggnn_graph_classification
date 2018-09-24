package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char ch;
		  String c = new String(new char[1001]);
		  int a;
		  int len;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  len = c.length();
		  if (c.charAt(0) >= 'a' && c.charAt(0) <= 'z')
		  {
				   ch = 'A' + c.charAt(0) - 'a';
		  }
		  else
		  {
				   ch = c.charAt(0);
		  }
		  a = 1;
		  for (i = 1;i <= len - 1;i++)
		  {
			  if (c.charAt(i) - ch == 0 || c.charAt(i) - ch == 'a'-'A')
			  {
				a++;
			  }
			 else
			 {
				 System.out.printf("(%c,%d)",ch,a);
				if (c.charAt(i) >= 'a' && c.charAt(i) <= 'z')
				{
				   ch = 'A' + c.charAt(i) - 'a';
				}
				else
				{
				   ch = c.charAt(i);
				}
				a = 1;
			 }
		  }
		  System.out.printf("(%c,%d)",ch,a);

	}
}

