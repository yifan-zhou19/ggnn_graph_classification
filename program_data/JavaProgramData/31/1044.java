public class stu
{
	public String xh = new String(new char[20]);
	public String mz = new String(new char[20]);
	public char xb;
	public String dz = new String(new char[20]);
	public String df = new String(new char[20]);
	public int nl;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(10000);
		int n = 0;
		int i;
		final String str = "end";
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0].xh = tempVar.charAt(0);
		}
		while (strcmp(a[n].xh,str) != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n].mz = tempVar2.charAt(0);
			}
			c = System.in.read();
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				a[n].xb = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[n].nl = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[n].df = tempVar5.charAt(0);
			}
			c = System.in.read();
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[n].dz = tempVar6.charAt(0);
			}
			c = System.in.read();
			n++;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[n].xh = tempVar7.charAt(0);
			}
			c = System.in.read();
		}
		for (i = n - 1;i >= 0;i--)
		{
		System.out.printf("%s %s %c %d %s %s\n",a[i].xh,a[i].mz,a[i].xb,a[i].nl,a[i].df,a[i].dz);
		}
		return 0;
	}
}

