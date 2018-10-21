package <missing>;

public class GlobalMembers
{
	public static int min(int m1,int m2)
	{
		if (m1 < m2)
		{
				 return m1;
		}
		else
		{
			return m2;
		}
	}
	public static int max(int m1,int m2)
	{
		if (m1 > m2)
		{
			return m1;
		}
		else
		{
			return m2;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int b;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] m1 = new int[n];
		int[] m2 = new int[n];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m1[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			m2[i] = Integer.parseInt(tempVar4);
		}
		}
		for (i = 0;i < n;i++)
		{
			 b = 0;
			 if (a[i] % 4 != 0 || (a[i] % 100 == 0 && a[i] % 400 != 0))
			 {
				 for (j = min(m1[i], m2[i]);j < max(m1[i], m2[i]);j++)
				 {
					  if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					  {
						   b += 31;
					  }
					  else
					  {
						  if (j == 2)
						  {
								   b += 28;
						  }
						  else
						  {
							  b += 30;
						  }
					  }
				 }
				 b = b % 7;
				 if (b == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
			 }
			 else
			 {
				 for (j = min(m1[i], m2[i]);j < max(m2[i], m1[i]);j++)
				 {
					  if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
					  {
						   b += 31;
					  }
					  else
					  {
						  if (j == 2)
						  {
							  b += 29;
						  }
						  else
						  {
							  b += 30;
						  }
					  }
				 }
				 b = b % 7;
				 if (b == 0)
				 {
					 System.out.print("YES\n");
				 }
				 else
				 {
					 System.out.print("NO\n");
				 }
			 }
		}
		return 0;
	}
}

