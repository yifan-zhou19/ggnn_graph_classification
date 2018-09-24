public class stu
{
	   public String name = new String(new char[20]);
	   public char ganbu;
	   public char xibu;
	   public int qimo;
	   public int banji;
	   public int lunwen;
	   public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100);
		stu t = new stu();
		int n;
		int i;
		int sum = 0;
		int j;
		int k;
		char c;
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
						String tempVar4 = ConsoleInput.scanfRead(" ");
						if (tempVar4 != null)
						{
							a[i].banji = Integer.parseInt(tempVar4);
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
						String tempVar7 = ConsoleInput.scanfRead(" ");
						if (tempVar7 != null)
						{
							a[i].lunwen = Integer.parseInt(tempVar7);
						}
						a[i].sum = 0;
						if (a[i].qimo > 80 && a[i].lunwen >= 1)
						{
						a[i].sum += 8000;
						}
						if (a[i].qimo > 85 && a[i].banji > 80)
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
						if (a[i].banji > 80 && a[i].ganbu == 'Y')
						{
						a[i].sum += 850;
						}
						sum += a[i].sum;
		}
		for (j = 1;j <= n;j++)
		{
			 for (k = 0;k < n - j;k++)
			 {
										  if (a[k].sum < a[k + 1].sum)
										  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[k];
											   t.copyFrom(a[k]);
											   a[k] = a[k + 1];
											   a[k + 1] = t;
										  }
			 }
		}
		System.out.printf("%s\n%d\n%d\n",a[0].name,a[0].sum,sum);

		return 0;
	}

}

