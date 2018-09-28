package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int j;
		char[][] zfc = new char[100][21];
		String num = new String(new char[100]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			zfc[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			a = String.valueOf(zfc[i]).length();
			b = 0;
			for (j = 0;j < a;j++)
			{
				if (zfc[i][j] == '_' || zfc[i][j] >= 'a' && zfc[i][j] <= 'z' || zfc[i][j] >= 'A' && zfc[i][j] <= 'Z' || zfc[i][j] >= '0' && zfc[i][j] <= '9')
				{
					b++;
				}
				if (j == 0 && zfc[i][j] >= '0' && zfc[i][j] <= '9')
				{
					b--;
				}
			}
			if (b == a)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}
