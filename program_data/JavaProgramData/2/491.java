public class book
{
	public int num;
public String str = new String(new char[200]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] bk = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
		int m;
		int i;
		int l;
		int k;
		int p = 0;
		int max;
		int maxl;
		int[][] a = new int[200][1000];
		int[] b = new int[200];
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
			bk[i].num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			bk[i].str = tempVar3.charAt(0);
		}
		}

		for (l = 0;l < 26;l++)
		{
	   for (i = 0;i < m;i++)
	   {
	   for (k = 0;bk[i].str.charAt(k) != '\0';k++)
	   {
	   if ((bk[i].str.charAt(k)) == l + 65)
	   {
		   a[l][p] = bk[i].num;
	   p++;
	   }
	   }
	   }
	b[l] = p;
	p = 0;
		}
	max = b[0];
	maxl = 0;
	for (l = 0;l < 26;l++)
	{
	if (b[l] > max)
	{
		max = b[l];
	maxl = l;
	}
	}
	System.out.printf("%c\n",maxl + 65);
	System.out.printf("%d\n",max);
	for (i = 0;i < max;i++)
	{
	System.out.printf("%d\n",a[maxl][i]);
	}
		return 0;
	}
}

