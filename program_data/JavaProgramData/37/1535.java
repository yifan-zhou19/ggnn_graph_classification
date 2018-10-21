package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int k;
		int p;
		int count = 0;
		int b = 0;
		char[][] a = new char[100][100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < t + 1;i++)
		{
			for (k = 0;k < String.valueOf(a[i]).length();k++)
			{
				for (p = 0;p < String.valueOf(a[i]).length();p++)
				{
					if (a[i][k] == a[i][p] && k != p)
					{
						count++;
					}
				}
				if (count == 0)
				{
					System.out.printf("%c\n",a[i][k]);
					break;
				}
				else
				{
					b++;
				}
				count = 0;
			}
			if (b == String.valueOf(a[i]).length() && i != 0)
			{
				System.out.print("no\n");
			}
			b = 0;
		}
		return 0;
	}

}

