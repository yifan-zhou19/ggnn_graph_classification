package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char *name;
	//		int final;
	//		int clas;
	//		char gan;
	//		char west;
	//		int essay;
	//	}
	//	a[100];
		int i;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i].name = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].final = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].clas = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gan = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].essay = tempVar7;
			}

			if (i < n - 1)
			{
				scanf("\n");
			}
		}
		int[] scholar = new int[100];
		for (i = 0;i < n;i++)
		{
			scholar[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			while (a[i].final > 80 && a[i].essay >= 1)
			{
				scholar[i] = scholar[i] + 8000;
				break;
			}
				while (a[i].final > 85 && a[i].clas > 80)
				{
				scholar[i] = scholar[i] + 4000;
				break;
				}
			while (a[i].final > 90)
			{
				scholar[i] = scholar[i] + 2000;
				break;
			}
			while (a[i].final > 85 && a[i].west == 'Y')
			{
				scholar[i] = scholar[i] + 1000;
				break;
			}
			while (a[i].clas > 80 && a[i].gan == 'Y')
			{
				scholar[i] = scholar[i] + 850;
				break;
			}
		}
		int k;
		for (i = 1,k = 0;i < n;i++)
		{
			if (scholar[i] > scholar[k])
			{
				k = i;
			}
		}
		int s;
		for (i = 0,s = 0;i < n;i++)
		{
			s = s + scholar[i];
		}
		System.out.printf("%s\n%d\n%d",a[k].name,scholar[k],s);
	}


}

