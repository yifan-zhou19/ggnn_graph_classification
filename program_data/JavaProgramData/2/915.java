public class book
{
public int num;
public String name = new String(new char[25]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		int b;
		int c;
		int max = 0;
		int[] a = new int[25];
		int[][] q = new int[25][999];
		int p = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			book[i].name = tempVar3.charAt(0);
		}
		b = String.valueOf(book[i].name).length();
		for (j = 0;j < b;j++)
		{
			for (k = 0;k < 26;k++)
			{
				if (book[i].name.charAt(j) == k + 65)
				{
					a[k] = a[k] + 1;
					q[k][i] = book[i].num;
				}
			}
		}
	}

	for (i = 0;i < 25;i++)
	{
	if (a[i] > max)
	{
	max = a[i];
	c = i;
	}
	}
	System.out.printf("%c\n%d\n",c + 65,max);
	for (i = 0;i < m;i++)
	{
	if (q[c][i] > 0)
	{
	System.out.printf("%d\n",q[c][i]);
	}
	}




	}


}

