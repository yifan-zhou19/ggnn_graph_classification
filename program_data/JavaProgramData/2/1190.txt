public class Book
{
	public int number;
	public String author = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = 0;
		int len;
		int[] sum = new int[30];
		int m;
		int i;
		int j;
		Book[] book = tangible.Arrays.initializeWithDefaultBookInstances(999);
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
				book[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
			len = String.valueOf(book[i].author).length();
			for (j = 0;j < len;j++)
			{
				sum[book[i].author.charAt(j) - 65]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sum[i] > sum[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",max + 65,sum[max]);
		for (i = 0;i < m;i++)
		{
			len = String.valueOf(book[i].author).length();
			for (j = 0;j < len;j++)
			{
				if (book[i].author.charAt(j) == max + 65)
				{
					System.out.printf("%d\n",book[i].number);
					break;
				}
			}
		}
	}
}

