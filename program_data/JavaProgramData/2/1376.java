package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct a
	//	{
	//		char y[30];
	//		int x,l;
	//	}
	//	a[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct b
	//	{
	//		char y;
	//		int x;
	//	}
	//	b[26];
		int i;
		int j;
		int p;
		char k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
			a[i].l = String.valueOf(a[i].y).length();
		}
		for (i = 0;i <= 25;i++)
		{
			b[i].y = i + 65;
			b[i].x = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < a[i].l;j++)
			{
				for (k = 65;k <= 90;k++)
				{
					if (a[i].y[j] == k)
					{
						b[k - 65].x = b[k - 65].x + 1;
					}
				}
			}
		}
		int max = b[0].x;
		for (i = 0;i <= 25;i++)
		{
			if (b[i].x > max)
			{
				max = b[i].x;
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (b[i].x == max)
			{
				System.out.printf("%c\n",b[i].y);
				System.out.printf("%d\n",b[i].x);
				for (j = 0;j < n;j++)
				{
					for (p = 0;p < a[j].l;p++)
					{
						if (a[j].y[p] == b[i].y)
						{
							System.out.printf("%d\n",a[j].x);
							break;
						}
					}
				}
				break;
			}
		}
		}
		return 0;
	}
}

