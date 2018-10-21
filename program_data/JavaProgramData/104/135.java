package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m == n)
		{
			System.out.printf("%d",m);
		}
		else if (m == 1 || n == 1)
		{
			System.out.print("1");
		}
		else
		{
		   for (i = 0;m >= 1;i++)
		   {
			   for (j = 0;n > m;j++)
			   {
				   n = n / 2;
			   }
			   if (n != m)
			   {
				   m = m / 2;
					 continue;
			   }
			   if (n == m)
			   {
				   break;
			   }
		   }
		   System.out.printf("%d\n",m);
		}
	}


}

