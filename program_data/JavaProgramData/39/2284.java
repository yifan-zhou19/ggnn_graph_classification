public class student
{
  public String name = new String(new char[20]);
  public int qimo;
  public int banji;
  public char ganbu;
  public char xibu;
  public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int[] s = new int[100];
		int sum = 0;
		int k;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = stu,i = 0;p < stu + n;p++,i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
			if (p.qimo > 80 && p.paper >= 1)
			{
				s[i] += 8000;
			}
			if (p.qimo > 85 && p.banji > 80)
			{
				s[i] += 4000;
			}
			if (p.qimo > 90)
			{
				s[i] += 2000;
			}
			if (p.qimo > 85 && p.xibu == 'Y')
			{
				s[i] += 1000;
			}
			if (p.banji > 80 && p.ganbu == 'Y')
			{
				s[i] += 850;
			}
		}
		max = s[0];
		for (i = 0;i < n;i++)
		{
			sum += s[i];
			if (s[i] > max)
			{
				max = s[i];
				k = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].name,s[k],sum);
	}

}

