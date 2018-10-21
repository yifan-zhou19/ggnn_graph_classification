package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int zWeight;
		int qWeight;
		int sWeight;
		int lWeight;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							zWeight = 10 * z;
							qWeight = 10 * q;
							sWeight = 10 * s;
							lWeight = 10 * l;
						}
					}
				}
			}
		}
		if (lWeight > qWeight && qWeight > zWeight && zWeight > sWeight)
		{
				System.out.print("l");
				System.out.print(" ");
				System.out.print(lWeight);
				System.out.print("\n");
				System.out.print("q");
				System.out.print(" ");
				System.out.print(qWeight);
				System.out.print("\n");
				System.out.print("z");
				System.out.print(" ");
				System.out.print(zWeight);
				System.out.print("\n");
				System.out.print("s");
				System.out.print(" ");
				System.out.print(sWeight);
				System.out.print("\n");
		}
		if (lWeight > qWeight && qWeight > sWeight && sWeight > zWeight)
		{
				System.out.print("l");
				System.out.print(" ");
				System.out.print(lWeight);
				System.out.print("\n");
				System.out.print("q");
				System.out.print(" ");
				System.out.print(qWeight);
				System.out.print("\n");
				System.out.print("s");
				System.out.print(" ");
				System.out.print(sWeight);
				System.out.print("\n");
				System.out.print("z");
				System.out.print(" ");
				System.out.print(zWeight);
				System.out.print("\n");
		}

	}

}
