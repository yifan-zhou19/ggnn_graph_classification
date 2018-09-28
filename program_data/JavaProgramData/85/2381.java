package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		char[][] zfc = new char[1000][30];
		String m = new String(new char[100]);
		m = new Scanner(System.in).nextLine();
		n = Integer.parseInt(m);
		for (i = 0;i < n;i++)
		{
			   zfc[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			a = 1;
			if ((zfc[i][0] >= 'a' && zfc[i][0] <= 'z') || (zfc[i][0] >= 'A' && zfc[i][0] <= 'Z') || (zfc[i][0] == '_'))
			{
				1;
			}
			else
			{
				a = 0;
			}
			for (j = 1;zfc[i][j] != '\0';j++)
			{
				if ((zfc[i][j] >= 'a' && zfc[i][j] <= 'z') || (zfc[i][j] >= 'A' && zfc[i][j] <= 'Z') || (zfc[i][j] == '_') || (zfc[i][j] >= '0' && zfc[i][j] <= '9'))
				{
					1;
				}
				else
				{
					 a = 0;
				}
			}
			if (a == 0)
			{
				System.out.print("no\n");
			}
			else if (a == 1)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}
