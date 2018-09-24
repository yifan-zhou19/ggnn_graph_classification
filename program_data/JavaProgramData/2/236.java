public class book
{
	public int mark;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int h;
		int i;
		int j;
		int k;
		int max;
		int length;
		int[] t = new int[26];
		char a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].mark = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			a = 'A' + i;
			t[i] = 0;
			for (j = 0;j < m;j++)
			{
				length = String.valueOf(book[i].name).length();

				for (h = 0;h < 26;h++)
				{
				if (a == book[j].name.charAt(h))
				{
					t[i]++;

				}
				}

			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
				k = i;
			}
		}
		a = 'A' + k;
		System.out.printf("%c\n%d\n",a,t[k]);
		for (i = 0;i < m;i++)
		{
			length = String.valueOf(book[i].name).length();
			for (j = 0;j < 26;j++)
			{
				if ('A' + k == book[i].name.charAt(j))
				{
					System.out.printf("%d\n",book[i].mark);
				}
			}
		}
		return 0;
	}

}

