public class BOOK
{
	public int id;
	public int[] author = new int[26];
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		BOOK[] book = tangible.Arrays.initializeWithDefaultBOOKInstances(1000);
		int[] countauthor = new int[26];
		int n;
		int i;
		int j;
		int minusA;
		int no;
		int count;
		int max = 0;
		int maxau;
		String input = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				book[i].author[j] = 0;
			}
		} // refresh data: each book-->all authors initiate with 0
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				input = tempVar3.charAt(0);
			}
			no = input.length();
			for (j = 0;j < no;j++)
			{
				minusA = (input.charAt(j) - 'A');
				book[i].author[minusA]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			count = 0;
			for (j = 0;j < n;j++)
			{
				if (book[j].author[i] == 1)
				{
					count++;
				}
			}
			countauthor[i] = count;
		}
		for (i = 0;i < 26;i++)
		{
			if (max < countauthor[i])
			{
				max = countauthor[i];
			}
		} // to find max
		for (i = 0;i < 26;i++)
		{
			if (countauthor[i] == max)
			{
				maxau = i;
			}
		} //to find which author    has maximum number of book
		System.out.printf("%c\n%d\n",(maxau + 'A'),max);
		for (i = 0;i < n;i++)
		{
			if (book[i].author[maxau] == 1)
			{
				System.out.printf("%d\n",book[i].id);
			}
		}
		return 0;
	}
}

