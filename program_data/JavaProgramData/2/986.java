package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int t;
		int g;
		int max;
		char q;
		int[] d = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a;
	//		char b[26];
	//
	//	}
	//	s[999];
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
				s[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].b = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			d[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(s[i].b).length();
			for (j = 0;j < m;j++)
			{
				t = s[i].b[j] - 'A';
				d[t]++;
			}
		}
		max = 0;
		for (j = 0;j < 25;j++)
		{
			if (d[j] > max)
			{
				max = d[j];
				g = j;
			}
		}
		q = 'A' + g;
		System.out.printf("%c\n%d\n",q,max);

		for (i = 0;i < n;i++)
		{
			m = String.valueOf(s[i].b).length();
			for (j = 0;j < m;j++)
			{
				if (s[i].b[j] - 'A' == g)
				{
					System.out.printf("%d\n",s[i].a);
				}
			}
		}



			return 0;

	}

}

