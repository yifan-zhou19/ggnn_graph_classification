package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String s = new String(new char[300]);
	int len;
	a = 0;
	for (i = 0; i < n; i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   s = tempVar2.charAt(0);
	   }
	   len = s.length();
		 if ((s.charAt(0) >= 65 && s.charAt(0) <= 90) || s.charAt(0) == 95 || (s.charAt(0) >= 97 && s.charAt(0) <= 122))
		 {
			  a = 0;
		  for (m = 0;m < len;m++)
		  {
			  if ((s.charAt(m) >= 65 && s.charAt(m) <= 90) || s.charAt(m) == 95 || (s.charAt(m) >= 97 && s.charAt(m) <= 122) || (s.charAt(m) >= 48 && s.charAt(m) <= 57))
			  {
			 a = a;
			  }
			  else
			  {
				  a++;
			  }
		  }
		 }
		  else
		  {
			  a++;
		  }
	   if (a == 0)
	   {
	   System.out.print("yes\n");
	   }
	   else
	   {
		   System.out.print("no\n");
	   }
	}
	return 0;
	}
}

