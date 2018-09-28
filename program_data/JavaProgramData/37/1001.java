package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int n;
		int num = 0;
		int m;
		int mmin;
		int times = 0;
		String s = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < t;i++)
		{
						 s = new Scanner(System.in).nextLine();
						 n = s.length();
						 mmin = n;
						 times = 0;
						 for (j = 'a';j <= 'z';j++)
						 {
											   for (k = 0;k < n;k++)
											   {
																if (s.charAt(k) == j)
																{
																			num++;
																}
											   }
											   if (num == 1)
											   {
														  times++;
														  for (k = 0;k < n;k++)
														  {
																		   if (s.charAt(k) == j)
																		   {
																					  m = k;
																					  break;
																		   }
														  }
														  if (m < mmin)
														  {
																	 mmin = m;
														  }
											   }
											   num = 0;
						 }
						 if (times == 0)
						 {
									  System.out.print("no\n");
						 }
						 else
						 {
							  System.out.printf("%c\n",s.charAt(mmin));
						 }

		}

		return 0;
	}
}

