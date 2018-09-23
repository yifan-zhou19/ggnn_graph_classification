public class BOOK
{
	public int No;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static BOOK[] book = tangible.Arrays.initializeWithDefaultBOOKInstances(999);
	public static int[] letter = new int[26];

	public static int Main()
	{
		int[] letter = new int[26];
		int count = 0;
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int max;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].No = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(book[i].author).length();j++)
			{
				n = book[i].author.charAt(j) - 65;
				letter[n]++;
			}
		}
		max = letter[0];
		for (n = 0;n < 26;n++)
		{
			if (letter[n] > max)
			{
				max = letter[n];
			}
		}
		for (n = 0;n < 26;n++)
		{
			if (max == letter[n])
			{
				s = n;
				System.out.printf("%c\n%d\n",n + 65,max);
				break;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(book[i].author).length();j++)
			{
				if (s == book[i].author.charAt(j) - 65)
				{
					System.out.printf("%d\n",book[i].No);
				}
			}
		}
	}
}

