package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ID
	//	{
	//		char x[100];
	//		int y;
	//	}
	//	da[100],xiao[100],p[100],e;
		int s;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < s;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p[i].y) = tempVar3;
			}
			if (p[i].y >= 60)
			{
				da[m] = p[i];
				m++;
			}
			else
			{
				xiao[n] = p[i];
				n++;
			}
		}

		for (int b = 1;b <= m;b++)
		{
			for (int v = 0;v < m - b;v++)
			{
				if (da[v].y < da[v + 1].y)
				{
					e = da[v];
					da[v] = da[v + 1];
					da[v + 1] = e;
				}
			}
		}
		int h;
		int f;
		for (int z = 0;z < m;z++)
		{
			f = String.valueOf(da[z].x).length();
			for (int g = 0;g < f;g++)
			{
				if (g != f - 1)
				{
					System.out.printf("%c",da[z].x[g]);
				}
				else
				{
					System.out.printf("%c\n",da[z].x[g]);
				}
			}
		}
		for (int a = 0;a < n;a++)
		{
			h = String.valueOf(xiao[a].x).length();
			for (int j = 0;j < h;j++)
			{
				if (j != h - 1)
				{
					System.out.printf("%c",xiao[a].x[j]);
				}
				else
				{
					System.out.printf("%c\n",xiao[a].x[j]);
				}
			}
		}




		return 0;
	}

}

