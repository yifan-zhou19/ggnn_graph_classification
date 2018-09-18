package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int w = 0;
		int maxzm;
		int maxbk = 0;
		char c1;
		int[] zimu = new int[26];
		int[] lm = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int num;
	//		char a[100];
	//	}
	//	book[1000];
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
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   book[i].a = tempVar3;
		   }
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].a[j];j++)
			{
				for (k = 65;k < 91;k++)
				{
					if (book[i].a[j] == k)
					{
						zimu[k - 65]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			 if (zimu[i] > maxbk)
			 {
				 maxbk = zimu[i];
				 maxzm = i;
			 }
		}
		c1 = maxzm + 65;
		System.out.printf("%c\n",c1);
		System.out.printf("%d\n",maxbk);
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].a[j];j++)
			{
				if (book[i].a[j] == c1)
				{
					lm[w] = book[i].num;
					w++;
					continue;
				}

			}
		}
		for (i = 0;i < w;i++)
		{
			System.out.printf("%d\n",lm[i]);
		}




		return 0;
	}
}

