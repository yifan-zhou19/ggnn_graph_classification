public class h
{
	public String name = new String(new char[11]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h[] p = tangible.Arrays.initializeWithDefaulthInstances(100);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (k = 100;k > 59;k--)
		{
			for (i = 0;i < n;i++)
			{
				if (k == p[i].age)
				{
					System.out.printf("%s\n",p[i].name);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age < 60)
			{
				System.out.printf("%s\n",p[i].name);
			}
		}
	}
}

