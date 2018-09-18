package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int n;
		int max;
		int l;
		int y = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char aut[26];
	//	}
	//	book[1000];
		int[] a = new int[26];
		char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'z'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].aut = tempVar3;
			}
		}



		for (i = 0; i < 26; i++)
		{
			for (j = 0; j < m; j++)
			{
				l = String.valueOf(book[j].aut).length();
				for (k = 0; k < l; k++)
				{
					if (book[j].aut[k] == b[i])
					{
						a[i]++;
					}
				}
			}
		}


		for (i = m; i > 0; i--)
		{
			for (j = 0; j < 26; j++)
			{
				if (a[j] == i)
				{
					max = a[j];
					n = j;
					System.out.printf("%c\n", b[j]);
					System.out.printf("%d\n", a[j]);
					y = 1;
					break;
				}
			}
			if (y == 1)
			{
				break;
			}
		}



		for (i = 0; i < m; i++)
		{
			l = String.valueOf(book[i].aut).length();
			for (j = 0; j < l; j++)
			{
				if (book[i].aut[j] == b[n])
				{
					System.out.printf("%d\n", book[i].num);
				}
			}
		}
		return 0;
	}
}

