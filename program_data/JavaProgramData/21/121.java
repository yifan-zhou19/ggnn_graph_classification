public class smn
{
	public int a;
	public float b;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		float sum = 0F;
		float c;
		smn[] s = tangible.Arrays.initializeWithDefaultsmnInstances(300);
		smn p = new smn();
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
			sum += s[i].a;
		}
		c = sum / n;
		for (i = 0;i < n;i++)
		{
			s[i].b = Math.abs(s[i].a - c);
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (s[i].b < s[i + 1].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=s[i];
					p.copyFrom(s[i]);
					s[i] = s[i + 1];
					s[i + 1] = p;
				}
			}
		}
			for (j = 1;j < n;j++)
			{
			for (i = 0;i < n - j;i++)
			{
				if (s[i].a > s[i + 1].a && s[i].b == s[i + 1].b)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=s[i];
					p.copyFrom(s[i]);
				s[i] = s[i + 1];
				s[i + 1] = p;
				}
			}
			}
			System.out.printf("%d",s[0].a);
			for (i = 1;i < n;i++)
			{
				if (s[i].b == s[0].b)
				{
					System.out.printf(",%d",s[i].a);
				}
				else
				{
					break;
				}
			}
	}


}

