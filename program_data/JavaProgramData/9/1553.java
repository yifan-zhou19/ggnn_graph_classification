public class oldpeople
{
	public String id = new String(new char[20]);
	public int year;
}

package <missing>;

public class GlobalMembers
{
	public static oldpeople[] old = tangible.Arrays.initializeWithDefaultoldpeopleInstances(100);
	public static oldpeople[] old60 = tangible.Arrays.initializeWithDefaultoldpeopleInstances(100);
	public static oldpeople cache = new oldpeople();
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
				old[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				old[i].year = Integer.parseInt(tempVar3);
			}
		}
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if (old[i].year >= 60)
			{
				old60[j] = old[i];
				j++;
			}
		}
		int k;
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < j - i;k++)
			{
				if (old60[k].year < old60[k + 1].year)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: cache=old60[k+1];
					cache.copyFrom(old60[k + 1]);
					old60[k + 1] = old60[k];
					old60[k] = cache;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",old60[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (old[i].year < 60)
			{
			System.out.printf("%s\n",old[i].id);
			}
		}
		return 0;
	}

}

