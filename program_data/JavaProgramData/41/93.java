package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] s = new int[5];
		for (a = 0;a < 5;a++)
		{
						for (b = 0;b < 5;b++)
						{
										if (b == a)
										{
										continue;
										}
										//cout<<"kkk";
										for (c = 0;c < 5;c++)
										{
														if (b == c || c == a)
														{
														continue;
														}
														//cout<<"sss";
														for (d = 0;d < 5;d++)
														{
																		if (d == c || d == b || d == a)
																		{
																		continue;
																		}
																		//cout<<"sasas";
																		e = 10 - a - b - c - d;
																		if (e == 1 || e == 2)
																		{
																		break;
																		}
																		else
																		{
																		s[a] = (e == 0);
																		}
																		s[b] = (b == 1);
																		s[c] = (a == 4);
																		s[d] = (c != 0);
																		s[e] = (d == 0);
																		if (s[0] + s[1] == 2 && s[2] + s[3] + s[4] == 0)
																		{
																		System.out.print(a + 1);
																		System.out.print(" ");
																		System.out.print(b + 1);
																		System.out.print(" ");
																		System.out.print(c + 1);
																		System.out.print(" ");
																		System.out.print(d + 1);
																		System.out.print(" ");
																		System.out.print(e+1);
																		System.out.print("\n");
																		}
														}
										}
						}
		}


		return 0;
	}

}
