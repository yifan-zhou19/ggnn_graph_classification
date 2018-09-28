package <missing>;

public class GlobalMembers
{
	public static int susu(int a)
	{
		if (a % 2 == 0)
		{
			return 0;
		}
		int i;
		int k = 1;
		for (i = 3;i <= Math.sqrt(a);i = i + 2)
		{
			if (a % i == 0)
			{
				k = 0;
			}
		}
			return k;
	}
	public static int Main()
	{
		int n;
		int m;
		int l;
		int z;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (z = 6;z <= n;z = z + 2)
		{
			for (l = 3;l <= (z / 2);l = l + 2)
			{
				if (susu(l) + susu(z - l) == 2)
				{
					System.out.print(z);
					System.out.print("=");
					System.out.print(l);
					System.out.print("+");
					System.out.print((z - l));
					System.out.print("\n");
					break;
				}
				else
				{
					continue;
				}
			}
		}
			return 0;
	}





}

