package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct strudent
	//	{
	//		char sex[7];
	//		float h;
	//		int c;
	//	}
	//	s[45],m[40],f[40],t;
		int n;
		int i;
		int j = 0;
		int k = 0;
		int female = 0;
		int male = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				s[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].h = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(s[i].sex).length();
			if (l == 4)
			{
				s[i].c = 1;
			}
			else if (l == 6)
			{
				s[i].c = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].c == 1)
			{
				m[male] = s[i];
				male++;
			}
			else if (s[i].c == 0)
			{
				f[female] = s[i];
				female++;
			}
		}
		for (i = 1;i < male;i++)
		{
			for (j = male-1;j > 0;j--)
			{
				if (m[j].h < m[j - 1].h)
				{
					t = m[j];
					m[j] = m[j - 1];
					m[j - 1] = t;
				}
			}
		}
		for (i = 1;i < female;i++)
		{
			for (j = female-1;j > 0;j--)
			{
				if (f[j].h > f[j - 1].h)
				{
					t = f[j];
					f[j] = f[j - 1];
					f[j - 1] = t;
				}
			}
		}
		for (i = 0;i < male;i++)
		{
			System.out.printf("%.2f ",m[i].h);
		}
		for (i = 0;i < female;i++)
		{
			if (i != female-1)
			{
				System.out.printf("%.2f ",f[i].h);
			}
			else
			{
				System.out.printf("%.2f",f[i].h);
			}
		}
		return 0;
	}
}

