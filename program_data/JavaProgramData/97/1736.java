package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 9;a >= 0;a--)
		{
			for (b = 1;b >= 0;b--)
			{
				for (c = 2;c >= 0;c--)
				{
					for (d = 1;d >= 0;d--)
					{
						for (e = 1;e >= 0;e--)
						{
							for (f = 4;f >= 0;f--)
							{
								if (r == 100 * a + 50 * b + 20 * c + 10 * d + 5 * e + f)
								{
									System.out.print(a);
									System.out.print("\n");
									System.out.print(b);
									System.out.print("\n");
									System.out.print(c);
									System.out.print("\n");
									System.out.print(d);
									System.out.print("\n");
									System.out.print(e);
									System.out.print("\n");
									System.out.print(f);
									System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
									goto label;
								}
							}
						}
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		label:
		return 0;
	}


}

