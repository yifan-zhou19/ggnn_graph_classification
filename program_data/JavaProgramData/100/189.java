package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[400]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int n;
		int t = 0;
		int i;
		n = a.length();
		for (i = 0;i <= n - 1;i++)
		{
			  if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
			  {
				  t = 1;
				  break;
			  }
		}
		 if (t == 0)
		 {
			 System.out.print("No");
		 }
		 else
		 {
			 char c;
			 for (c = 'a';c <= 'z';c = c + 1)
			 {
				 int num = 0;
				 for (i = 0;i <= n - 1;i++)
				 {
					 if (a.charAt(i) == c)
					 {
						 num = num + 1;
					 }
				 }
				 if (num != 0)
				 {
					 System.out.printf("%c=%d\n",c,num);
				 }
			 }
		 }
	}



}

