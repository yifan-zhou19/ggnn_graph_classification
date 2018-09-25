public class sick
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int s;
		String swap = new String(new char[10]);
		sick[] all = tangible.Arrays.initializeWithDefaultsickInstances(100);
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
				all[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				all[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = i;j > 0;j--)
			{
				if (all[j].age >= 60 && all[j].age > all[j - 1].age)
				{
					s = all[j].age;
					all[j].age = all[j - 1].age;
					all[j - 1].age = s;
					swap = all[j].num;
					all[j].num = all[j - 1].num;
					all[j - 1].num = swap;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(all[i].num);
		}
		return 0;
	}

}

