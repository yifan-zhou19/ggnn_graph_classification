public class score
{
	public String id = new String(new char[10]);
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static score[] book = tangible.Arrays.initializeWithDefaultscoreInstances(1000);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int num;
		int max = 0;
		char maxname;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			n = 0;
			for (j = 0;j < num;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (book[j].name.charAt(k) == ('A' + i))
					{
						n += 1;
					}
				}
			}
			if (n > max)
			{
				maxname = 'A' + i;
				max = n;
			}
		}
		System.out.printf("%c\n%d\n",maxname,max);
		for (j = 0;j < num;j++)
		{
			for (k = 0;k < 26;k++)
			{
				if (book[j].name.charAt(k) == maxname)
				{
					System.out.printf("%s\n",book[j].id);
				}
			}
		}
		return 0;
	}


}

