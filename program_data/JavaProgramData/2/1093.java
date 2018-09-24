public class book
{
	public int number;
	public String auther = new String(new char[27]);
}

public class ath
{
	public char a;
	public int[] books = new int[999];
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static ath[] auth = tangible.Arrays.initializeWithDefaultathInstances(27);
	public static ath temp = new ath();

	public static void Main()
	{
		int n;
		int i;
		int x;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bk[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bk[i].auther = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 27;i++)
		{
			for (j = 0;j < 999;j++)
			{
				auth[i].books[j] = 0;
			}
			auth[i].sum = 0;
			auth[i].a = 'A' + i;
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(bk[i].auther).length();
			int f;
			for (f = 0;f < m;f++)
			{
				x = (int)(bk[i].auther.charAt(f) - 'A');
				auth[x].books[auth[x].sum] = bk[i].number;
				auth[x].sum++;
			}
		}
		for (j = 0;j < 25;j++)
		{
			for (i = 0;i < 25 - j;i++)
			{
				if (auth[i].sum > auth[i + 1].sum)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=auth[i];
					temp.copyFrom(auth[i]);
					auth[i] = auth[i + 1];
					auth[i + 1] = temp;
				}
			}
		}
		System.out.printf("%c\n",auth[25].a);
		System.out.printf("%d\n",auth[25].sum);
		i = 0;
		while (auth[25].books[i] != 0)
		{
			System.out.printf("%d\n",auth[25].books[i]);
			i++;
		}
	}

}

