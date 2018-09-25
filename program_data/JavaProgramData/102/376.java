public class ren
{
	public String sex = new String(new char[8]);
	public double gao;
}

package <missing>;

public class GlobalMembers
{
	public static ren[] a = tangible.Arrays.initializeWithDefaultrenInstances(45);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
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
				a[i].sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].gao = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i].sex,"female") == 0)
			{
			a[i].gao = 10 - a[i].gao;
			}
		}
		if (n > 2)
		{
			for (i = 0;i < n - 1;i++)
			{
				ren temp = new ren();
				for (j = 1;j < n - i;j++)
				{
					if (a[j].gao < a[j - 1].gao)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[j];
						temp.copyFrom(a[j]);
						a[j] = a[j - 1];
						a[j - 1] = temp;
					}
				}
			}
		}
		else
		{
			ren temp = new ren();
			if (a[0].gao > a[1].gao)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[1];
				temp.copyFrom(a[1]);
				a[1] = a[0];
				a[0] = temp;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i].sex,"female") == 0)
			{
			a[i].gao = 10 - a[i].gao;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
			System.out.printf("%.2lf",a[i].gao);
			}
			else
			{
			System.out.printf(" %.2lf",a[i].gao);
			}
		}
	}
	/*
	
	    for(i=0;i<n;i++)
	    {
	        printf("%s %lf\n",a[i].sex,a[i].gao);
	        }
	*/

}

