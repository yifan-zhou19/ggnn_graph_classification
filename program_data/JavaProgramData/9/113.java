package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int z;
		int y;
		y = 0;
		z = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct member
	//	{
	//		char xh[10];
	//		int ag;
	//	};
		member[] a = tangible.Arrays.initializeWithDefaultmemberInstances(100);
		member[] b = tangible.Arrays.initializeWithDefaultmemberInstances(101);
		member[] c = tangible.Arrays.initializeWithDefaultmemberInstances(100);
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
				a[i].xh = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].ag = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i].ag >= 60)
			{
				b[y] = a[i];
			y++;
			}
			else
			{
				c[z] = a[i];
			z++;
			}
		}

		for (i = 1;i < y;i++)
		{
			for (j = 0;j < y - i;j++)
			{
				if (b[j].ag < b[j + 1].ag)
				{
					b[100] = b[j];
					b[j] = b[j + 1];
					b[j + 1] = b[100];
				}
			}
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf("%s\n",b[i].xh);
		}
		for (i = 0;i < z;i++)
		{
			System.out.printf("%s\n",c[i].xh);
		}
	}
}

