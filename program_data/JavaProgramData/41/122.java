package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ranka;
		int rankb;
		int rankc;
		int rankd;
		int ranke;
		int num = 0;
		int[] a = new int[6];
		int i;

			for (ranka = 1;ranka <= 5;ranka++)
			{
			for (rankb = 1;rankb <= 5;rankb++)
			{
				if (rankb != ranka)
				{
				for (rankc = 1;rankc <= 5;rankc++)
				{
					if ((rankc != ranka) && (rankc != rankb))
					{
					for (rankd = 1;rankd <= 5;rankd++)
					{
						if ((rankd != ranka) && (rankd != rankb) && (rankd != rankc))
						{
						for (ranke = 1;ranke <= 5;ranke++)
						{
							if ((ranke != ranka) && (ranke != rankb) && (ranke != rankc) && (ranke != rankd))
							{
						a[ranka] = (ranke == 1);
						a[rankb] = (rankb == 2);
						a[rankc] = (ranka == 5);
						a[rankd] = (rankc != 1);
						a[ranke] = (rankd == 1);

						if (a[1] != 0 && a[2] != 0 && a[3] == 0 && a[4] == 0 && a[5] == 0 && ranke != 2 && ranke != 3)
						{

							System.out.print(ranka);
							System.out.print(" ");
							System.out.print(rankb);
							System.out.print(" ");
							System.out.print(rankc);
							System.out.print(" ");
							System.out.print(rankd);
							System.out.print(" ");
							System.out.print(ranke);
						}

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
