public class books
{
	public int num;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static books[] book = tangible.Arrays.initializeWithDefaultbooksInstances(999);
	public static void Main()
	{
		int f = new int(struct books * p,int n,char z);
		int i;
		int n;
		int j;
		int[] x = new int[26];
		int k;
		int max;
		char z;
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
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		for (z = 'A',i = 0;z <= 'Z';z++,i++)
		{
			x[i] = f(book, n, z);
		}
		for (i = 1,max = x[0],k = 0;i < 26;i++)
		{
			if (x[i] > max)
			{
			max = x[i];
			k = i;
			}
		}
		System.out.printf("%c\n%d\n",k + 65,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].author.charAt(j) != '\0';j++)
			{
			if (book[i].author.charAt(j) == k + 65)
			{
			System.out.printf("%d\n",book[i].num);
			break;
			}
			}
		}
	}
	public static int f(books p, int n, char z)
	{
		int m = 0;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;(p + i).author.charAt(j) != '\0';j++)
			{
			if ((p + i).author.charAt(j) == z)
			{
			m++;
			break;
			}
			}
		}
		return m;
	}
}

