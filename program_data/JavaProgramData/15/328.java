package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int area;
		int flag = 1;
		int glaf = 0;
		int a_1;
		int a_2;
		int b_1;
		int b_2;
		int term_1;
		int term_2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			term_2 = 1;
			for (j = 0;j < n;j++)
			{
				term_1 = term_2;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					term_2 = Integer.parseInt(tempVar2);
				}
				if (flag != 0)
				{
					if (term_2 == 0)
					{
						a_1 = i;
						b_1 = j;
						flag = flag == 0;
					}
				}
				else
				{
					if (glaf == 0 && i > a_1 && term_1 == 0 && term_2 == 0)
					{
						a_2 = i;
						glaf = glaf == 0;
					}
					if (glaf != 0 && term_1 == 0 && term_2 == 255)
					{
						b_2 = j - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto label;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	label:
	area = (a_2 - a_1 - 1) * (b_2 - b_1 - 1);
		  System.out.printf("%d\n",area);
		  return 0;
	}





}

