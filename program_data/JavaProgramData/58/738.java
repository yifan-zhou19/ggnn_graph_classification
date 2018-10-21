package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[100][81];
		int n;
		int i;
		int[] a = new int[81];
		int j;
		int k;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
		}
		for (j = 0;j < n;j++)
		{
			for (k = 0;k < String.valueOf(s[j]).length();k++)
			{
				a[k] = (int)s[j][k];
			}
			if (a[0] == 95 || (a[0] > 96 && a[0] < 123) || (a[0]>64 && a[0] < 91))
			{
				for (r = 0;r < String.valueOf(s[j]).length();r++)
				{
					if ((a[r] > 96 && a[r] < 123) || (a[r]>64 && a[r] < 91) || (a[r] == 95) || (a[r]>47 && a[r] < 58))
					{
						if (r == String.valueOf(s[j]).length() - 1)
						{
							System.out.print("1\n");
						}
						else
						{
							continue;
						}
					}
					else
					{
						System.out.print("0\n");
						break;
					}
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

