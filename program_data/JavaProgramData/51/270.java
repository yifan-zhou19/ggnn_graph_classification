package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //delta ??
		int i;
		int j;
		int p;
		int q;
		int r;
		int delta = 1;
		int max = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		final String a = "";
		int[] num = new int[500]; //num????
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		final String b = ""; //??????
		for (i = 0;i <= l - n;i++) //l+1-n???
		{
			for (j = 0;j < n;j++)
			{
				b.charAt(i)[j] = a.charAt(i + j);
			}
		}
		for (p = 0;p < l - n;p++)
		{
			if (num[p] > 0)
			{
				num[p] = 0;
				continue;
			}
			else
			{
				for (q = p + 1;q <= l - n;q++)
				{
				if (strcmp(b.charAt(p),b.charAt(q)) == 0)
				{
					num[p]++;
					num[q]++;
					delta++;
				}
				}
			if (delta > max)
			{
				max = delta;
			}
			delta = 1;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (r = 0;r < l - n;r++)
			{
				if ((num[r] + 1) == max)
				{
				System.out.printf("%s\n",b.charAt(r));
				}
			}
		}
		return 0;
	}
}

