package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int ta;
		int tb;
		int t;
		String[] a = {""};
		String[] b = {""};
		String blank = new String(new char[3]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = new Scanner(System.in).nextLine();
			blank = new Scanner(System.in).nextLine();
		}


		for (i = 0; i < n; i++)
		{
			ta = 0;
			tb = 0;
			for (j = 0; a[i][j] != '\0'; j++)
			{
				ta++;
			}
			for (j = 0; b[i][j] != '\0'; j++)
			{
				tb++;
			}
			for (j = tb - 1; j >= 0; j--)
			{
				if (a[i][ta - tb + j] < b[i][j])
				{
					a[i][ta - tb + j] = a[i][ta - tb + j] + 10 - b[i][j] + 48;
					for (t = ta - tb + j - 1; t >= 0; t--)
					{
						if (a[i][t] > 48)
						{
							a[i][t]--;
							break;
						}
						else
						{
							a[i][t] = 57;
						}
					}

				}
				else
				{
					a[i][ta - tb + j] = a[i][ta - tb + j] - b[i][j] + 48;
				}

			}
		}

		for (i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}

	}
}

