package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Z;
		int Q;
		int S;
		int L;
		int z;
		int q;
		int s;
		int l;
		int k;
		for (Z = 1; Z <= 5; Z++)
		{
		for (Q = 1; Q <= 5; Q++)
		{
		for (S = 1; S <= 5; S++)
		{
		for (L = 1; L <= 5; L++)
		{
			if ((Z + Q == S + L) && (Z + L > S + Q) && (Z + S < Q) && ((Z - Q) * (Z - S) * (Z - L) * (Q - S) * (Q - L) * (S - L) != 0))
			{
				z = Z;
				q = Q;
				s = S;
				l = L;
				break;
			}
		}
		}
		}
		}
		k = 1;
		while (k <= 4)
		{
			k = k + 1;
			if (z > q && z > s && z > l)
			{
				System.out.print("z ");
				System.out.print(10 * z);
				System.out.print("\n");
				z = 0;
				continue;
			}
			if (q > z && q > s && q > l)
			{
				System.out.print("q ");
				System.out.print(10 * q);
				System.out.print("\n");
				q = 0;
				continue;
			}
			if (s > z && s > q && s > l)
			{
				System.out.print("s ");
				System.out.print(10 * s);
				System.out.print("\n");
				S = 0;
				continue;
			}
			if (l > z && l > q && l > s)
			{
				System.out.print("l ");
				System.out.print(10 * l);
				System.out.print("\n");
				l = 0;
				continue;
			}
		}
		return 0;
	}
}
