package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct people
	//	{
	//		int x,y;
	//	}
	//	a[60000];
		int n;
		int i = -1;
		int count = -1;
		int j;
		int k;
		int elite = 0;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
			i++;
			count++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
		} while (a[i].x != 0 || a[i].y != 0);
		for (i = 0;i < count;i++)
		{
			for (j = 0;j < count;j++)
			{
				if (a[j].y == a[i].y)
				{
					num++;
				}
			}
			if (num == n - 1)
			{
				for (k = 0;k < count;k++)
				{
					if (a[k].x != a[i].y)
					{
						elite++;
					}
				}
				if (elite == count)
				{
					System.out.printf("%d\n",a[i].y);
					return 0;
				}
				else
				{
					elite = 0;
					num = 0;
				}
			}
			else
			{
				elite = 0;
				num = 0;
			}
		}
		System.out.print("NOT FOUND\n");
		return 0;
	}
}

