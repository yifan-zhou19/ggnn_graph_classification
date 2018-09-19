public class b
{
	public int na;
	public String au = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static b[] book = tangible.Arrays.initializeWithDefaultbInstances(1000);
	public static int Main()
	{
		int m;
		int i;
		int[] len = new int[1000];
		int[] num = new int[128];
		int j;
		int max;
		int p = 0;
		char maxi;
		int[] boo = new int[1000];
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
				book[i].na = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].au = tempVar3.charAt(0);
			}
			len[i] = String.valueOf(book[i].au).length();
			for (j = 0;j < len[i];j++)
			{
				num[book[i].au.charAt(j)]++;
			}
		}
		maxi = 'A';
		max = -1;
		for (j = 'A';j <= 'Z';j++)
		{
			if (num[j] > max)
			{
				max = num[j];
				maxi = j;
			}
		}
		System.out.printf("%c\n",maxi);
		System.out.printf("%d\n",max);
		for (i = 0;i < m && p < max;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (book[i].au.charAt(j) == maxi)
				{
					System.out.printf("%d\n",book[i].na);
					p++;
					break;
				}
			}
		}
		return 0;
	}
}

