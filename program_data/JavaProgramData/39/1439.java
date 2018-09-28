public class student
{
	public String name = new String(new char[20]);
	public int fin;
	public int py;
	public char o;
	public char w;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int f(student s)
	{
		int scholarship = 0;
		if (s.fin > 80 && s.num >= 1)
		{
			scholarship += 8000;
		}
		if (s.fin > 85 && s.py > 80)
		{
			scholarship += 4000;
		}
		if (s.fin > 90)
		{
			scholarship += 2000;
		}
		if (s.fin > 85 && s.w == 'Y')
		{
			scholarship += 1000;
		}
		if (s.py > 80 && s.o == 'Y')
		{
			scholarship += 850;
		}
		return (scholarship);
	}
	public static void Main()
	{
		int i;
		int N;
		int max;
		int sum = 0;
		student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].fin = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].py = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].o = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].num = Integer.parseInt(tempVar7);
			}
		}
		max = f(st[0]);
		sum = 0;
		for (i = 0;i < N;i++)
		{

			if (max < f(st[i]))
			{
				max = f(st[i]);
			}
			sum += f(st[i]);
		}
		for (i = 0;i < N;i++)
		{
			if (f(st[i]) == max)
			{
				System.out.printf("%s\n",st[i].name);
				System.out.printf("%ld\n",max);
				System.out.printf("%ld\n",sum);
				break;
			}
		}


	}

}

