package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[10010]);
	public static int l;
	public static int n;
	public static int i;
	public static int j;

	public static void biubiu(int ks, int ll)
	{
		int k;
		if (ll - ks < 80)
		{
			for (i = ks; i < ll; i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
		}
		else
		{
			if (a.charAt(ks + 79) == ' ')
			{
				for (i = ks; i < ks + 79; i++)
				{
				System.out.print(a.charAt(i));
				}
				System.out.print("\n");
				biubiu(ks + 80, ll);
			}
			else
			{
				if (a.charAt(ks + 80) == ' ')
				{
					for (i = ks; i <= ks + 79; i++)
					{
					System.out.print(a.charAt(i));
					}
					System.out.print("\n");
					biubiu(ks + 81, ll);
				}

				else
				{
					for (k = ks + 78; k > ks; k--)
					{
					if (a.charAt(k) == ' ')
					{
						break;
					}
					}
					for (i = ks; i < k; i++)
					{
					System.out.print(a.charAt(i));
					}
					System.out.print("\n");
					biubiu(k + 1, ll);
				}

			}
		}

	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		l = a.length();
		int ll = l;
		i = l;
		while (a.charAt(i) == ' ')
		{
			i--;
			ll--;
		}
		for (i = 0; i < l; i++)
		{
			if (i == 0 && a.charAt(i) == ' ')
			{
				for (j = 0; j < l - 1; j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				i--;
				ll--;
			}
		}
		biubiu(0, ll);
		return 0;
	}
	/*
	84
	One sweltering day, I was scooping ice cream into cones and told my four children they could "buy" a cone from me for a hug. Almost immediately, the kids lined up to make their purchases. The three youngest each gave me a quick hug, grabbed their cones and raced back outside. But when my teenage son at the end of the line finally got his turn to "buy" his ice cream, he gave me two hugs. "Keep the changes," he said with a smile.
	*/

}

