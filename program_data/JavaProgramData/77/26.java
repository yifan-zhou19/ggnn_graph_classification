package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char boy;
		char girl;
		String s = new String(new char[520]);
		int n;
		int i;
		int m;
		int total;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct f
	//	{
	//		char c;
	//		int judge;
	//	}
	//	child[520];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		boy = s.charAt(0);
		for (i = 1;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != boy)
			{
				girl = s.charAt(i);
				break;
			}
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			child[i].c = s.charAt(i);
			child[i].judge = 1;
		}
		m = i;
		total = i;
		for (n = 1;m != 0;n++)
		{
			for (i = 0;i < total - 2;i++)
			{
				if (child[i].c == boy && child[i].judge == 1)
				{
					for (j = i + 1;j <= total - 1;j++)
					{
						if (child[j].judge == 1 && child[j].c == boy)
						{
							j = m + 100;
						}
						else if (child[j].judge == 1 && child[j].c == girl)
						{
							System.out.printf("%d %d\n",i,j);
							child[i].judge = 0;
							child[j].judge = 0;
							j = m + 100;
							i = total + 100;
							m = m - 2;
						}
					}
				}
			}
		}
		return 0;
	}


}

