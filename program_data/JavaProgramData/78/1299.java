package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String name = "zqsl";
		int i;
		int max = 0;
		int weiz;
		int weiq;
		int weis;
		int weil;
		int[] wei = new int[4];
		for (weiz = 10; weiz <= 50; weiz += 10)
		{
			for (weiq = 10; weiq <= 50; weiq += 10)
			{
				for (weis = 10; weis <= 50; weis += 10)
				{
					for (weil = 10; weil <= 50; weil += 10)
					{
						if ((weiz + weiq == weis + weil) && (weiz + weil > weis + weiq) && (weiz + weis < weiq))
						{
							wei[0] = weiz;
							wei[1] = weiq;
							wei[2] = weis;
							wei[3] = weil;
						}
					}
				}
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (wei[i] == 50)
			{
				System.out.print(name.charAt(i));
				System.out.print(' ');
				System.out.print("50");
				System.out.print("\n");
				wei[i] = 0;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (wei[i] == 40)
			{
				System.out.print(name.charAt(i));
				System.out.print(' ');
				System.out.print("40");
				System.out.print("\n");
				wei[i] = 0;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (wei[i] == 30)
			{
				System.out.print(name.charAt(i));
				System.out.print(' ');
				System.out.print("30");
				System.out.print("\n");
				wei[i] = 0;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (wei[i] == 20)
			{
				System.out.print(name.charAt(i));
				System.out.print(' ');
				System.out.print("20");
				System.out.print("\n");
				wei[i] = 0;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (wei[i] == 10)
			{
				System.out.print(name.charAt(i));
				System.out.print(' ');
				System.out.print("10");
				System.out.print("\n");
			}
		}
		return 0;
	}

}
