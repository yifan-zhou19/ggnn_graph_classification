package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[120][102];
		char[][] b = new char[120][102];
		int n;
		int i;
		int j;
		int k;
		int r;
		int d;
		int l;
		int cao;
		for (i = 1;i <= 200;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			if (String.valueOf(a[i]).length() == 0)
			{
				break;
			}
		}
		for (j = 1;j <= i - 1;j++)
		{
			for (k = 0;k <= String.valueOf(a[j]).length() - 1;k++)
			{

				if (a[j][k] == ')')
				{
					if (k == 0)
					{
						l = 0;
					}
					for (r = 0,cao = 0;r <= k - 1;r++)
					{
						if (a[j][r] == '(')
						{
							for (d = r + 1,l = 1;d <= k - 1;d++)
							{
								if (a[j][d] == ')')
								{
									l--;
								}
								else if (a[j][d] == '(')
								{
									l++;
								}
							}
							if (l > 0)
							{
								cao++;
							}
						}

					}
					if (cao > 0)
					{
						b[j][k] = ' ';
					}
					else
					{
						b[j][k] = '?';
					}
				}
				else if (a[j][k] == '(')
				{
					if (k == String.valueOf(a[j]).length() - 1)
					{
						l = 0;
					}
					for (r = k + 1,cao = 0;r <= String.valueOf(a[j]).length() - 1;r++)
					{
						if (a[j][r] == ')')
						{
							for (d = r - 1,l = 1;d >= k + 1;d--)
							{
								if (a[j][d] == '(')
								{
									l--;
								}
								else if (a[j][d] == ')')
								{
									l++;
								}
							}
							if (l > 0)
							{
								cao++;
							}
						}
					}
					if (cao > 0)
					{
						b[j][k] = ' ';
					}
					else
					{
						b[j][k] = '$';
					}
				}
				else
				{
					b[j][k] = ' ';
				}
			}
		}
		for (j = 1;j <= i - 1;j++)
		{
			System.out.printf("%s\n%s\n",a[j],b[j]);
		}
		return 0;
	}
}
