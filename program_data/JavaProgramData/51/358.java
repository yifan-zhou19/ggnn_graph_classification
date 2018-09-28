package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		String a = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		l = a.length();
		int[] b = new int[1000];
		int i;
		int j;
		int s;
		for (i = 0;i <= l - n;i++)
		{
			for (j = i;j <= l - n;j++)
			{
				for (s = 0;s < n;s++)
				{
					if (a.charAt(i + s) != a.charAt(j + s))
					{
						s = 0;
						break;
					}
				}
				if (s == n)
				{
				b[i] = b[i] + 1;
				}
			}
		}
		int max = 0;
		for (i = 0;i <= l - n;i++)
		{
			if (b[i] > max)
			{
			max = b[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{
			if (b[i] == max)
			{
				for (j = i;j < i + n;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
			System.out.print('\n');
			}
		}
		return 0;
	}
}

