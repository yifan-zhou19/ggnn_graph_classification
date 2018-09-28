public class patient
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int f;
		int j;
		String e = new String(new char[10]);
		m = 0;
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
				pat[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			if (pat[i].age >= 60)
			{
				e = pat[i].num;
				f = pat[i].age;
				for (k = i;k > m;k--)
				{
					pat[k].num = pat[k - 1].num;
				}
				pat[m].num = e;
				pat[m].age = f;
				m++;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 0;k < i;k++)
			{
				if (pat[i].age > pat[k].age)
				{
					f = pat[i].age;
					e = pat[i].num;
					for (j = i;j > k;j--)
					{
						pat[j].age = pat[j - 1].age;
						pat[j].num = pat[j - 1].num;
					}
					pat[k].age = f;
					pat[k].num = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",pat[i].num);
		}
		return 0;
	}
}

