package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len;
		int n;
		int i;
		int j;
		int k;
		int f;
		int m;
		int max;
		int t;
		int[] q = new int[502];
		final String a = "";
		final String c = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		len = a.length();
		len = len - n + 1;
		for (k = 0;k < len;k++)
		{
			for (i = 0;i < n;i++)
			{
			c.charAt(k)[i] = a.charAt(i + k);
			}
		}
		max = 1;
		for (k = 0;k < len;k++)
		{
			for (t = k;t < len;t++)
			{
				if (strcmp(c.charAt(k),c.charAt(t)) == 0)
				{
					q[k] = q[k] + 1;
				}
			}
			if (q[k] > max)
			{
				max = q[k];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < len;i++)
			{
				if (q[i] == max)
				{
					 System.out.printf("%s\n",c.charAt(i));
				}
			}
		}
	}
}

