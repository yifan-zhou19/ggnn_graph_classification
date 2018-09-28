public class Ill
{
	public String a = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int l = 0;
		int j = 0;
		Ill[] illMan = tangible.Arrays.initializeWithDefaultIllInstances(100);
		Ill[] illOld = tangible.Arrays.initializeWithDefaultIllInstances(100);
		Ill temp = new Ill();
		Ill[] illOld1 = tangible.Arrays.initializeWithDefaultIllInstances(100);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				illMan[i].a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				illMan[i].age = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0; i < n; i++)
		{
			if (illMan[i].age >= 60)
			{
				illOld1[j] = illMan[i];
				j++;
			}
		}
		for (i = 0; i < j; i++)
		{
			m = 0;
			for (k = 0; k < j; k++)
			{
				if (m < illOld1[k].age)
				{
					m = illOld1[k].age;
				}
			}
			for (k = 0; k < j; k++)
			{
				if (illOld1[k].age == m)
				{
					illOld[l] = illOld1[k];
					illOld1[k].age = 0;
					l++;
					break;
				}
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.printf("%s\n",illOld[i].a);
		}
		for (i = 0; i < n; i++)
		{
			if (illMan[i].age < 60)
			{
				System.out.printf("%s\n",illMan[i].a);
			}
		}
		return 0;
	}
}

