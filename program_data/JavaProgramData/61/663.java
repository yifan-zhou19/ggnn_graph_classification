package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int a1;
		int a2;
		int t;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			a1 = 1;
			a2 = 1;
			if (a == 1)
			{
				l = a1;
			}
			else
			{
				 if (a == 2)
				 {
					l = a2;
				 }
				 else
				 {
					 l = 2;
					   for (t = 1;t < a - 2;t++)
					   {
						m = a2;
						a2 = l;
						l += m;
					   }
				 }
			}
		System.out.printf("%d\n",l);
		}
		return 0;
	}

}

