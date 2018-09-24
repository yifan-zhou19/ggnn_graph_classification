public class s
{
	public String name = new String(new char[20]);
public int q;
public int b;
public char x;
public char w;
public int l;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		s[] stu = tangible.Arrays.initializeWithDefaultsInstances(100);
		int n;
		int i;
		int p;
		int[] m = new int[100];
		int j;
		double t = 0.0;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].q = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].l = Integer.parseInt(tempVar7);
			}
			m[i] = 0;
			if (stu[i].q > 80 && stu[i].l != 0)
			{
				m[i] = m[i] + 8000;
			}
			if (stu[i].q > 85 && stu[i].b > 80)
			{
				m[i] = m[i] + 4000;
			}
			if (stu[i].q > 90)
			{
				m[i] = m[i] + 2000;
			}
			if (stu[i].q > 85 && stu[i].w == 'Y')
			{
				m[i] = m[i] + 1000;
			}
			if (stu[i].b > 80 && stu[i].x == 'Y')
			{
				m[i] = m[i] + 850;
			}
		}
		p = m[0];
		for (i = 0;i < n;i++)
		{
			if (p < m[i])
			{
				p = m[i];
				j = i;
			}
			t = m[i] + t;
		}
		System.out.printf("%s\n",stu[j].name);
		System.out.printf("%d\n%.0f\n",p,t);
	}







}

