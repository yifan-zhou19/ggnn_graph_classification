package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int yyyy;
		int nn;
		int mm;
		int i;
		int j;
		int c;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				yyyy = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				nn = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				mm = Integer.parseInt(tempVar4);
			}
			if (mm > nn)
			{
			   n = mm;
			   m = nn;
			}
			else
			{
				n = nn;
				m = mm;
			}
			if (yyyy % 400 == 0 || (yyyy % 100 != 0 && yyyy % 4 == 0))
			{
				c = 0;
			  for (j = m;j < n;j++)
			  {
				 c = c + b[j - 1];
			  }
			  if (c % 7 == 0)
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
			  c = 0;
			  for (j = m;j < n;j++)
			  {
				 c = c + a[j - 1];
			  }
			  if (c % 7 == 0)
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

