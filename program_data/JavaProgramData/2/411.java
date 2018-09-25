public class book
{
	public int no;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] ji = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int[][] a = new int[26][1000];
		int e;
		int[] b = new int[26];
		int max = 0;
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
				ji[i].no = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ji[i].author = tempVar3.charAt(0);
			}
			len = String.valueOf(ji[i].author).length();
			for (j = 0;j < len;j++)
			{
				e = ji[i].author.charAt(j);
				e = e-65;
				a[e][b[e]] = ji[i].no;
				b[e] = b[e] + 1;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[max] < b[i])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",max + 65,b[max]);
		for (i = 0;i < b[max];i++)
		{
			System.out.printf("%d\n",a[max][i]);
		}
		return 0;
	}
}

