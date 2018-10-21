package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[6];
		for (z = 1;z <= 5;z++)
		{
		for (q = 1;q <= 5;q++)
		{
		for (s = 1;s <= 5;s++)
		{
		for (l = 1;l <= 5;l++)
		{
			a[1] = a[2] = a[3] = a[4] = a[5] = 0;
			a[z] = a[q] = a[s] = a[l] = 1;
			if (a[1] + a[2] + a[3] + a[4] + a[5] == 4)
			{
			if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
			{
			System.out.print("l ");
			System.out.print(l * 10);
			System.out.print("\n");
			System.out.print("q ");
			System.out.print(q * 10);
			System.out.print("\n");
			System.out.print("z ");
			System.out.print(z * 10);
			System.out.print("\n");
			System.out.print("s ");
			System.out.print(s * 10);


			}
			}
		}
		}
		}
		}

		return 0;
	}

}
