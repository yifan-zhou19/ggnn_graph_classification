public class student
{
	public String name = new String(new char[25]);
	public int qimo;
	public int pingshi;
	public char ganbu;
	public char xibu;
	public int lunwen;
	public int money;
}

package <missing>;

public class GlobalMembers
{
	public static int jiangxuejin(student s)
	{
		int sum = 0;
		if ((s.qimo > 80) && (s.lunwen >= 1))
		{
			sum += 8000;
		}
		if ((s.qimo > 85) && (s.pingshi > 80))
		{
			sum += 4000;
		}
		if (s.qimo > 90)
		{
			sum += 2000;
		}
		if ((s.xibu == 'Y') && (s.qimo > 85))
		{
			sum += 1000;
		}
		if ((s.pingshi > 80) && (s.ganbu == 'Y'))
		{
			sum += 850;
		}
		return sum;
	}


	public static void Main(String[] args)
	{
		student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(101);
		int N;
		int sum;
		int max;
		int MAX;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].pingshi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].lunwen = Integer.parseInt(tempVar7);
			}
			a[i].money = jiangxuejin(a[i]);
		}
		sum = max = 0;
		MAX = 0;
		for (int j = 0;j < N;j++)
		{
			if (a[j].money > max)
			{
				max = a[j].money;
				MAX = j;
			}
			sum += a[j].money;
		}
		System.out.printf("%s\n",a[MAX].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);
	}
}

