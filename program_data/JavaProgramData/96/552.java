package <missing>;

public class GlobalMembers
{
	public static final String a = "";
	public static int[] b = new int[200];
	public static int[] c = new int[200];
	public static int[] r = new int[200];
	public static int[] q = new int[200];
	public static int len;
	public static int lenofr = 0;
	public static int x = 0;
	public static int y = 0;
	public static void devide1(int n)
	{
		int i;
		int j;

		x = 10 * y + r[n];
		if (n != 0)
		{
			System.out.print(x / 13);
		}
		y = x % 13;

	}
	public static void devide2(int n)
	{
		int i;
		int j;

		x = 10 * y + r[n];
		if (n != 0 && n != 1)
		{
			System.out.print(x / 13);
		}
		y = x % 13;

	}
	public static int Main()
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		int i;
		int j;
		for (i = 0;i < len;i++)
		{
			r[i] = a.charAt(i) - '0';
		}

		//cout<<r[0]<<r[1]<<endl;
		if (len == 1)
		{
			System.out.print(0);
			System.out.print("\n");
			System.out.print(r[0]);
			System.out.print("\n");
		}
		if (len == 2)
		{
			System.out.print((10 * r[0] + r[1]) / 13);
			System.out.print("\n");
			System.out.print((10 * r[0] + r[1]) % 13);
			System.out.print("\n");
		}
		if (len >= 3)
		{
			if ((10 * r[0] + r[1]) >= 13)
			{
				lenofr = len - 1;
				{
					for (i = 0;i <= lenofr;i++)
					{
				devide1(i);
					}
			System.out.print("\n");
			System.out.print(y);
			System.out.print("\n");
				}
			}
			else
			{
				lenofr = len - 2;
				{
					for (i = 0;i <= lenofr + 1;i++)
					{
				devide2(i);
					}
			System.out.print("\n");
			System.out.print(y);
			System.out.print("\n");
				}
			}
			//cout<<lenofr;

		}


			return 0;
	}
}

