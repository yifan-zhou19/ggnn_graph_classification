public class shu
{
	public int a;
	public double b;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		shu[] s = tangible.Arrays.initializeWithDefaultshuInstances(301);
		shu t = new shu();
		int n;
		int i;
		int j;
		int c = 1;
		double avg;
		double sum = 0;
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
				s[i].a = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + s[i].a;
		}
		avg = sum / n;
		for (i = 0;i < n;i++)
		{
			s[i].b = Math.abs(s[i].a - avg);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (s[j].b < s[j + 1].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=s[j];
					t.copyFrom(s[j]);
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (s[i].b == s[0].b)
			{
				c++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < c;i++)
		{
			for (j = 0;j < c - i - 1;j++)
			{
				if (s[j].a > s[j + 1].a)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=s[j];
					t.copyFrom(s[j]);
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
		System.out.printf("%d",s[0].a);
		if (c > 1)
		{
			for (i = 1;i < c;i++)
			{
				System.out.printf(",%d",s[i].a);
			}
		}
	}
}

