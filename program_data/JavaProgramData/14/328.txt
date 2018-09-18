public class student
{
	public int num;
	public int yw;
	public int sx;
	public int he;
}

package <missing>;

public class GlobalMembers
{
	public static student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static int Main()
	{
		int i;
		int n;
		int j;
		int s = 0;
		int m;
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
				student[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				student[i].yw = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				student[i].sx = Integer.parseInt(tempVar4);
			}
			student[i].he = student[i].yw + student[i].sx;
		}
		for (i = 0;i < n;i++)
		{
			m = student[0].he;
			for (j = n - 1;j > 0;j--)
			{

				m = student[j].he > m != 0?student[j].he:m;
			}

			for (j = 0;j < n;j++)
			{
				if (student[j].he == m)
				{
					System.out.printf("%d %d\n",student[j].num,student[j].he);
				student[j].he = 0;
				s = s + 1;
				if (s == 3)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto guiyi;
				}
				}

			}

		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		guiyi:
		return 0;

	}
}

