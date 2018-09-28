package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int j;
		int y;
		int f;
		int[] z = new int[26];
		int k;
		int m;
		char[][] a = new char[100][10000];
		String b = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			f = 0;
			for (x = 0;x < 26;x++)
			{
				z[x] = 0;

			}
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				z[a[i][j] - 'a']++;
			}
			y = 0;
			k = 0;
			for (x = 0;x < 26;x++)
			{
				if (z[x] == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, x + 'a');
					y = 1;
					k++;
				}

			}
			if (y == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (m = 0;m < String.valueOf(a[i]).length();m++)
				{
					for (j = 0;j < k;j++)
					{
						if (a[i][m] == b.charAt(j))
						{
							System.out.printf("%c\n",b.charAt(j));
							f = 1;
							break;
						}


					}
					if (f == 1)
					{
						break;
					}
				}
			}


		}

		return 0;
	}



}

