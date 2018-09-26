package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct br
	//	{
	//		char x[10];
	//		int y;
	//	}
	//	*b,c[100],e;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		b = (br)malloc(sizeof(br) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i].y) = tempVar3;
			}
		}
		for (i = 0,m = 0;i < n;i++)
		{
			if (b[i].y >= 60)
			{
				c[m] = b[i];
				m++;
				b[i].y = -1;
			}
			for (k = 0;k < m;k++)
			{
				for (j = m - 1;j > k;j--)
				{
				   if (c[j].y > c[j - 1].y)
				   {
					e = c[j];
					c[j] = c[j - 1];
					c[j - 1] = e;
				   }
				}
			}
		}
		for (i = 0;i < m;i++)
		{
				System.out.printf("%s\n",c[i].x);
		}
		for (i = 0;i < n;i++)
		{
			if (b[i].y != -1)
			{
				System.out.printf("%s\n",b[i].x);
			}
		}
		return 0;
	}
}

