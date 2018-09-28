package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int a; //qi mo
	//		int b; //ban ji
	//		char c; //ban gan
	//		char d; //xi bu
	//		int e; //lun wen
	//	}
	//	str[101];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[101]; //qian shu
		for (int k = 1;k <= n;k++)
		{
			a[k] = 0;
		}
		int sum = 0; //zong qian
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				str[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				str[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				str[i].c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				str[i].d = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				str[i].e = tempVar7;
			}
		}
		for (int j = 1;j <= n;j++)
		{
			if (str[j].a > 80 && str[j].e >= 1)
			{
				a[j] += 8000;
			}
			if (str[j].a > 85 && str[j].b > 80)
			{
				a[j] += 4000;
			}
			if (str[j].a > 90)
			{
				a[j] += 2000;
			}
			if (str[j].a > 85 && str[j].d == 'Y')
			{
				a[j] += 1000;
			}
			if (str[j].b > 80 && str[j].c == 'Y')
			{
				a[j] += 850;
			}
			sum += a[j];
		}
		int w = a[1];
		int q = 1;
		for (int t = 2;t <= n;t++)
		{
			if (a[t] > w)
			{
				w = a[t];

				q = t;
			}
		}
		System.out.printf("%s\n",str[q].name);
		System.out.printf("%d\n",a[q]);
		System.out.printf("%d\n",sum);
	}

}

