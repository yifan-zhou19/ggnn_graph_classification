package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char a[100];
	//	};
		book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		int n;
		int i;
		int j;
		int s;
		int t = 0;
		int m;
		int h;
		int[] c = new int[1000];
		String d = new String(new char[27]);
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
			b[i].num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i].a = tempVar3;
		}
		}
		d = tangible.StringFunctions.changeCharacter(d, 0, b[0].a[0]);
		t = 1;
		c[0] = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;b[i].a[j] != 0;j++)
			{
				int x = 0;
				for (s = 0;s < t;s++)
				{
					if (b[i].a[j] == d.charAt(s))
					{
						c[s] = c[s] + 1;
						x = 0;
						break;
					}
					else
					{
					x = 1;
					}
				}
				if (x == 1)
				{
					t++;
					d = tangible.StringFunctions.changeCharacter(d, t - 1, b[i].a[j]);
					c[t - 1] = 1;
				}
			}
		}
		m = c[0];
		h = 0;
		for (i = 0;i < t;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
				h = i;
			}
		}
		System.out.printf("%c\n%d\n",d.charAt(h),m);
		for (i = 0;i < n;i++)
		{
			for (j = 0;b[i].a[j] != 0;j++)
			{
				if (b[i].a[j] == d.charAt(h))
				{
					System.out.printf("%d\n",b[i].num);
					break;
				}
			}
		}
	}
}

