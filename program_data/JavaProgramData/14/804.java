package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int j;
		int[] b = new int[100000];
		int t;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int lang;
	//		int math;
	//	};
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].lang = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].math = tempVar4;
			}
		}
		for (i = 0;i < n;i++)
		{
			b[i] = a[i].lang + a[i].math;
		}
		for (j = 0;j < 3;j++)
		{
			for (i = 1;i < n - j;i++)
			{
				if (b[j] < b[j + i])
				{
					t = b[j];
					b[j] = b[j + i];
					b[j + i] = t;
				}
			}
		}
		for (j = 0;j < 3;j++)
		{
			for (i = 0;i < n;i++)
			{
				m = a[i].lang + a[i].math;
				if (m == b[j] && i != s)
				{
					System.out.printf("%d %d\n",a[i].num,m);
					s = i;
					break;
				}
			}
		}
	}



}

