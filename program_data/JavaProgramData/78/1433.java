package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int z = 1;z <= 5;z++)
		{
		 for (int q = 1;q <= 5;q++)
		 {
		 if (q != z)
		 {
		  for (int s = 1;s <= 5;s++)
		  {
		  if (s != z && s != q)
		  {
		   for (int l = 1;l <= 5;l++)
		   {
		   if (l != z && l != q && l != s && z + q == s + l && z + l > s + q && z + s < q)
		   {
				int[] N = {z, q, s, l};
				int t;
			char[] M = {'z', 'q', 's', 'l', ' '};
			for (int i = 0;i <= 3;i++)
			{
			for (int j = i + 1;j <= 3;j++)
			{
				if (N[j] > N[i])
				{
					t = N[i];
					N[i] = N[j];
					N[j] = t;
				M[4] = M[i];
				M[i] = M[j];
				M[j] = M[4];
				};
			}
			}
			System.out.print(M[0]);
			System.out.print(" ");
			System.out.print(10 * N[0]);
			System.out.print("\n");
			System.out.print(M[1]);
			System.out.print(" ");
			System.out.print(10 * N[1]);
			System.out.print("\n");
			System.out.print(M[2]);
			System.out.print(" ");
			System.out.print(10 * N[2]);
			System.out.print("\n");
			System.out.print(M[3]);
			System.out.print(" ");
			System.out.print(10 * N[3]);
			System.out.print("\n");
		   }
		   }
		  }
		  }
		 }
		 }
		}
		return 0;
	}


}
