public class book
{
	public int id;
	public String s = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] a = tangible.Arrays.initializeWithDefaultbookInstances(100);
	public static int Main()
	{
		int m;
		int i;
		int n;
		int j;
		int k;
		int max;
		int maxnum;
		int[] aut1 = new int[26];
		int[][] aut2 = new int[26][100];
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
				a[i].id = Integer.parseInt(tempVar2);
			}
			a[i].s = new Scanner(System.in).nextLine();
			n = String.valueOf(a[i].s).length();
			for (j = 0;j < n;j++)
			{
				k = a[i].s.charAt(j) - 'A';
				aut2[k][aut1[k]] = a[i].id;
				aut1[k]++;
			}
		}
		max = 0;
		maxnum = 0;
		for (i = 0;i < 26;i++)
		{
			if (aut1[i] > max)
			{
				max = aut1[i];
				maxnum = i;
			}
		}
		System.out.printf("%c\n",'A' + maxnum);
		System.out.printf("%d\n",max);
		System.out.printf("%d",aut2[maxnum][0]);
		for (i = 1;i < max;i++)
		{
			System.out.printf("\n%d",aut2[maxnum][i]);
		}
	}



}

