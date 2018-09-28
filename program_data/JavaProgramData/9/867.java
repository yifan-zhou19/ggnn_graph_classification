package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct man
	//	{
	//		char a[11];
	//		int y;
	//	}
	//	man[100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String b = new String(new char[11]);
		int y;
		int i;
		int j;
		char[][] c = new char[100][11];
		int m = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if (y >= 60)
			{
				man[k].a = b;
				man[k].y = y;
				k++;
			}
			else
			{
				c[m] = b;
				m++;
			}
		}
		for (i = 1;i < k;i++)
		{
			for (j = 0;j < k - i;j++)
			{
				int y1;
				int y2;
				y1 = man[j].y;
				y2 = man[j + 1].y;
				if (y1 < y2)
				{
					y = man[j + 1].y;
					man[j + 1].y = man[j].y;
					man[j].y = y;
					b = man[j + 1].a;
					man[j + 1].a = man[j].a;
					man[j].a = b;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			b = man[i].a;
			System.out.printf("%s\n",b);
		}
		for (i = 0;i < m;i++)
		{
			b = c[i];
			System.out.printf("%s\n",b);
		}
		return 0;
	}
}

