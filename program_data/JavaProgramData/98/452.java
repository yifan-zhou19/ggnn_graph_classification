package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	  int i = 0;
	  int num = 0;
	  String s = new String(new char[100]);
	  while (i < n)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s = tempVar2.charAt(0);
		  }
	   num += s.length();
	   if (num == s.length())
	   {
		   System.out.printf("%s",s);
	   num++;
	   }
	   else if (num < 80)
	   {
		   System.out.printf(" %s",s);
		num++;
	   }
		else if (num == 80)
		{
			System.out.printf(" %s\n",s);
		 num = 0;
		}
	   else if (num > 80)
	   {
		   System.out.printf("\n%s",s);
		 num = s.length();
		 num++;
	   }
		  i++;
	  }
		 return 0;
	}
}

