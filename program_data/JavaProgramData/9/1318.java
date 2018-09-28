public class person
{
	public String str = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static person[] per = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person[] per1 = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person[] per2 = tangible.Arrays.initializeWithDefaultpersonInstances(100);

	public static void Main(String[] args)
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int x = 0;
		int t;
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
				per[i].str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				per[i].age = Integer.parseInt(tempVar3);
			}
			if (per[i].age >= 60)
			{
				per1[j].str = per[i].str;
				per1[j].age = per[i].age;
				j++;
			}
			else
			{
				per2[k].str = per[i].str;
				per2[k].age = per[i].age;
				k++;
			}
		}
		for (x = 0;x < j;x++)
		{
			for (i = 0;i < j - x;i++)
			{
				if (per1[i].age < per1[i + 1].age)
				{
					e = per1[i].str;
					per1[i].str = per1[i + 1].str;
					per1[i + 1].str = e;
					t = per1[i].age;
					per1[i].age = per1[i + 1].age;
					per1[i + 1].age = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%s\n",per1[i].str);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",per2[i].str);
		}

	}

}

