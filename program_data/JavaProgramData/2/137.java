public class book
{
   public int num;
   public String aut = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int max;
		int p;
		int[] a = new int[26];
		int[] q = new int[999];
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
				b[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].aut = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(b[i].aut).length();
			for (j = 0;j < n;j++)
			{
				k = b[i].aut.charAt(j);
				a[k - 65]++;
			}

		}
		for (i = 1,max = a[0],p = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				p = i;
				max = a[i];
			}
		}
		System.out.printf("%c\n%d",p + 65,max);
		for (i = 0;i < m;i++)
		{
			n = String.valueOf(b[i].aut).length();
			for (j = 0;j < n;j++)
			{
				if (b[i].aut.charAt(j) == (p + 65))
				{
					q[i] = 1;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (q[i] == 1)
			{
				System.out.printf("\n%d",b[i].num);
			}
		}
	}
}

