package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		int n;
		int i;
		int j;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		n = s1.length() - 1;
		for (i = 0;s2.charAt(i) != '\0';i++)
		{
		   if (s2.charAt(i) == s1.charAt(0))
		   {
		   f = 0;
			 for (j = 0;j <= n - 1;j++)
			 {
				if (s1.charAt(j) != s2.charAt(i + j))
				{
					f = 1;
				}
			 }
		   if (f == 0)
		   {
			  System.out.printf("%d",i);
			  break;
		   }
		   }
		}
		   return 0;
	}


}

