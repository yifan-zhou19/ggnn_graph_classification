package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "                                                                                                                                                                                                                                                                          ";
		int[] b = new int[200];
		int[] c = new int[200];
		int i;
		int j = 0;
		int d = 0;
		int e = 100;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				b[j] += 1;
			}
			else
			{
				j += 1;
				c[j] = i;
			}
		}
		for (j = 0;j < 200;j++)
		{
			if (b[j] > d)
			{
				d = b[j];
			}
			if (b[j] < e && b[j] != 0)
			{
				e = b[j];
			}
		}
		for (j = 0;j < 200;j++)
		{
			if (b[j] == d)
			{
				if (c[j] == 0)
				{
					for (i = c[j];i < c[j] + d - 1;i++)
					{
					System.out.printf("%c",a.charAt(i));
					}
				System.out.printf("%c\n",a.charAt(c[j] + d - 1));
				}
				else
				{

				for (i = c[j] + 1;i < c[j] + d;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				System.out.printf("%c\n",a.charAt(c[j] + d));
				}
				break;
			}
		}
		for (j = 0;j < 200;j++)
		{
			if (b[j] == e)
			{
				if (c[j] == 0)
				{
					for (i = c[j];i < c[j] + e-1;i++)
					{
					System.out.printf("%c",a.charAt(i));
					}
				System.out.printf("%c\n",a.charAt(c[j] + e-1));
				}
				else
				{


				for (i = c[j] + 1;i < c[j] + e;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				System.out.printf("%c\n",a.charAt(c[j] + e));
				}
				break;
			}
		}

		return 0;
	}
}
