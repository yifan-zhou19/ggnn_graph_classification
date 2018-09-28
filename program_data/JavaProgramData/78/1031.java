package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (int i = 1;i <= 5;i++)
		{
			z = 10 * i;
			for (int j = 1;j <= 5;j++)
			{
				q = 10 * j;
				for (int k = 1;k <= 5;k++)
				{
					s = 10 * k;
					for (int t = 1;t <= 5;t++)
					{
						l = 10 * t;
						if ((z + s) < q && (z + l)>(s + q) && (z + q) == (s + l))
						{
							System.out.print("l ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print("q ");
							System.out.print(q);
							System.out.print("\n");
							System.out.print("z ");
							System.out.print(z);
							System.out.print("\n");
							System.out.print("s ");
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
