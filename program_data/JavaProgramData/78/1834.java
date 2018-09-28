package <missing>;

public class GlobalMembers
{
	/*
	 *???????.cpp
	 *?????
	 *????: 2012-10-16
	 *?????????????????????????????????????????????????
	 */


	public static int Main()
	{
		int Zw; //?????????????Zw,Qw,Sw,Lw,????i
		int Qw;
		int Sw;
		int Lw;
		int i;
		for (Zw = 10;Zw <= 50;Zw = Zw + 10) //for??
		{
		for (Qw = 10;Qw <= 50;Qw = Qw + 10) //for??
		{
				if (Zw == Qw) //?????
				{
					continue; //????
				}
				for (Sw = 10;Sw <= 50;Sw = Sw + 10) //for??
				{
					if (Zw == Sw || Qw == Sw) //?????
					{
						continue; //????
					}
					for (Lw = 10;Lw <= 50;Lw = Lw + 10) //for??
					{
						if (Zw == Lw || Qw == Lw || Sw == Lw) //?????
						{
							continue; //????
						}

						if (Zw + Qw == Sw + Lw) //?????
						{
							if (Zw + Lw > Sw + Qw) //????
							{
								if (Zw + Sw < Qw) //????
								{
									for (i = 50;i >= 10;i = i - 10) //for??
									{
										if (Zw == i)
										{
											System.out.print("z ");
											System.out.print(i);
											System.out.print("\n");
										}
										if (Qw == i)
										{
											System.out.print("q ");
											System.out.print(i);
											System.out.print("\n");
										}
										if (Sw == i)
										{
											System.out.print("s ");
											System.out.print(i);
											System.out.print("\n");
										}
										if (Lw == i)
										{
											System.out.print("l ");
											System.out.print(i);
											System.out.print("\n");
										}
									}
								}
							}
						}
					}
				}
		}
		}
					return 0; //????
	}

}
