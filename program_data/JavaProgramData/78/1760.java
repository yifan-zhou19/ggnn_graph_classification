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
		for (z = 1;z < 6;z++)
		{
		for (q = 1;q < 6;q++)
		{
			if (z == q)
			{
				continue;
			}
			for (s = 1;s < 6;s++)
			{
				if (s == q || s == z)
				{
					continue;
				}
			for (l = 1;l < 6;l++)
			{
				if (l == z || l == q || l == s)
				{
					continue;
				}
				if (z + q == l + s)
				{
				if (z + l > s + q)
				{
				if (z + s < q)
				{
					for (i = 5;i > 0;i--)
					{
						if (i == z)
						{
							System.out.print("z");
							System.out.print(" ");
							System.out.print(z * 10);
							System.out.print("\n");
						}
						 else if (i == q)
						 {
							System.out.print("q");
							System.out.print(" ");
							System.out.print(q * 10);
							System.out.print("\n");
						 }
						 else if (i == s)
						 {
							 System.out.print("s");
							 System.out.print(" ");
							 System.out.print(s * 10);
							 System.out.print("\n");
						 }
						 else if (i == l)
						 {
							 System.out.print("l");
							 System.out.print(" ");
							 System.out.print(l * 10);
							 System.out.print("\n");
						 }
						 else
						 {
							 ;
						 }
					}
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
