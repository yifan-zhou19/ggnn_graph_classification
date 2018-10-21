package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int j;
		int t;
		char ch;
		char[] a = {'z', 'q', 's', 'l'};
		int[] b = new int[4];
		for (z = 10;z <= 50;z = z + 10)
		{
		 for (q = 10;q <= 50;q = q + 10)
		 {
		  for (s = 10;s <= 50;s = s + 10)
		  {
		   for (l = 10;l <= 50;l = l + 10)
		   {
			  if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q) == 1)
			  {
				b[0] = z;
				b[1] = q;
				b[2] = s;
				b[3] = l;
			  }
		   }
		  }
		 }
		}

			for (i = 0;i < 3;i++)
			{
			 for (j = 0;j < 3 - i;j++)
			 {
				if (b[j] < b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
					ch = a[j];
					a[j] = a[j + 1];
					a[j + 1] = ch;
				}
			 }
			}
			for (i = 0;i <= 3;i++)
			{
			System.out.print(a[i]);
			System.out.print(' ');
			System.out.print(b[i]);
			System.out.print("\n");
			}
			return 0;
	}

}
