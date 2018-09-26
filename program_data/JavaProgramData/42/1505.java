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
	//	a[100000];
		int n;
		int i;
		int k;
		int count;
		int j = 0;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].num == k)
			{
				a[i].status = 0;
				count--;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].status && j != (count - 1))
			{
				System.out.printf("%d ",a[i].num);
				j++;
			}
			else
			{
				if (a[i].status && j == count - 1)
				{
					System.out.printf("%d",a[i].num);
				}
			}
		}
		return 0;
	}
}

