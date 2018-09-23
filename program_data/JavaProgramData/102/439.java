package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int num = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char sex[8];
	//		double ag;
	//	}
	//	a[300],temp;
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
				a[i].sex = tempVar2;
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
				if (strcmp(a[j - 1].sex,"female") == 0 && strcmp(a[j].sex,"female") == 0)
				{
					if (a[j - 1].ag < a[j].ag)
					{
						temp = a[j - 1];
						a[j - 1] = a[j];
						a[j] = temp;
					}
				}
				else if (strcmp(a[j - 1].sex,"female") == 0 && strcmp(a[j].sex,"male") == 0)
				{
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
				else if (strcmp(a[j - 1].sex,"male") == 0 && strcmp(a[j].sex,"male") == 0)
				{
					if (a[j - 1].ag > a[j].ag)
					{
						temp = a[j - 1];
						a[j - 1] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.2lf%c",a[i].ag,i == n - 1?'\n':' ');
		}
	}
}

