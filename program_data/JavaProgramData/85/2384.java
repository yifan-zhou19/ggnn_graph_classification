package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		n = Integer.parseInt(a);
		char[][] zf = new char[100000][21];
		for (i = 0;i < n;i++)
		{
			zf[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			m = 1;
			if ((zf[i][0] >= 'a' && zf[i][0] <= 'z') || (zf[i][0] >= 'A' && zf[i][0] <= 'Z') || zf[i][0] == '_')
			{
				m = 1;
			}
			else
			{
				m = 0;
			}
			for (k = 1;zf[i][k] != '\0';k++)
			{
				if ((zf[i][k] >= 'A' && zf[i][k] <= 'Z') || (zf[i][k] >= 'a' && zf[i][k] <= 'z') || (zf[i][k] >= '0' && zf[i][k] <= '9') || zf[i][k] == '_')
				{
					1;
				}
				else
				{
					m = 0;
				}
			}
			if (m == 1)
			{
				System.out.print("yes\n");
			}
			else if (m == 0)
			{
				System.out.print("no\n");
			}
		}

		return 0;
	}







}
