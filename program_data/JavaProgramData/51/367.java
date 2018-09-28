package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int da;
		int i;
		int j;
		int x;
		int len;
		int n;
		int[] max = new int[501];
		String s = new String(new char[501]);
		char[][] a = new char[501][6];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i <= len - n;i++)
		{
		max[i] = 1;
		}
		x = 0;
		j = 0;
		while (j <= len - n)
		{
			i = 0;
		while (i < n)
		{
			a[j][i] = s.charAt(x);
			i++;
			x++;
		}
		   j++;
		   x = j;
		}
		for (i = 1;i <= len - n;i++)
		{
		if (strcmp(a[0],a[i]) == 0)
		{
		max[0]++;
		}
		}
		da = max[0];
		for (i = 1;i <= len - n;i++)
		{
		for (j = i + 1;j <= len - n;j++)
		{
		if (strcmp(a[i],a[j]) == 0)
		{
		max[i]++;
		}
		}
		}
			for (i = 0;i <= len - n;i++)
			{
			if (max[i] > da)
			{
			da = max[i];
			}
			}
		if (da <= 1)
		{
		System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",da);
			for (j = 0;j <= len - n;j++)
			{
		   if (max[j] == da)
		   {
		   System.out.println(a[j]);
		   }
			}
		}

	}
}

