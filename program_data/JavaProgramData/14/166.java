public class student
{
	public int num;
	public int chi;
	public int math;
public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max;
		student t = new student();
		student[] s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].math = Integer.parseInt(tempVar4);
			}
		   s[i].sum = s[i].chi + s[i].math;
		}

		max = 0;
		for (i = 0;i < n;i++)
		{
				if (max < s[i].sum)
				{
					max = s[i].sum;
					j = i;
				}
		}
		System.out.printf("%d %d\n",s[j].num,s[j].sum);
		s[j].sum = 0;
		max = 0;
			for (i = 0;i < n;i++)
			{
				if (max < s[i].sum)
				{
					max = s[i].sum;
					j = i;
				}
			}
		System.out.printf("%d %d\n",s[j].num,s[j].sum);
		s[j].sum = 0;
		max = 0;
			for (i = 0;i < n;i++)
			{
				if (max < s[i].sum)
				{
					max = s[i].sum;
					j = i;
				}
			}
		System.out.printf("%d %d\n",s[j].num,s[j].sum);
		s[j].sum = 0;
	}
}

