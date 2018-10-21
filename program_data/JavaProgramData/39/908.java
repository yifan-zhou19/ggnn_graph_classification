public class s
{
	public String name = new String(new char[20]);
	public char ganbu;
	public char xibu;
	public int qimo;
	public int pingyi;
	public int lunwen;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int tot = 0;
		char c;
		s[] a = tangible.Arrays.initializeWithDefaultsInstances(101);
		s b = new s();
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
			c = System.in.read();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a[i].lunwen = Integer.parseInt(tempVar7);
			}
			a[i].sum = 0;
			if (a[i].qimo > 80 && a[i].lunwen >= 1)
			{
			a[i].sum += 8000;
			}
			if (a[i].qimo > 85 && a[i].pingyi > 80)
			{
			a[i].sum += 4000;
			}
			if (a[i].qimo > 90)
			{
			a[i].sum += 2000;
			}
			if (a[i].qimo > 85 && a[i].xibu == 'Y')
			{
			a[i].sum += 1000;
			}
			if (a[i].pingyi > 80 && a[i].ganbu == 'Y')
			{
			a[i].sum += 850;
			}
			tot += a[i].sum;
			if (a[i].sum > max)
			{
				max = a[i].sum;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: b=a[i];
				b.copyFrom(a[i]);
			}
		}
		System.out.printf("%s\n%d\n%d",b.name,max,tot);
		return 0;
	}
}

