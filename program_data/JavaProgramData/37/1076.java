package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[10][10000];
		int t;
		int i;
		int j;
		int k;
		int[] l = new int[10];
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l[i] = String.valueOf(a[i]).length();
		}

		for (i = 0;i < t;i++)
		{
			for (j = 0;j < l[i];j++)
			{
				for (k = 0;k < l[i];k++)
				{
					if ((a[i][j] == a[i][k]) && (j != k))
					{
						break;
					}
					else
					{
						s = s + 1;
					}
				}
				if (s == l[i])
				{
					break;
				}
				else
				{
					s = 0;
				}
			}
			if (s == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",a[i][j]);
				s = 0;
			}
		}
		return 0;
	}
}

