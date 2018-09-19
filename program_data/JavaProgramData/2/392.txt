public class jisuan
{
		 public int num;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static jisuan[] book = tangible.Arrays.initializeWithDefaultjisuanInstances(1000);
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int e;
		int[] count = new int[26];
		int[] author = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
				 author[i] = 65 + i;
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			book[i].name = new Scanner(System.in).nextLine();
		}
		for (i = 'A';i <= 'Z';i++)
		{
			for (j = 0;j < m;j++)
			{
				n = String.valueOf(book[j].name).length();
				for (k = 0;k < n;k++)
				{
					if (i == book[j].name.charAt(k))
					{
						count[i - 65]++;
					}
				}
			}
		}
		for (i = 0;i < 25;i++)
		{
			if (count[i] > count[i + 1])
			{
				e = count[i];
				count[i] = count[i + 1];
				count[i + 1] = e;
				e = author[i];
				author[i] = author[i + 1];
				author[i + 1] = e;
			}
		}
		System.out.printf("%c\n%d\n",author[25],count[25]);
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(book[i].name).length();
			for (k = 0;k < n;k++)
			{
				if (book[i].name.charAt(k) == author[25])
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
		return 0;
	}
}

