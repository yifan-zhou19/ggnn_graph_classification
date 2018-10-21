public class BOOK
{
	public int num;
	public String name = new String(new char[26]);
	public int[] name_num = new int[26];
}

package <missing>;

public class GlobalMembers
{
	public static BOOK[] book = tangible.Arrays.initializeWithDefaultBOOKInstances(999);

	public static void Main()
	{
		int n; //????//
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
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
				book[i].name = tempVar3.charAt(0);
			}
		}

		int[] count = new int[26];
		int k;
		for (i = 0;i < n;i++)
		{
			int len;
			len = String.valueOf(book[i].name).length();
			for (k = 0;k < len;k++)
			{
				book[i].name_num[k] = (int)book[i].name.charAt(k);
			}
		}

		int j;
		int y;
		for (i = 0;i < n;i++)
		{
			int len_1;
			len_1 = String.valueOf(book[i].name).length();
			for (j = 65;j <= 90;j++)
			{
				for (y = 0;y < len_1;y++)
				{
					if (book[i].name_num[y] == j)
					{
						count[j - 65]++;
					}
				}
			}
		}

		int w;
		int max = count[0];
		int t = 0;
		for (w = 0;w < 26;w++)
		{
			if (count[w] > max)
			{
				max = count[w];
				t = w;
			}
		}
		System.out.printf("%c\n%d\n",t + 65,max);

		int x;
		int total = 0;
		for (i = 0;i < n;i++)
		{
			int length;
			length = String.valueOf(book[i].name).length();
			for (x = 0;x < length;x++)
			{
				if (book[i].name_num[x] == t + 65)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}


	}
}

