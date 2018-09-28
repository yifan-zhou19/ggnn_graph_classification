package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int y,a;
	//		char id[10];
	//	}
	//	p[100],t;
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
				p[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].y = tempVar3;
			}
			p[i].a = i + 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (p[i].y >= 60 || p[j].y >= 60)
				{
				  if (p[j].y > p[i].y)
				  {
					t = p[i];
					p[i] = p[j];
					p[j] = t;
				  }
				  else if (p[i].y == p[j].y)
				  {
					  if (p[j].a < p[i].a)
					  {
						t = p[i];
					p[i] = p[j];
					p[j] = t;
					  }
				  }
				}
				else
				{
					if (p[j].a < p[i].a)
					{
						t = p[i];
					p[i] = p[j];
					p[j] = t;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[i].id);
		}
	return 0;
	}

}

