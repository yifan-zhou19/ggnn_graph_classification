package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int i;
		int j;
		int k;
		int l;
		int s;
		int g;
		int h;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6 ; i <= n ; i = i + 2)
		{
			g = 0;
			for (j = 3 ; j <= i / 2 ; j = j + 2)
			{
				p = Math.sqrt(j);
				g = 0;
					 for (k = 1 ; k <= p ; k++)
					 {
						 if ((k != 1) && ((j % k) == 0))
						 {
						  g = 1;
						  break;
						 }
					 }

			   if (g == 0)
			   {
				 s = i - j;
				 q = Math.sqrt(s);
				 h = 0;
				   for (l = 1 ; l <= q ; l++)
				   {
					  if ((l != 1) && ((s % l) == 0))
					  {
					   h = 1;
					   break;
					  }
				   }
				   if (h == 0)
				   {
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(s);
					System.out.print("\n");
					break;
				   }
			   }
			}

		}
		return 0;
	}


}

