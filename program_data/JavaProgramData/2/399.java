public class book
{
	public int num;
	public String name = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static void Main(String[] args)
	{
		int m;
		int i;
		int j;
		int[] a = new int[27];
		int len;
		int max = 0;
		int number;
		char p;
		for (i = 1;i <= 26;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
			len = String.valueOf(book[i].name).length();
			for (j = 0;j <= len - 1;j++)
			{
				p = book[i].name.charAt(j);
				a[p - 64] += 1;
			}
		}
		for (i = 1;i <= 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				number = i;
			}
		}
		System.out.printf("%c\n%d\n",number + 64,a[number]);
		for (i = 1;i <= m;i++)
		{
			len = String.valueOf(book[i].name).length();
			for (j = 0;j <= len - 1;j++)
			{
				if (book[i].name.charAt(j) == number + 64)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}

	}


}

