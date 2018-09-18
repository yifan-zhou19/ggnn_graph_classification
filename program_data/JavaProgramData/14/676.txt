public class student
{
	public int num;
	public int chinese;
	public int math;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] s = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int max = 0;
		int t;
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].math = Integer.parseInt(tempVar4);
			}
			s[i] = a[i].chinese + a[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s[j] > max)
				{
					max = s[j];
					t = j;
				}
			}
			System.out.printf("%d %d\n",a[t].num,max);
				max = 0;
				s[t] = 0;
		}

	}

}

