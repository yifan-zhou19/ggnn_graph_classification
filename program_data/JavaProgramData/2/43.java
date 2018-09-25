public class book
{
	public int num;
public String w = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		int e;
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
				b[i].w = tempVar3.charAt(0);
			}
		}
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] c = new int[26];
		for (j = 0;j < 26;j++)
		{
			for (i = 0;i < m;i++)
			{
			e = String.valueOf(b[i].w).length();
		for (k = 0;k < e;k++)
		{
			if (b[i].w.charAt(k) == a[j])
			{
				c[j]++;
			}
		}
			}
		}
		int sum = 0;
		for (j = 0;j < 26;j++)
		{
			if (c[j] > c[sum])
			{
				sum = j;
			}
		}
			System.out.printf("%c\n",a[sum]);
			System.out.printf("%d\n",c[sum]);
		for (i = 0;i < m;i++)
		{
			e = String.valueOf(b[i].w).length();
		for (k = 0;k < e;k++)
		{
			if (b[i].w.charAt(k) == a[sum])
			{
		System.out.printf("%d\n",b[i].num);
			}
		}
		}
	}

}

