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
		int m;
		int n;
		int o;
		int[] A = {10, 20, 30, 40, 50};
		for (i = 0;i < 5;i++)
		{
			z = A[i];
			for (m = 0;m < 5;m++)
			{
				q = A[m];
				for (n = 0;n < 5;n++)
				{
					s = A[n];
					for (o = 0;o < 5;o++)
					{
						l = A[o];
						if (z + q == s + l && z + l > s + l && z + s < q)
						{
							System.out.print("l");
							System.out.print(" ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(" ");
							System.out.print(q);
							System.out.print("\n");
							System.out.print("z");
							System.out.print(" ");
							System.out.print(z);
							System.out.print("\n");
							System.out.print("s");
							System.out.print(" ");
							System.out.print(s);
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
