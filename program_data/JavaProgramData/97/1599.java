package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int hun;
		int fif;
		int twe;
		int ten;
		int fiv;
		int one;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		hun = n / 100;
		fif = (n - hun * 100) / 50;
		twe = (n - hun * 100 - fif * 50) / 20;
		ten = (n - hun * 100 - fif * 50 - twe * 20) / 10;
		fiv = (n - hun * 100 - fif * 50 - twe * 20 - ten * 10) / 5;
		one = (n - hun * 100 - fif * 50 - twe * 20 - ten * 10 - fiv * 5) / 1;
		int[] sz = {hun, fif, twe, ten, fiv, one};
		int i;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",sz[i]);
		}
		return 0;
	}
}

