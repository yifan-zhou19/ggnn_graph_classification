package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct num
	//	{
	//		char a[101];
	//		int na;
	//		char b[101];
	//		int nb;
	//		char c[101];
	//	}
	//	num[999];
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
				num[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i].b = tempVar3;
			}
			System.in.read();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;num[i].a[j] != '\0';j++)
			{
				num[i].na = j + 1;
			}
			for (j = 0;num[i].b[j] != '\0';j++)
			{
				num[i].nb = j + 1;
			}
			for (j = 1;j <= num[i].nb;j++)
			{
				num[i].c[num[i].na - j] = num[i].a[num[i].na - j] - num[i].b[num[i].nb - j] + '0';
				if (num[i].c[num[i].na - j] < '0')
				{
					num[i].a[num[i].na - j - 1]--;
					num[i].c[num[i].na - j] += 10;
				}
			}
			for (j = 0;j < num[i].na - num[i].nb;j++)
			{
				num[i].c[j] = num[i].a[j];
			}
			num[i].c[num[i].na] = '\0';
			System.out.printf("%s\n",num[i].c);

		}
	}
}

