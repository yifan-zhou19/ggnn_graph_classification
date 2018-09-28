package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int p;
		int q;
		int k;
		int c;
		int x = -1;
		int d = -1;
		int m;
		int[] b = new int[10000];
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		k = a.length();
		for (i = 0;i < k + 1;i++)
		{
							 if (a.charAt(i) == ' ' || a.charAt(i) == ',')
							 {
													  b[j] = i;
													  j += 1;
							 }
		}
		b[j] = k;
		c = b[0];
		p = c;
		q = c;
		for (i = 1;i < j + 1;i++)
		{
						   c = b[i] - b[i - 1] - 1;
						   if (c > 0)
						   {
						   if (c > p)
						   {
								   d = i - 1;
								   p = c;
						   }
						   if (c < q)
						   {
								   x = i - 1;
								   q = c;
						   }
						   else
						   {
								m = 0;
						   }
						   }
								else
								{
									 m = 0;
								}
		}
								   if (d == -1)
								   {
											for (i = 0;i < b[0] - 1;i++)
											{
									  System.out.printf("%c",a.charAt(i));
											}
									  System.out.printf("%c\n",a.charAt(i));
								   }
									  else
									  {
		for (i = b[d] + 1;i < b[d + 1] - 1;i++)
		{
									 System.out.printf("%c",a.charAt(i));
		}

		System.out.printf("%c\n",a.charAt(i));
									  }
		if (x == -1)
		{
				  for (i = 0;i < b[0];i++)
				  {
									  System.out.printf("%c",a.charAt(i));
				  }
		}
		else
		{
			 for (i = b[x] + 1;i < b[x + 1];i++)
			 {
										System.out.printf("%c",a.charAt(i));
			 }
		}
		return 0;
	}




}
