package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[300]);
	  char c;
	  int i;
	  int n;
	  int k;
	  int s;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  n = a.length();
		s = 0;
	  for (i = 0;i < n;i++)
	  {
		  if (a.charAt(i) < 65 || (a.charAt(i)>90 && a.charAt(i) < 97) || a.charAt(i)>122)
		  {
			  s = s + 1;
		  }
	  }
	   if (s == n)
	   {
		 System.out.print("No");
	   }
	  for (k = 65;k <= 90;k++)
	  {
		  s = 0;
		 for (i = 0;i < n;i++)
		 {
			if (a.charAt(i) == k)
			{
				s = s + 1;
			}
		 }
		   if (s != 0)
		   {
		   c = k;
		   System.out.printf("%c=%d\n",c,s);
		   }
	  }
	  for (k = 97;k <= 122;k++)
	  {
		  s = 0;
		 for (i = 0;i < n;i++)
		 {
			if (a.charAt(i) == k)
			{
				s = s + 1;
			}
		 }
		   if (s != 0)
		   {
				c = k;
				 System.out.printf("%c=%d\n",c,s);
		   }
	  }
		return 0;
	}


}

