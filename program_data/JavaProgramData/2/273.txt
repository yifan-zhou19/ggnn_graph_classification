package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int t;
		int[] d = new int[26];
		int f = 0;
		int c;
		int h;
		int e = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int N;
	//		char name[20];
	//	}
	//	p[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].N = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].name = tempVar3;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			a = String.valueOf(p[i].name).length();
			for (t = 0;t <= a - 1;t++)
			{
				c = p[i].name[t] - 'A';
				d[c]++;
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (e < d[i])
			{
				e = d[i];
				f = i;
			}
		}
		h = f + 'A';
		System.out.printf("%c\n%d\n",h,e);
		for (i = 0;i <= n - 1;i++)
		{
			a = String.valueOf(p[i].name).length();
			for (t = 0;t <= a - 1;t++)
			{
				if (p[i].name[t] == h)
				{
				System.out.printf("%d\n",p[i].N);
				break;
				}
			}
		}
	}
}

