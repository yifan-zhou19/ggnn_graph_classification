public class student
{
	public String name = new String(new char[20]);
	public int pjcj;
	public int pycj;
	public char ganbu;
	public char xibu;
	public int article;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student[] p;
		int n;
		int i;
		int sum = 0;
		int max = 0;
		int maxnum;
		int single = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultstudentInstances(n);

		for (i = 0 ; i < n ; i++,single = 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].pjcj = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].pycj = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p[i].article = Integer.parseInt(tempVar7);
			}

			if (p[i].pjcj > 80 && p[i].article != 0)
			{
				single += 8000;
			}
			if (p[i].pjcj > 85 && p[i].pycj > 80)
			{
				single += 4000;
			}
			if (p[i].pjcj > 90)
			{
				single += 2000;
			}
			if (p[i].pjcj > 85 && p[i].xibu == 'Y')
			{
				single += 1000;
			}
			if (p[i].pycj > 80 && p[i].ganbu == 'Y')
			{
				single += 850;
			}

			if (single > max)
			{
				max = single;
				maxnum = i;
			}
			sum += single;
		}

		System.out.printf("%s\n",p[maxnum].name);
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",sum);
	}

}

