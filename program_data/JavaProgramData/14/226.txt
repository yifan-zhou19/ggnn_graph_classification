package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chs;
	//		int math;
	//	};
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		student[] s1 =
		{
			{0, 0, 0},
			{0, 0, 0}
		};
		int n;
		int i;
		int t;
		int j;
		int[] a = new int[100000];
		int k = 0;
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
				s[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].chs = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].math = tempVar4;
			}
			a[i] = s[i].chs + s[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = n - 1;i > n - 4;i--)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] == s[j].chs + s[j].math && s[j].num != s1[0].num && s[j].num != s1[1].num)
				{
					System.out.printf("%d %d\n",s[j].num,s[j].chs + s[j].math);
					s1[k] = s[j];
					k++;
					if (k == 3)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto end;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	  end:
		return 0;
	}
}

