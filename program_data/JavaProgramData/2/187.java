public class book
{
	public int num;
	public String w = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(100);
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int[] b = new int[26];
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
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].w = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].w.charAt(j) != '\0';j++)
			{
					if (book[i].w.charAt(j) == 'A')
					{
						b[0]++;
					}
					else if (book[i].w.charAt(j) == 'B')
					{
						b[1]++;
					}
					else if (book[i].w.charAt(j) == 'C')
					{
						b[2]++;
					}
					else if (book[i].w.charAt(j) == 'D')
					{
						b[3]++;
					}
					else if (book[i].w.charAt(j) == 'E')
					{
						b[4]++;
					}
					else if (book[i].w.charAt(j) == 'F')
					{
						b[5]++;
					}
					else if (book[i].w.charAt(j) == 'G')
					{
						b[6]++;
					}
					else if (book[i].w.charAt(j) == 'H')
					{
						b[7]++;
					}
					else if (book[i].w.charAt(j) == 'I')
					{
						b[8]++;
					}
					else if (book[i].w.charAt(j) == 'J')
					{
						b[9]++;
					}
					else if (book[i].w.charAt(j) == 'K')
					{
						b[10]++;
					}
					else if (book[i].w.charAt(j) == 'L')
					{
						b[11]++;
					}
					else if (book[i].w.charAt(j) == 'M')
					{
						b[12]++;
					}
					else if (book[i].w.charAt(j) == 'N')
					{
						b[13]++;
					}
					else if (book[i].w.charAt(j) == 'O')
					{
						b[14]++;
					}
					else if (book[i].w.charAt(j) == 'P')
					{
						b[15]++;
					}
					else if (book[i].w.charAt(j) == 'Q')
					{
						b[16]++;
					}
					else if (book[i].w.charAt(j) == 'R')
					{
						b[17]++;
					}
					else if (book[i].w.charAt(j) == 'S')
					{
						b[18]++;
					}
					else if (book[i].w.charAt(j) == 'T')
					{
						b[19]++;
					}
					else if (book[i].w.charAt(j) == 'U')
					{
						b[20]++;
					}
					else if (book[i].w.charAt(j) == 'V')
					{
						b[21]++;
					}
					else if (book[i].w.charAt(j) == 'W')
					{
						b[22]++;
					}
					else if (book[i].w.charAt(j) == 'X')
					{
						b[23]++;
					}
					else if (book[i].w.charAt(j) == 'Y')
					{
						b[24]++;
					}
					else if (book[i].w.charAt(j) == 'Z')
					{
						b[25]++;
					}
			}
		}
		for (i = 0;i <= 25;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (b[i] < b[j])
				{
					break;
				}
			}
			if (j == 26)
			{
				System.out.printf("%c\n%d\n",65 + i,b[i]);
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (l = 0;book[j].w.charAt(l) != '\0';l++)
			{
				if (book[j].w.charAt(l) == 65 + i)
				{
					System.out.printf("%d\n",book[j].num);
					break;
				}
			}
		}
	}
}

