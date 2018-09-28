public class pat
{
	public String num = new String(new char[10]);
	public int age;
	public int x;
}

package <missing>;

public class GlobalMembers
{
	public static pat[] p = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static pat[] P = tangible.Arrays.initializeWithDefaultpatInstances(100);
	public static pat s = new pat();
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
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
				p[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
			if (p[i].age >= 60)
			{
				p[i].x = p[i].age;
			}
			else
			{
				p[i].x = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			s.age = -1;
			s.x = -1;
			String k = new String(new char[10]);
			for (j = 0;j < n;j++)
			{
				if (s.x < p[j].x)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: s=p[j];
					s.copyFrom(p[j]);
					k = p[j].num;
				}
			}
			P[i] = s;
			for (j = 0;j < n;j++)
			{
				if (strcmp(p[j].num,k) == 0)
				{
					p[j].x = -2;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",P[i].num);
		}
	return 0;
	}
}

