public class m
{
	public String l = new String(new char[50]);
	public int a;
	public int b;
	public char x;
	public char y;
	public int z;
	public int s;
}

package <missing>;

public class GlobalMembers
{
	public static m[] la = tangible.Arrays.initializeWithDefaultmInstances(1000);
	public static m mo = new m();
	public static void Main()
	{
		int n;
		int i;
		int j;
		int zo = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			la[i].z = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				la[i].l = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				la[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				la[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				la[i].x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				la[i].y = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				la[i].z = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			la[i].s = 0;
			if (la[i].a > 80 && la[i].z != 0)
			{
				la[i].s = la[i].s + 8000;
			}
			if (la[i].a > 85 && la[i].b > 80)
			{
				la[i].s = la[i].s + 4000;
			}
			if (la[i].a > 90)
			{
				la[i].s = la[i].s + 2000;
			}
			if (la[i].a > 85 && la[i].y == 89)
			{
				la[i].s = la[i].s + 1000;
			}
			if (la[i].b > 80 && la[i].x == 89)
			{
				la[i].s = la[i].s + 850;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (la[j].s < la[j + 1].s)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: mo=la[j];
					mo.copyFrom(la[j]);
					la[j] = la[j + 1];
					la[j + 1] = mo;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			zo = zo + la[i].s;
		}
		System.out.printf("%s\n%d\n%d\n",la[0].l,la[0].s,zo);
	}

}

