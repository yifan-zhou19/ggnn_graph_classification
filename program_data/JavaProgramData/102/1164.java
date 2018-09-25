public class data
{
	public String sex = new String(new char[7]);
	public float h;
}

package <missing>;

public class GlobalMembers
{
	public static data[] stu = tangible.Arrays.initializeWithDefaultdataInstances(40);
	public static data[] m = tangible.Arrays.initializeWithDefaultdataInstances(39);
	public static data[] f = tangible.Arrays.initializeWithDefaultdataInstances(39);
	public static data temp = new data();

	public static int Main()
	{
		int n;
		int i;
		int j;
		int male;
		int female;
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
				stu[i].sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].h = Float.parseFloat(tempVar3);
			}
		}
		for (i = male = female = 0;i < n;i++)
		{
			if (stu[i].sex.charAt(0) == 'm')
			{
				m[male] = stu[i];
				male++;
			}
			else
			{
				f[female] = stu[i];
				female++;
			}
		}
		for (i = 0;i < male-1;i++)
		{
			for (j = 0;j < male-1 - i;j++)
			{
				if (m[j].h > m[j + 1].h)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=m[j+1];
					temp.copyFrom(m[j + 1]);
					m[j + 1] = m[j];
					m[j] = temp;
				}
			}
		}
		for (i = 0;i < female-1;i++)
		{
			for (j = 0;j < female-1 - i;j++)
			{
				if (f[j].h > f[j + 1].h)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=f[j+1];
					temp.copyFrom(f[j + 1]);
					f[j + 1] = f[j];
					f[j] = temp;
				}
			}
		}
		for (i = 0;i < male;i++)
		{
			System.out.printf("%.2f ",m[i].h);
		}
		for (i = female-1;i >= 1;i--)
		{
			System.out.printf("%.2f ",f[i].h);
		}
		System.out.printf("%.2f\n",f[i].h);
		return 0;
	}
}

