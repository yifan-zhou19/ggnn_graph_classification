public class book
{
	public int order;
	public int num;
	public String writer = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int[] q = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].writer = tempVar3.charAt(0);
			}
			b[i].order = i;
		}
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] c = new int[26];
		String d = new String(new char[26]);
		for (j = 0;j <= 25;j++)
		{
		   d = d.substring(0, j);
		   c[j] = 0;
		}
		for (k = 0;k <= 25;k++)
		{
			for (i = 0;i <= (n - 1);i++)
			{
			   p = String.valueOf(b[i].writer).length();
			   d = b[i].writer;
			   for (j = 0;j <= (p - 1);j++)
			   {
				   if (d.charAt(j) == a[k])
				   {
					   c[k] = c[k] + 1;
				   }
			   }
			   for (j = 0;j <= 25;j++)
			   {
				   d = d.substring(0, j);
			   }
			}
		}
		int max = c[0];
		for (i = 0;i <= 25;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		char x;
		for (i = 0;i <= 25;i++)
		{
			if (c[i] == max)
			{
				x = a[i];
				System.out.printf("%c\n",a[i]);
				System.out.printf("%d\n",c[i]);
			}
		}

		for (i = 0;i <= 999;i++)
		{
			q[i] = 0;
		}
		int r = 0;
		String e = new String(new char[26]);
		for (i = 0;i <= 25;i++)
		{
			e = e.substring(0, i);
		}
		for (i = 0;i <= (n - 1);i++)
		{
			p = String.valueOf(b[i].writer).length();
			e = b[i].writer;
			for (j = 0;j <= (p - 1);j++)
			{
				if (e.charAt(j) == x)
				{
					q[r] = b[i].num;
					r = r + 1;
				}
			}
			for (j = 0;j <= 25;j++)
			{
			   e = e.substring(0, j);
			}
		}
		int s = 0;
		for (i = 0;i <= 999;i++)
		{
			if (q[i] != 0)
			{
				s = s + 1;
			}
		}
		for (i = 0;i <= (s - 2);i++)
		{
			System.out.printf("%d\n",q[i]);
		}
		System.out.printf("%d",q[s - 1]);

		return 0;
	}

}

