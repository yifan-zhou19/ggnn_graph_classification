public class book
{
	public int num;
	public String name = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
		int m;
		int i;
		int j;
		int r;
		int[] writer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
			   book[i].name = tempVar3.charAt(0);
		   }
		}
		for (i = 0;i < m;i++)
		{
			r = String.valueOf(book[i].name).length();
			for (j = 0;j < r;j++)
			{
					writer[book[i].name.charAt(j) - 'A']++;
			}
		}
		int max = 0;
		char w = 'A';
		for (i = 0;i < 26;i++)
		{
			if (writer[i] > max)
			{
				max = writer[i];
				w = i + 'A';
			}
		}
		System.out.printf("%c\n",w);
		System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < r;j++)
			{
				r = String.valueOf(book[i].name).length();
				if (book[i].name.charAt(j) == w)
				{
					System.out.printf("%ld\n",book[i].num);
				}
			}
		}
		return 0;
	}

}

