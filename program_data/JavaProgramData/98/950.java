package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[43]);
	int m;
	int n;
	int sum = 0;
	int i;
	int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	System.out.printf("%s",s);
	sum = s.length();
	for (i = 2;i <= n;i++)
	{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   s = tempVar3.charAt(0);
		   }
	   m = s.length();
	   sum = sum + m + 1;
	   if (sum <= 80)
	   {
			  System.out.printf(" %s",s);
	   }
		else
		{
			System.out.printf("\n%s",s);
		sum = s.length();
		}
		for (k = 0;k <= 41;k++)
		{
			*p = '\0';
		p = p + 1;
		}
		p = s;
	}
	  return 0;
	}
}

