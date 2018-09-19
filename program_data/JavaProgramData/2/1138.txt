package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[26];
	public static char[][] b = new char[1000][100];
	public static char out;

	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int tmp = 0;
		int tmp1 = 0;
		int tmp2;
		int[] a = new int[1000];
		out = 'A';
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			for (j = 0;j < String.valueOf(b[i]).length();j++)
			{
				if (b[i][j] == 'A')
				{
					c[0]++;
				}
				if (b[i][j] == 'B')
				{
					c[1]++;
				}
				if (b[i][j] == 'C')
				{
					c[2]++;
				}
				if (b[i][j] == 'D')
				{
					c[3]++;
				}
				if (b[i][j] == 'E')
				{
					c[4]++;
				}
				if (b[i][j] == 'F')
				{
					c[5]++;
				}
				if (b[i][j] == 'G')
				{
					c[6]++;
				}
				if (b[i][j] == 'H')
				{
					c[7]++;
				}
				if (b[i][j] == 'I')
				{
					c[8]++;
				}
				if (b[i][j] == 'J')
				{
					c[9]++;
				}
				if (b[i][j] == 'K')
				{
					c[10]++;
				}
				if (b[i][j] == 'L')
				{
					c[11]++;
				}
				if (b[i][j] == 'M')
				{
					c[12]++;
				}
				if (b[i][j] == 'N')
				{
					c[13]++;
				}
				if (b[i][j] == 'O')
				{
					c[14]++;
				}
				if (b[i][j] == 'P')
				{
					c[15]++;
				}
				if (b[i][j] == 'Q')
				{
					c[16]++;
				}
				if (b[i][j] == 'R')
				{
					c[17]++;
				}
				if (b[i][j] == 'S')
				{
					c[18]++;
				}
				if (b[i][j] == 'T')
				{
					c[19]++;
				}
				if (b[i][j] == 'U')
				{
					c[20]++;
				}
				if (b[i][j] == 'V')
				{
					c[21]++;
				}
				if (b[i][j] == 'W')
				{
					c[22]++;
				}
				if (b[i][j] == 'X')
				{
					c[23]++;
				}
				if (b[i][j] == 'Y')
				{
					c[24]++;
				}
				if (b[i][j] == 'Z')
				{
					c[25]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{

			if (c[i] > tmp)
			{
				tmp = c[i];
				tmp1 = i;
			}
		}

		System.out.printf("%c\n%d\n",out + tmp1,tmp);
		for (i = 0;i < n;i++)
		{
			for (j = 0;b[i][j] != '\0';j++)
			{
				tmp2 = b[i][j];

				if (tmp2 == (out + tmp1))
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
	}
}

