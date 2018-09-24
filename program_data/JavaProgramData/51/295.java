package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[510]);
		String mark = new String(new char[6]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct cc
	//	{
	//		char w[6];
	//		int num;
	//	}
	//	b[500];
		int n;
		int i;
		int j;
		int flag = 0;
		int len;
		int q = 0;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		len = a.length();
		for (i = 0;i <= len - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				mark = tangible.StringFunctions.changeCharacter(mark, j, a.charAt(j + i));
			}
			mark = mark.substring(0, j);
			if (q == 0)
			{
				b[0].w = mark;
				q++;
				b[0].num = 1;
			}
			else
			{
				for (j = 0;j < q;j++)
				{
					if (strcmp(mark,b[j].w) == 0)
					{
						b[j].num++;
						break;
					}
				}
				if (j == q)
				{
					b[q].w = mark;
					b[q].num = 1;
					q++;
				}
			}
		}
		for (i = 0;i < q;i++)
		{
			if (b[i].num > max)
			{
				max = b[i].num;
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
		System.out.printf("%d\n",max);
		for (i = 0;i < q;i++)
		{
			if (b[i].num == max)
			{
				System.out.printf("%s\n",b[i].w);
			}
		}
		}
	}
}

