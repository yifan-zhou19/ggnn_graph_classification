package <missing>;

public class GlobalMembers
{
	public static char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static int num = 0;
	public static int linelen = 0;
	public static int Main()
	{
		int n;
		int k;
		int cnt = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(b);
		k = b.length(); //?????????
		linelen = k; //?????
		while (true)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num = a.length(); //?&#63541;?????????
			if (linelen == 0)
			{ //?????
					{
						System.out.print("\n");
						System.out.print(a);
						cnt++;
						linelen = linelen + num;
				}
			}
			else
			{
				if (num + linelen + 1 > 80)
				{ //&#63537;??????????&#63325;??????????&#63325;??????80??
					System.out.print("\n");
					System.out.print(a);
					cnt++;
					linelen = num; //?&#63359;?????????
				}
				else
				{
					if (num + linelen + 1 == 80)
					{ //&#63537;??????
						System.out.print(" ");
						System.out.print(a);
						cnt++;
						linelen = 0; //??&#63325;?????0
					}
					else
					{
							System.out.print(" ");
							System.out.print(a);
							cnt++;
							linelen = linelen + num + 1; //??&#63325;?????&#63325;???+??+???
					}
				}
			if (cnt == n - 1)
			{
					break;
			}
			}
		}
		return 0;
	}
}

