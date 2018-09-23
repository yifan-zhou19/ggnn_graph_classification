package <missing>;

public class GlobalMembers
{
	public static int cincd(String a)
	{
		int num = 0;
		for (int i = 0;;i++)
		{
			a[i] = System.in.read();
			if (a[i].equals('\n'))
			{
				break;
			}
			num++;
		}
			return num;
	} //????????
	public static void coutt(String a, int length)
	{
		for (int i = 0;i < length;i++)
		{
			System.out.print(a[i]);
		}
	} //????????
	public static int Main()
	{
		char[][] a = new char[100][20];
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int x = 0; //d???????? ,e?f???b?c???,num?????
		int[] d = new int[100];
		int e;
		int f;
		int num = 0;
		for (int j = 0;;j++)
		{
			a[x][j] = System.in.read();
			if (a[x][j] == '\n')
			{
				d[x] = j;
				num = x + 1;
				break;
			}
			if (a[x][j] == ' ')
			{
				d[x] = j;
				x++;
				j = -1;
			}
		} //??a
			e = cincd(b);
			f = cincd(c);
			for (int i = 0;i < num;i++)
			{
				if (i != 0)
				{
					System.out.print(" ");
				}
				if (d[i] == e)
				{
					int length = 0;
					for (int j = 0;j < e;j++)
					{
						if (a[i][j] == b.charAt(j))
						{
							length++;
						}
					}
						if (length == e)
						{
							coutt(c, f); //???????
						}
							else
							{
								coutt(a[i], d[i]); //????
							}
								continue;
				}
					else
					{
						coutt(a[i], d[i]); //????
					}
			}

				return 0;
	}

}
