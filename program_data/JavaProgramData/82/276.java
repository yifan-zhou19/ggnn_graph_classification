package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int m;
		int l;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		m = 0;
		s = 0;
		while (m < n)
		{
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   a = Integer.parseInt(tempVar2);
				   }
				   String tempVar3 = ConsoleInput.scanfRead(" ");
				   if (tempVar3 != null)
				   {
					   b = Integer.parseInt(tempVar3);
				   }
				   if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
				   {
														   k = k + 1;
														   m = m + 1;
				   }
				   else
				   {
						m = m + 1;
						if (s < k)
						{
								s = k;
						}
						k = 0;
				   }
		}
	 if (s < k)
	 {
		s = k;
	 }
		System.out.printf("%d",s);
		return 0;
	}
}

