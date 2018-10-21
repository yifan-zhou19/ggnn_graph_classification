package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[500]);
	public static int[] post = new int[500];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int x = 1;
		int y;
		int max = 0;
		int count = 0;
		int h = 0;
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
		for (i = 0;i <= a.length() - n;i++,count = 0)
		{
			for (j = i;j <= a.length() - n;j++,x = 1)
			{
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i + k) != a.charAt(j + k))
					{
						x = 0;
						break;
					}
				}
				if (x == 1)
				{
					count++;
				}
			}
			post[i] = count;
			if (count >= max)
			{
				max = count;
			}
		}
		if (max <= 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (j = 0;j < i;j++)
			{
				if (post[j] == max)
				{
					for (k = j;k < j + n - 1;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.printf("%c\n",a.charAt(k));
				}
			}
		}
		return 0;

	}
}

