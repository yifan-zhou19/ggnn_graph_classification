package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][][] s = new char[999][3][27];
	int m;
	int i;
	int j;
	int k;
	int[] Nn = new int[27];
	int ctrl;
	/*11111*/
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[k][1] = tempVar2.charAt(0);
			}
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 s[k][2] = tempVar3.charAt(0);
			 }
		}
	/*2222*/
		for (i = 1;i <= 26;i++)
		{
			Nn[i] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 0;s[i][2][j] != '\0';j++)
			{
				if (s[i][2][j] == 'A')
				{
					Nn[1]++;
				}
				else if (s[i][2][j] == 'B')
				{
					Nn[2]++;
				}
				else if (s[i][2][j] == 'C')
				{
					Nn[3]++;
				}
				else if (s[i][2][j] == 'D')
				{
					Nn[4]++;
				}
				else if (s[i][2][j] == 'E')
				{
					Nn[5]++;
				}

				else if (s[i][2][j] == 'F')
				{
					Nn[6]++;
				}
				else if (s[i][2][j] == 'G')
				{
					Nn[7]++;
				}
				else if (s[i][2][j] == 'H')
				{
					Nn[8]++;
				}
				else if (s[i][2][j] == 'I')
				{
					Nn[9]++;
				}

				else if (s[i][2][j] == 'J')
				{
					Nn[10]++;
				}
				else if (s[i][2][j] == 'K')
				{
					Nn[11]++;
				}
				else if (s[i][2][j] == 'L')
				{
					Nn[12]++;
				}
				else if (s[i][2][j] == 'M')
				{
					Nn[13]++;
				}

				else if (s[i][2][j] == 'N')
				{
					Nn[14]++;
				}
				else if (s[i][2][j] == 'O')
				{
					Nn[15]++;
				}
				else if (s[i][2][j] == 'P')
				{
					Nn[16]++;
				}
				else if (s[i][2][j] == 'Q')
				{
					Nn[17]++;
				}

				else if (s[i][2][j] == 'R')
				{
					Nn[18]++;
				}
				else if (s[i][2][j] == 'S')
				{
					Nn[19]++;
				}

				else if (s[i][2][j] == 'T')
				{
					Nn[20]++;
				}
				else if (s[i][2][j] == 'U')
				{
					Nn[21]++;
				}
				else if (s[i][2][j] == 'V')
				{
					Nn[22]++;
				}
				else if (s[i][2][j] == 'W')
				{
					Nn[23]++;
				}


				else if (s[i][2][j] == 'X')
				{
					Nn[24]++;
				}

				else if (s[i][2][j] == 'Y')
				{
					Nn[25]++;
				}
				else if (s[i][2][j] == 'Z')
				{
					Nn[26]++;
				}

			}
		}
	/*33333*/
	int Nmax = 0;
	int zimuxu;
			for (i = 1;i <= 26;i++)
			{
				if (Nn[i] > Nmax)
				{
					Nmax = Nn[i];
					zimuxu = i;
				}
			}
	/*4444444*/
			System.out.printf("%c\n",'A' + zimuxu - 1);
			System.out.printf("%d\n",Nmax);
	/*5555*/
			for (j = 1;j <= m;j++)
			{
				ctrl = 0;
				for (k = 0;s[j][2][k] != '\0';k++)
				{
					if (s[j][2][k] == 'A' + zimuxu - 1)
					{
						ctrl++;
					}
				}
				if (ctrl != 0)
				{
					System.out.printf("%s\n",s[j][1]);
				}
			}
	}


}

