public class stu
{
	public int num;
	public int mark1;
	public int mark2;
	public int total_mark;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t = 0;
		int max;
		stu p;
		stu q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (stu)malloc(1000000 * sizeof(stu));
		q = p;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p + i).mark1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p + i).mark2 = Integer.parseInt(tempVar4);
			}
			(p + i).total_mark = (p + i).mark1 + (p + i).mark2;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	max = 0;
			for (j = 0;j < n;j++)
			{
				if ((p + j).total_mark > max)
				{
					   max = (p + j).total_mark;
				}
			}
			for (k = 0;k < n;k++)
			{
				if (max == (p + k).total_mark && k < n)
				{
					System.out.printf("%d %ld\n",(p + k).num,(p + k).total_mark);
					 t++;
					(p + k).total_mark = 0;
					break;
				}
			}
			if (t < 3)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
	}
}

