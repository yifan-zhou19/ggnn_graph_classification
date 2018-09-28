public class bing
{
	public String id = new String(new char[20]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		bing[] b = tangible.Arrays.initializeWithDefaultbingInstances(100);
		bing[] sixup = tangible.Arrays.initializeWithDefaultbingInstances(100);
		bing[] sixdown = tangible.Arrays.initializeWithDefaultbingInstances(100);
		bing temp = new bing();
		int m;
		int n;
		int l;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= m - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].age = Integer.parseInt(tempVar3);
			}
		}
		n = 0;
		l = 0;
		for (i = 0;i <= m - 1;i++)
		{
			if (b[i].age >= 60)
			{
				sixup[n] = b[i];
				n++;
			}
			else
			{
				sixdown[l] = b[i];
				l++;
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=sixup[i];
			temp.copyFrom(sixup[i]);
			for (j = i - 1;j >= 0;j--)
			{
				if (temp.age > sixup[j].age)
				{
					sixup[j + 1] = sixup[j];
					sixup[j] = temp;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.println(sixup[i].id);
		}
		for (i = 0;i <= l - 1;i++)
		{
			System.out.println(sixdown[i].id);
		}
		return 0;
	}


}

