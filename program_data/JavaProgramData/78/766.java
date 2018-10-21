package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int C1;
		int C2;
		int C3;
		l = 50;
		q = 40;
		for (z = 10; z <= 30; z += 10)
		{
			for (s = 10; s <= 30; s += 10)
			{
				C1 = (z + q) == (s + l);
				C2 = (z + l) > (s + q);
				C3 = (z + s) < q;
				if (C1 != 0 && C2 != 0 && C3 != 0 && (z != s))
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
		return 0;
	}
}
