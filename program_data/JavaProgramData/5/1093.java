package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int p = 0;
		float m;
		float k;
		float s = 0F;
		char[][] zfc = new char[2][500];
		String n = new String(new char[10]);
		n = new Scanner(System.in).nextLine();
		m = Double.parseDouble(n);
		for (i = 0;i < 2;i++)
		{
			zfc[i] = new Scanner(System.in).nextLine();
		}
		a = String.valueOf(zfc[0]).length();
		b = String.valueOf(zfc[1]).length();
		if (a != b)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 2;i++)
			{
				for (j = 0;zfc[i][j] != '\0';j++)
				{
					if (zfc[i][j] != 'A' && zfc[i][j] != 'G' && zfc[i][j] != 'C' && zfc[i][j] != 'T')
					{
						p = 1;
					}
				}
			}
			if (p == 0)
			{
				for (i = 0;zfc[0][i] != '\0';i++)
				{
						if (zfc[0][i] == zfc[1][i])
						{
							s++;
						}
				}
					k = s / (a * 1.0);
					if (k > m)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
			}
				else
				{
					System.out.print("error");
				}
		}
			return 0;
	}

}
