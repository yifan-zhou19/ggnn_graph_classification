public class bing
{
	public String id = new String(new char[10]);
	public int age;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static bing[] bing = tangible.Arrays.initializeWithDefaultbingInstances(100);
	public static bing temp = new bing();
	public static int Main()
	{
		int i;
		int j;
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
				bing[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bing[i].age = Integer.parseInt(tempVar3);
			}
			bing[i].num = i + 1;
		}
		for (j = 0;j <= n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (bing[i + 1].age >= 60 && bing[i].age < bing[i + 1].age)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=bing[i+1];
					temp.copyFrom(bing[i + 1]);
					bing[i + 1] = bing[i];
					bing[i] = temp;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",bing[i].id);
		}
		return 0;
	}

}

