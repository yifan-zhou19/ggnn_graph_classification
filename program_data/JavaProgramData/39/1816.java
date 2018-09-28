public class stud
{
	public String a = new String(new char[30]);
	public int sco1;
	public int sco2;
	public char mon;
	public char west;
	public int ess;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stud[] xx = tangible.Arrays.initializeWithDefaultstudInstances(100);
		int n;
		int i;
		int[] my = new int[100];
		int max;
		int sum = 0;
		int re;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xx[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				xx[i].sco1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				xx[i].sco2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				xx[i].mon = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xx[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				xx[i].ess = Integer.parseInt(tempVar7);
			}
			System.in.read();
			my[i] = 0;
			if (xx[i].sco1 > 80 && xx[i].ess > 0)
			{
				my[i] = my[i] + 8000;
			}
			if (xx[i].sco1 > 85 && xx[i].sco2 > 80)
			{
				my[i] = my[i] + 4000;
			}
			if (xx[i].sco1 > 90)
			{
				my[i] = my[i] + 2000;
			}
			if (xx[i].sco1 > 85 && xx[i].west == 'Y')
			{
				my[i] = my[i] + 1000;
			}
			if (xx[i].sco2 > 80 && xx[i].mon == 'Y')
			{
				my[i] = my[i] + 850;
			}
		}
		max = my[0];
		for (i = 0;i < n;i++)
		{
			sum = sum + my[i];
			if (my[i] > max)
			{
				max = my[i];
				re = i;
			}
		}
		System.out.printf("%s\n%d\n%d",xx[re].a,max,sum);
	}
}

