package <missing>;

public class GlobalMembers
{
	public static int fb(int x)
	{
				  int y = 1;
				  int z = 1;
				  int c;
				  int i;
				  if (x == 1 || x == 2)
				  {
								 c = 1;
				  }
				  else
				  {
				  for (i = 2;i < x;i++)
				  {
									c = y + z;
									y = z;
									z = c;

				  }
				  }
		 return c;
	}
	public static int Main()
	{
		int n;
		int i;
		int b;
		int[] a = new int[20];
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
							a[i] = Integer.parseInt(tempVar2);
						}
		}
		for (i = 0;i < n;i++)
		{
						 b = fb(a[i]);
						 System.out.printf("%d\n",b);
		}
		return 0;
	}
}

