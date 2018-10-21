public class student
{
	public String Name = new String(new char[20]);
	public int agrades;
	public int bgrades;
	public char a;
	public char b;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		student[] p;
		int i;
		int j;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultstudentInstances(num);
		for (i = 0;i < num;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].Name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].agrades = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].bgrades = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p[i].a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p[i].b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p[i].n = Integer.parseInt(tempVar7);
			}
			//printf("%s %d %d %c %c %d",p[i].Name,p[i].agrades,p[i].bgrades,p[i].a,p[i].b,p[i].n);
		}
		int[] p1;
		int[] p2;
		p1 = new int[num];
		p2 = new int[num];
		for (i = 0;i < num;i++)
		{
			p1[i] = 0;
			p2[i] = 0;
			if (p[i].agrades > 80 && p[i].n >= 1)
			{
				p1[i]++;
				p2[i] += 8000;
			}
			if (p[i].agrades > 85 && p[i].bgrades > 80)
			{
				p1[i]++;
				p2[i] += 4000;
			}
			if (p[i].agrades > 90)
			{
				p1[i]++;
				p2[i] += 2000;
			}
			if (p[i].agrades > 85 && p[i].b == 'Y')
			{
				p1[i]++;
				p2[i] += 1000;
			}
			if (p[i].bgrades > 80 && p[i].a == 'Y')
			{
				p1[i]++;
				p2[i] += 850;
			}
		}
		int sum = 0;
		for (i = 0;i < num;i++)
		{
			sum += p2[i];
		}
		int max;
		max = p2[0];
		for (i = 0;i < num;i++)
		{
			if (max < p2[i])
			{
				max = p2[i];
			}
		}
		for (i = 0;i < num;i++)
		{
			if (max == p2[i])
			{
				break;
			}
		}
		System.out.printf("%s\n",p[i].Name);
		System.out.printf("%d\n",p2[i]);
		System.out.printf("%d",sum);

	}
}

