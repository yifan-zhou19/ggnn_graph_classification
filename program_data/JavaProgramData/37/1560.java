package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int n;
		int i;
		int j;
		int k;
		int c;
		int l;
		int[] b = new int[200];
		String a = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			max = 0;
			c = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			for (j = 0;j < l;j++)
			{
				b[j] = 0;
				if (j == 0)
				{
					b[j]++;
				}
				else
				{
				for (k = 0;k < j;k++)
				{
					if (a.charAt(j) == a.charAt(k))
					{
						b[k]++;
						break;
					}
				}
				if (k == j)
				{
					b[j]++;
				}
				}
			}
			for (j = 0;j < l;j++)
			{
				if (b[j] == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					c++;
					break;
				}
			}
			if (c == 0)
			{
				System.out.print("no\n");
			}
		}
	}

}

