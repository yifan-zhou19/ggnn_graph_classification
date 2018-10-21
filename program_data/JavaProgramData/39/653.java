public class student
{
	public String a = new String(new char[20]);
	public int b;
	public int c;
	public char d;
	public char e;
	public int f;
	public int g;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] s;
		int n;
		int i;
		int sum = 0;
		int q;
		int max;
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
				s[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].c = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].d = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].e = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].f = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			s[i].g = 0;
			if (s[i].b > 80 && s[i].f >= 1)
			{
				s[i].g = s[i].g + 8000;
			}
			if (s[i].b > 85 && s[i].c > 80)
			{
			   s[i].g = s[i].g + 4000;
			}
			if (s[i].b > 90)
			{
				s[i].g = s[i].g + 2000;
			}
			if (s[i].b > 85 && s[i].e == 'Y')
			{
				   s[i].g = s[i].g + 1000;
			}
			if (s[i].c > 80 && s[i].d == 'Y')
			{
				s[i].g = s[i].g + 850;
			}
			sum = sum + s[i].g;
		}
		max = s[0].g;
		q = 0;
		for (i = 0;i < n;i++)
		{
			if (max < s[i].g)
			{
			   q = i;
			   max = s[i].g;
			}
		}
		System.out.printf("%s\n%d\n%d",s[q].a,s[q].g,sum);

	return 0;
	}
}

