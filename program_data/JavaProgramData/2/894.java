public class shu
{
	public int num;
	public String author_name = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ere = new int[26];
		int m;
		int i;
		int max = 0;
		int key;
		for (i = 0;i < 26;i++)
		{
			ere[i] = 0;
		}
		String a;
		shu[] book = tangible.Arrays.initializeWithDefaultshuInstances(999);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author_name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			a = book[i].author_name;
			while (a != '\0')
			{
				ere[a - 'A']++;
				a = a.Substring(1);
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (ere[i] >= max)
			{
				max = ere[i];
				key = i;
			}
		}
		System.out.printf("%c\n",(key + 'A'));
		System.out.printf("%d\n",ere[key]);
		for (i = 0;i < m;i++)
		{
			a = book[i].author_name;
			while (a != '\0')
			{
				if ((key + 'A') == a)
				{
					System.out.printf("%d\n",book[i].num);
					break;
				}
				a = a.Substring(1);
			}
		}
		return 0;
	}


}

