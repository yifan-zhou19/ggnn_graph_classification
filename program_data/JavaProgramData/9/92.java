package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int n = 0;
		int k = 0;
		int i = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct man
	//	{
	//		int number;
	//		char name[10];
	//	}
	//	m[100],p[100],s;
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
				m[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m[i].number = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i].number >= 60)
			{
				p[k] = m[i];
				k++;
			}
		}
		for (a = k - 1;a > 0;a--)
		{
			for (b = 0;b < a;b++)
			{
				if (p[b].number < p[b + 1].number)
				{
					s = p[b + 1];
				   p[b + 1] = p[b];
				   p[b] = s;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (m[i].number < 60)
			{
				p[k] = m[i];
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",p[i].name);
		}
	}
}

