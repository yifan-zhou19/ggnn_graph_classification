package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int m = 0;
		int n = 0;
		int g = 0;
		int i;
		int j;
		int a;
		int b;
		for (i = 1;i <= 5;i++)
		{
			z = i * 10;
			for (j = 1;j <= 5;j++)
			{
				q = j * 10;
				for (a = 1;a < 6;a++)
				{
					s = a * 10;
					for (b = 1;b < 6;b++)
					{
						l = b * 10;
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
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
							m = 1;
							break;
						}
					}
					if (m == 1)
					{
						n = 1;
						break;
					}
				}
				if (n == 1)
				{
					g = 1;
					break;
				}
			}
			if (g == 1)
			{
				break;
			}
		}
		return 0;
	}
}
