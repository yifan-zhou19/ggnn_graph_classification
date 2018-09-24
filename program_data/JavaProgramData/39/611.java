public class stu
{
	public String name = new String(new char[25]);
	public int qimo;
	public int banji;
	public String ganbu = new String(new char[1]);
	public String xibu = new String(new char[1]);
	public int lunwen;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(150);
	public static void Main()
	{
		int n;
		int[] s = new int[150];
		int i;
		int sum = 0;
		int max = 0;
		String name = new String(new char[25]);
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
				a[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].banji = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].lunwen = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i].qimo > 80) && (a[i].lunwen >= 1))
			{
				s[i] += 8000;
			}
			if ((a[i].qimo > 85) && (a[i].banji > 80))
			{
				s[i] += 4000;
			}
			if (a[i].qimo > 90)
			{
				s[i] += 2000;
			}
			if ((a[i].qimo > 85) && (a[i].xibu.charAt(0) == 'Y'))
			{
				s[i] += 1000;
			}
			if ((a[i].banji > 80) && (a[i].ganbu.charAt(0) == 'Y'))
			{
				s[i] += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < s[i])
			{
				max = s[i];
				name = a[i].name;
			}
			sum += s[i];
		}
		System.out.printf("%s\n%d\n%d\n",name,max,sum);
	}
}

