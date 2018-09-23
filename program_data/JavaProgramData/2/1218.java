package <missing>;

public class GlobalMembers
{
	public static char[] name = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] count = new int[26];
		int max = 0;
		for (i = 0;i < 26;i++)
		{
			count[i] = 0;
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char man[26];
	//	}
	//	book[999];
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
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].man = tempVar3;
			}
			for (j = 0;book[i].man[j];j++)
			{
				if (book[i].man[j] == 'A')
				{
					count[0]++;
				}
				else if (book[i].man[j] == 'B')
				{
					count[1]++;
				}
				else if (book[i].man[j] == 'C')
				{
					count[2]++;
				}
				else if (book[i].man[j] == 'D')
				{
					count[3]++;
				}
				else if (book[i].man[j] == 'E')
				{
					count[4]++;
				}
				else if (book[i].man[j] == 'F')
				{
					count[5]++;
				}
				else if (book[i].man[j] == 'G')
				{
					count[6]++;
				}
				else if (book[i].man[j] == 'H')
				{
					count[7]++;
				}
				else if (book[i].man[j] == 'I')
				{
					count[8]++;
				}
				else if (book[i].man[j] == 'J')
				{
					count[9]++;
				}
				else if (book[i].man[j] == 'K')
				{
					count[10]++;
				}
				else if (book[i].man[j] == 'L')
				{
					count[11]++;
				}
				else if (book[i].man[j] == 'M')
				{
					count[12]++;
				}
				else if (book[i].man[j] == 'N')
				{
					count[13]++;
				}
				else if (book[i].man[j] == 'O')
				{
					count[14]++;
				}
				else if (book[i].man[j] == 'P')
				{
					count[15]++;
				}
				else if (book[i].man[j] == 'Q')
				{
					count[16]++;
				}
				else if (book[i].man[j] == 'R')
				{
					count[17]++;
				}
				else if (book[i].man[j] == 'S')
				{
					count[18]++;
				}
				else if (book[i].man[j] == 'T')
				{
					count[19]++;
				}
				else if (book[i].man[j] == 'U')
				{
					count[20]++;
				}
				else if (book[i].man[j] == 'V')
				{
					count[21]++;
				}
				else if (book[i].man[j] == 'W')
				{
					count[22]++;
				}
				else if (book[i].man[j] == 'X')
				{
					count[23]++;
				}
				else if (book[i].man[j] == 'Y')
				{
					count[24]++;
				}
				else if (book[i].man[j] == 'Z')
				{
					count[25]++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				t = i;
			}
		}
		System.out.printf("%c\n%d\n",name[t],max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].man[j];j++)
			{
				if (book[i].man[j] == name[t])
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
		return 0;
	}
}

