package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct books
	//	{
	//		int book;
	//		char writer[20];
	//	}
	//	bk[1000];
		int n;
		int i;
		int j;
		int m;
		int max;
		int k;
		int maxw = 0;
		int flag = 0;
		int[] a = new int[26];
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
				bk[i].book = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bk[i].writer = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(bk[i].writer).length();
			for (j = 0;j < m;j++)
			{
				k = bk[i].writer[j];
				a[k - 65]++;
			}
		}
		max = a[0];
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxw = i;
			}
		}
		System.out.printf("%c\n%d\n",maxw + 65,max);
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(bk[i].writer).length();
			for (j = 0;j < m;j++)
			{
				if (maxw + 65 == bk[i].writer[j])
				{
					System.out.printf("%d\n",bk[i].book);
				}

			}
		}
		return 0;
	}

















}

