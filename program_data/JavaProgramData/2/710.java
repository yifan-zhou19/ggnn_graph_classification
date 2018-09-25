package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int m;
	//		char s[26];
	//	}
	//	p[999];

		int i;
		int j;
		int len;
		int n;
		int[][] a = new int[26][1000];
		int w;
		int t;

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
				p[i].m = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].s = tempVar3;
			}
			len = String.valueOf(p[i].s).length();
			for (j = 0;j < len;j++)
			{
				t = (p[i].s)[j] - 'A';
				a[t][0] += 1;
				w = a[t][0];
				a[t][w] = p[i].m;
			}
		}

		int max = a[0][0];
		int k = 0;
		for (i = 1;i < 26;i++)
		{
			if (a[i][0] > max)
			{
				max = a[i][0];
				k = i;
			}
		}

		System.out.printf("%c\n",k + 'A');
		System.out.printf("%d\n",max);
		for (i = 1;i <= max;i++)
		{
			System.out.printf("%d\n",a[k][i]);
		}
		 return 0;
	}

}

