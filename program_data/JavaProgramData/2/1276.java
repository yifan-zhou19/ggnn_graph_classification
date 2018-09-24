package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int no;
	//		char as[10];
	//	}
	//	bk;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book[] books = tangible.Arrays.initializeWithDefaultbookInstances(n);

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk.no = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk.as = tempVar3;
			}
			books[i] = bk;
		}

		int[] cnts = new int[256];
		for (i = 0; i < n; i++)
		{
			bk = books[i];
			for (j = 0; bk.as[j]; j++)
			{
				cnts[bk.as[j]]++;
			}
		}

		int count = 0;
		for (int max = 1000; max > 0; max--)
		{
			for (char c = 'A'; c <= 'Z'; c++)
			{
				if (cnts[c] == max)
				{
					System.out.printf("%c\n%d\n", c, max);
					for (i = 0; i < n; i++)
					{
						bk = books[i];
						for (j = 0; bk.as[j]; j++)
						{
							if (bk.as[j] == c)
							{
								System.out.printf("%d\n", bk.no);
								break;
							}
						}
					}
					count++;
				}
			}
			if (count == 1)
			{
				books = null;
				return 0;
			}
		}

		books = null;
		return -1;
	}

}

