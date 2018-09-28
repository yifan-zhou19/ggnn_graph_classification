package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int m1 = 0;
		int m2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   t = Integer.parseInt(tempVar2);
		   }
		   if (t > m1)
		   {
					m2 = m1;
			   m1 = t;
		   }
		   else if (t > m2)
		   {
			   m2 = t;
		   }
		}
		System.out.printf("%d\n%d", m1, m2);
			 return 0;
	}
}

