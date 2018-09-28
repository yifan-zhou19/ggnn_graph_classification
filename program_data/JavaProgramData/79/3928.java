package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[10];
		int[] m = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[0] = Integer.parseInt(tempVar2);
		}
		int i;
		for (i = 1;n[i - 1] != 0 && m[i - 1] != 0;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;n[i] != 0 && m[i] != 0;i++)
		{
			int j;
			int[] hou = new int[360];
			for (j = 0;j < 360;j++)
			{
				hou[j] = j + 1;
			}
			int count = 0;
			int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	for (j = 0;j < n[i];j++)
	{
			if (hou[j] != 0)
			{
			count++;
			}
			if (count == m[i])
			{
			hou[j] = 0;
			count = 0;
			}
	}
			for (j = 0;j < n[i];j++)
			{
			if (hou[j] != 0)
			{
			num++;
			}
			}
			if (num > 1)
			{
				num = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
			if (num == 0)
			{
				int h = n[i];
				System.out.printf("%d\n",h);
			}
			for (j = 0;j < n[i];j++)
			{
				if (hou[j] != 0)
				{
			System.out.printf("%d\n",hou[j]);
			break;
				}
			}
		}
		return 0;
	}

}

