package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int a;
		int b;
		int c;
		int m;
		int n;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		m = 0;
		p = 0;
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			  if (a >= m)
			  {
					n = a;
				  if (p > m)
				  {
				  j = p;
				  }
				  else
				  {
				  j = m;
				  }
			  }
			  else
			  {
					n = m;
				 if (p > a)
				 {
				  j = p;
				 }
				  else
				  {
				  j = a;
				  }
			  }
				m = n;
				p = j;


		}
		System.out.printf("%d\n%d\n",n,j);

	}
}

