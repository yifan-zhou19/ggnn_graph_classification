package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int yu;
	//		int shu;
	//		int c;
	//	}
	//	s[100000],k;
		int i;
		int j;
		int n;
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
				s[i].yu = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].shu = tempVar4;
			}
			s[i].c = s[i].yu + s[i].shu;
		}

	/*	for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(s[j].c<s[j+1].c)
				{
					k=s[j];
				    s[j]=s[j+1];
					s[j+1]=k;
				}
			}
		}
		for(i=0;i<3;i++)
			printf("%d %d\n",s[i].num,s[i].c);*/
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n - 1;j++)
			{
				if (s[j].c > s[i].c)
				{
					k = s[i];
					s[i] = s[j];
					s[j] = k;
				}
			}
			System.out.printf("%d %d\n",s[i].num,s[i].c);
		}
	}
}

