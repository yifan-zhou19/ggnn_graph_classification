public class book
{
	public int num;
	public String writer = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int e;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char da;
		char c;
		int[] temp = new int[27];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].writer = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (da = 'A';da <= 'Z';da++)
			{
				for (j = 0;j < 26;j++)
				{
					if (book[i].writer.charAt(j) == da)
					{
						temp[da - 'A' + 0]++;
					}
				}
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (temp[j] > max)
			{
				max = temp[j];
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (temp[j] == max)
			{
				c = j + 65;
			System.out.printf("%c\n%d\n",c,temp[j]);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (book[i].writer.charAt(j) == c)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
	}

}

