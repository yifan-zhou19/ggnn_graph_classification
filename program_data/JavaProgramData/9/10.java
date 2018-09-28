package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String tmp = new String(new char[100]);
		int n;
		int i;
		int j = 0;
		int o = 0;
		int tmpn;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char num[100];
	//		int a,k;
	//	}
	//	s[1000],t[1000];
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
				s[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].a = tempVar3;
			}
			if (s[i].a >= 60)
			{
				s[i].k = 1;
			}
			else
			{
				s[i].k = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].k == 1)
			{
				t[j].num = s[i].num;
				t[j].a = s[i].a;
				j++;
				o++;
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (t[j].a < t[j + 1].a)
				{
					tmpn = t[j].a;
					t[j].a = t[j + 1].a;
					t[j + 1].a = tmpn;
					tmp = t[j].num;
					t[j].num = t[j + 1].num;
					t[j + 1].num = tmp;
				}
			}
		}
		for (i = 0;i < o;i++)
		{
			System.out.printf("%s\n",t[i].num);
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].k == 1)
			{
				continue;
			}
			System.out.printf("%s\n",s[i].num);
		}
		return 0;
	}
}

