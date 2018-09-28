public class xinxi
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static xinxi[] old = tangible.Arrays.initializeWithDefaultxinxiInstances(100);
	public static void Main()
	{
		int i;
		int n;
		int j;
		int maxage = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++) //???????id???????????????????'\0'????????????????????????????????id,????????????'\0'????????????
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			old[i].id = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			old[i].age = Integer.parseInt(tempVar3);
		}

		}

		for (i = 0;i < n;i++)
		{
			if (maxage < old[i].age)
			{
				maxage = old[i].age;
			}
		}


		for (j = maxage;j >= 60;j--)
		{
			for (i = 0;i < n;i++)
			{
				if (old[i].age == j)
				{
					System.out.println(old[i].id);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (old[i].age < 60)
			{
				System.out.println(old[i].id);
			}
		}
	}

}

