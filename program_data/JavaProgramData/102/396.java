public class people
{
	public String a = new String(new char[7]);
	public float l;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		people[] p;
		people pp = new people();
		String v = "male";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = tangible.Arrays.initializeWithDefaultpeopleInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].l = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			if (strcmp(p[i].a,p[j].a) < 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: pp=p[i];
				pp.copyFrom(p[i]);
				p[i] = p[j];
				p[j] = pp;
			}
			else
			{
			if (p[i].l > p[j].l && strcmp(p[i].a,v) == 0 && strcmp(p[j].a,v) == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: pp=p[i];
				pp.copyFrom(p[i]);
				p[i] = p[j];
				p[j] = pp;
			}
			if (p[i].l < p[j].l && strcmp(p[i].a,v) != 0 && strcmp(p[j].a,v) != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: pp=p[i];
				pp.copyFrom(p[i]);
				p[i] = p[j];
				p[j] = pp;
			}
			}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%.2f ",p[i].l);
		}
		System.out.printf("%.2f",p[n - 1].l);
		p = null;
		return 0;
	}

}

