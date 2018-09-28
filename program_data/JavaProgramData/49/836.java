package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[502]);
		char[][] b = new char[50000][4];
		String t = new String(new char[4]);
		char z;
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		int r;
		int s;
		int u;
		int count = 0;



		n = 0;
		z = System.in.read();
		while (z != '\n')
		{
			n++;
			a = tangible.StringFunctions.changeCharacter(a, n, z);
			z = System.in.read(); //1?n  n???  a[n]
		}

		for (i = 1;i <= n - 1;i++) //????????????kaoshiwuyali
		{

			for (j = 1;i + j - 1 >= 1 && i + j - 1 <= n;j++)
			{
				if ((int)a.charAt(i + j - 1) == (int)a.charAt(i - j))
				{
					b[count + 1][1] = i - j; //????
					b[count + 1][2] = i + j - 1; //????
					b[count + 1][3] = 2 * j; //??
					count++;
				}
				else
				{
					 break;
				}
			}
			for (k = 1;i - k <= n != 0 && i + k <= n;k++)
			{
				if ((int)a.charAt(i + k) == (int)a.charAt(i - k))
				{
					b[count + 1][1] = i - k;
					b[count + 1][2] = i + k;
					b[count + 1][3] = 2 * k + 1;
					count++;
				}
				else
				{
					break;
				}
			}
		}

		for (p = 1;p <= count - 1;p++)
		{
			for (m = 1;m <= count - p;m++)
			{
				if (b[m][3] > b[m + 1][3] || (b[m][3] == b[m + 1][3] && b[m][1] > b[m + 1][1]))
				{
					for (q = 1;q <= 3;q++)
					{
						t = tangible.StringFunctions.changeCharacter(t, q, b[m + 1][q]);
						b[m + 1][q] = b[m][q];
						b[m][q] = t.charAt(q);
					}
				}
			}
		}

		for (r = 1;r <= count;r++)
		{
			for (s = b[r][1];s <= b[r][2];s++)
			{
				System.out.print(a.charAt(s));
			}
			System.out.print("\n");
		}

		return 0;
	}











}

