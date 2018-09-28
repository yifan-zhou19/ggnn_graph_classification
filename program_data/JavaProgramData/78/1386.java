package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
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
		   if (z == s || q == s)
		   {
		   continue;
		   }
		for (l = 1;l < 6;l++)
		{
			if (z == l || q == l || s == l)
			{
			continue;
			}
		if ((z + q == s + l) && (z + l > s + q) && (z + s) < q)
		{
			System.out.print("l");
			System.out.print(" ");
			System.out.print(l * 10);
			System.out.print("\n");
		System.out.print("q");
		System.out.print(" ");
		System.out.print(q * 10);
		System.out.print("\n");
		System.out.print("z");
		System.out.print(" ");
		System.out.print(z * 10);
		System.out.print("\n");
		System.out.print("s");
		System.out.print(" ");
		System.out.print(s * 10);
		System.out.print("\n");
		}
		}
		}
		}
		}

		return 0;
	}

}
