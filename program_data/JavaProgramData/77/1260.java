package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int length;
		int[] x = new int[102];
		int[] b = new int[102];
		int i;
		int j;
		int[] l = new int[100];
		char c;
		String str = new String(new char[102]);
		char nan;
		c = System.in.read();
		nan = c;
		while (c != '\n')
		{
			  if (c == nan)
			  {
				  x[n] = 1;
			  }
			  else
			  {
				  x[n] = 2;
				  l[n] = 1;
			  }
			  n++;
			  c = System.in.read();
		}
		length = n;
		while (n != 0)
		{
			  for (i = 0;i < length;i++)
			  {
								   if (x[i] == 1)
								   {
											  j = i;
											  i++;
											  while (x[i] == 0)
											  {
												  i++;
											  }
											  if (x[i] == 1)
											  {
														   i--;
														   continue;
											  }
											  b[i] = j;
											  x[j] = x[i] = 0;
											  n = n - 2;
								   }
			  }
		}
		for (i = 0;i < length;i++)
		{
							 if (l[i] == 1)
							 {
										System.out.print(b[i]);
										System.out.print(' ');
										System.out.print(i);
										if (b[i] != 0)
										{
											System.out.print("\n");
										}
							 }
		}
		return 0;
	}

}
