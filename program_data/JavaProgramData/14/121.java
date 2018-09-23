public class student
	{
		public int num;
		public int chinese;
		public int math;
		public int total;
	}

package <missing>;

public class GlobalMembers
{
		public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
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
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
			a[i].total = a[i].chinese + a[i].math;
		}
		int max;
		int numm;
		max = a[1].total;
		for (int j = 0;j < 3;j++)
		{
		for (i = 0;i < n;i++)
		{
			if (max < a[i].total)
			{
				max = a[i].total;
				numm = i;
			}
		}
			System.out.printf("%d %d\n",numm + 1,max);
			a[numm].total = 0;
			max = 0;
		}
		return 0;
	}

}

