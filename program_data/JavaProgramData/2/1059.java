package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct x
	//	{
	//		char num[26];
	//		int y;
	//	}
	//	q[1000],x0;

		int n;
		int i;
		int j;
		int[] c = new int[100];
		int m = 0;
		int f;

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
					q[i].y = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					q[i].num = tempVar3;
				}
			}

		for (i = 0;i < n;i++)
		{
			for (j = 0;q[i].num[j] != '\0';j++)
			{
					  m = (int)q[i].num[j],c[m] = c[m] + 1;
			}
		}

	for (m = 0;m < 100;m++)
	{
	if (c[m] > c[0])
	{
	f = m,c[0] = c[m];
	}
	}

	System.out.printf("%c\n%d\n",(char)f,c[f]);
	for (i = 0;i < n;i++)
	{
	for (j = 0;q[i].num[j] != '\0';j++)
	{
	if (q[i].num[j] == (char)f)
	{
	System.out.printf("%d\n",q[i].y);
	}
	}
	}

	}
}

