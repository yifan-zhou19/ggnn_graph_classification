package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct photo
	//	{
	//		char sex[6];
	//		float h;
	//	}
	//	p[40];
		photo t = new photo();
		int i;
		int j;
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
				p[i].sex = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].h = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (p[j].sex[0] == 'm' && p[j + 1].sex[0] == 'm' && p[j].h > p[j + 1].h)
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
				if (p[j].sex[0] == 'f' && p[j + 1].sex[0] == 'f' && p[j].h < p[j + 1].h)
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
				if (p[j].sex[0] == 'f' && p[j + 1].sex[0] == 'm')
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%.2f ",p[i].h);
		}
		System.out.printf("%.2f\n",p[n - 1].h);

		return 0;
	}

}

