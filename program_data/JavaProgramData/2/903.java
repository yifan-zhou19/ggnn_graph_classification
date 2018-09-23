package <missing>;

public class GlobalMembers
{
	public static int trans(char k)
	{
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int i;
		for (i = 0;i < 26;i++)
		{
			if (k == a[i])
			{
				return i;
			}
		}
	}


	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int id;
	//		char au[26];
	//	}
	//	books[1000];
		int[] num = new int[26];
		int i;
		for (i = 0;i < 26;i++)
		{
			num[i] = 0;
		}
		int j;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				books[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				books[i].au = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			int k;
			k = String.valueOf(books[i].au).length();
			for (j = 0;j < k;j++)
			{
				int b;
				b = trans(books[i].au[j]);
				num[b]++;
			}
		}
		int max = 0;
		int most;
		for (i = 0;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				most = i;
			}
		}
		char aumost;
		aumost = 'A' + most;
		System.out.printf("%c\n",aumost);
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			int k;
			k = String.valueOf(books[i].au).length();
			for (j = 0;j < k;j++)
			{
				if (books[i].au[j] == 'A' + most)
				{
					System.out.printf("%d\n",books[i].id);
					break;
				}
			}
		}
		return 0;
	}







}

