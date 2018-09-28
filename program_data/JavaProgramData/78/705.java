package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] b = {z, q, s, l};
		int cc1;
		int cc2;
		int cc3;
		int cc4;
		int sum;
	char num = ' ';
	for (z = 1;z < 6;z++)
	{
	  for (q = 1;q < 6;q++)
	  {
		for (s = 1;s < 6;s++)
		{
		for (l = 1;l < 6;l++)
		{
	cc1 = (z + l) > (s + q);
	cc2 = (z + s) < q;
	cc3 = (z != q) && (z != s) && (z != l) && (s != q) && (l != q) && (s != l);
	cc4 = (z + q) == (s + l);
	sum = cc1 != 0 && cc2 != 0 && cc3 != 0 && cc4 != 0;
	if (sum == 1)
	{
	for (int i = 5;i > 0;i--)
	{
	if (z == i)
	{
		System.out.print("z ");
		System.out.print(z * 10);
		System.out.print("\n");
	}
	if (q == i)
	{
		System.out.print("q ");
		System.out.print(q * 10);
		System.out.print("\n");
	}
	if (s == i)
	{
		System.out.print("s ");
		System.out.print(s * 10);
		System.out.print("\n");
	}
	if (l == i)
	{
		System.out.print("l ");
		System.out.print(l * 10);
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
