public class bing
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static bing[] person = tangible.Arrays.initializeWithDefaultbingInstances(100);
	public static bing[] old = tangible.Arrays.initializeWithDefaultbingInstances(100);

	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int b;
		String e = new String(new char[10]);
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
				person[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				person[i].age = Integer.parseInt(tempVar3);
			}
			if (person[i].age >= 60)
			{
				old[j].id = person[i].id;
				old[j].age = person[i].age;
				j = j + 1;
			}
		}
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (old[i].age < old[i + 1].age)
				{
					e = old[i].id;
					old[i].id = old[i + 1].id;
					old[i + 1].id = e;
					b = old[i].age;
					old[i].age = old[i + 1].age;
					old[i + 1].age = b;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",old[i].id);
		}
		for (i = 0;i < n;i++)
		{
			if (person[i].age < 60)
			{
				System.out.printf("%s\n",person[i].id);
			}
		}
		return 0;
	}


}

