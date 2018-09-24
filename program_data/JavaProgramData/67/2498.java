public class patient
{
	public int all;
	public int part;
	public double cent;
	public String s = new String(new char[7]);
}

package <missing>;

public class GlobalMembers
{
	public static patient[] p = tangible.Arrays.initializeWithDefaultpatientInstances(M);
	public static int Main()
	{
		int n;
		int i;
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
				p[i].all = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].part = Integer.parseInt(tempVar3);
			}
			p[i].cent = (double)p[i].part / (double)p[i].all;
		}
		for (i = 1;i < n;i++)
		{
			if ((p[i].cent - p[0].cent) > 0.05)
			{
				p[i].s = "better";
			}
			else if ((p[0].cent - p[i].cent) > 0.05)
			{
				p[i].s = "worse";
			}
			else
			{
				p[i].s = "same";
			}
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%s\n",p[i].s);
		}
		return 0;
	}
}

