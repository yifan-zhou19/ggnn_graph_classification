package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct number
	//	{
	//		int num,status;
	//	}
	//	a[20000];
		int n;
		int i;
		int j;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		count = n;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			a[i].status = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i].num == a[j].num)
				{
					a[i].status = 0;
					count--;
					break;
				}
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			if (a[i].status && j != count - 1)
			{
				System.out.printf("%d ",a[i].num);
				j++;
				continue;
			}
			if (a[i].status && j == count - 1)
			{
				System.out.printf("%d\n",a[i].num);
				break;
			}
		}
		return 0;
	}
}

