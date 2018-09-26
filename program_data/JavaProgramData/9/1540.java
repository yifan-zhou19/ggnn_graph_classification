package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char id[30];
	//		int ag;
	//	}
	//	a[105],temp;
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
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].ag = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				if (a[j - 1].ag >= 60 && a[j].ag >= 60)
				{
					if (a[j - 1].ag < a[j].ag)
					{
						temp = a[j - 1];
						a[j - 1] = a[j];
						a[j] = temp;
					}
				}
				else if (a[j - 1].ag < 60 && a[j].ag >= 60)
				{
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i].id);
		}
	}
}

