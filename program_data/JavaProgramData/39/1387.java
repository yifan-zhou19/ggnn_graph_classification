public class stu
{
	public String str = new String(new char[30]);
	public int a;
	public int b;
	public char s1;
	public char s2;
	public int c;
	public int e;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] sm = tangible.Arrays.initializeWithDefaultstuInstances(1000);
	public static void Main()
	{
		int t;
		int i;
		int max;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sm[i].str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sm[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sm[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				sm[i].s1 = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				sm[i].s2 = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				sm[i].c = Integer.parseInt(tempVar7);
			}
			sm[i].e = 0;
		}
		for (i = 0;i < t;i++)
		{
			if ((sm[i].a) > 80 && (sm[i].c) >= 1)
			{
				(sm[i].e) = (sm[i].e) + 8000;
			}
			if ((sm[i].a) > 85 && (sm[i].b) > 80)
			{
				(sm[i].e) = (sm[i].e) + 4000;
			}
			if ((sm[i].a) > 90)
			{
				(sm[i].e) = (sm[i].e) + 2000;
			}
			if ((sm[i].a) > 85 && (sm[i].s2) == 'Y')
			{
				(sm[i].e) = (sm[i].e) + 1000;
			}
			if ((sm[i].b) > 80 && (sm[i].s1) == 'Y')
			{
				(sm[i].e) = (sm[i].e) + 850;
			}
		}
		max = sm[0].e;
		sum = sm[0].e;
		for (i = 1;i < t;i++)
		{
			if (max < sm[i].e)
			{
				max = sm[i].e;
			}
			sum = sum + sm[i].e;
		}
		for (i = 0;i < t;i++)
		{
			if (sm[i].e == max)
			{
				System.out.printf("%s\n%d\n",sm[i].str,sm[i].e);
				break;
			}
		}
		System.out.printf("%d",sum);
	}






}

