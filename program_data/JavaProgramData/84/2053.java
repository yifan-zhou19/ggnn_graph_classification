package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int i = 2;
		int a;
		int b;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
			 a = m;
		b = m;
		while (i <= k)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (n > a)
			{
				a = n;
			}
					  if (n < a && n> b)
					  {
							   b = n;
					  }
			i++;
		}

		System.out.printf("%d\n%d\n",a,b);

	}


}

