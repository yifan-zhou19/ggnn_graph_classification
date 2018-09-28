package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int p;
		int q;
		int s;
		int e;
		int f;
		int m = 0;
		int[][] sz = new int[50000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (b = 0;b < n;b++)
		{
			for (a = 0;a < 2;a++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[b][a] = Integer.parseInt(tempVar2);
				}
			}
		}


		for (s = 1;s <= n;s++)
		{
			for (b = 0;b < n - s;b++)
			{
			if (sz[b][0] > sz[b + 1][0])
			{
			e = sz[b + 1][0];
			f = sz[b + 1][1];
			sz[b + 1][0] = sz[b][0];
			sz[b + 1][1] = sz[b][1];
			sz[b][0] = e;
			sz[b][1] = f;
			}
			}
		}



		p = sz[0][0];
		 q = sz[0][1];
			 for (b = 1;b < n;b++)
			 {


				 if ((p <= sz[b][0]) && (q >= sz[b][0]) && (q <= sz[b][1]))
				 {

				q = sz[b][1];
				m++;
				 }

			   else if ((p <= sz[b][0]) && (q >= sz[b][1]))
			   {
				p = p;
				q = q;
				m++;
			   }

				else
				{
					m = 0;
					System.out.print("no");
					break;
				}

			 }

		if (m != 0)
		{
			System.out.printf("%d %d",p,q);
		}
	return 0;
	}
}

