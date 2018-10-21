package <missing>;

public class GlobalMembers
{
	public static int convert(int a, int b, String str)
	{
		int i;
		int m = 0;
		for (i = a + 1;i < b;++i)
		{
			m = m * 10 + (str[i] - '0');
		}
		return (m);
	}
	public static int Main()
	{
		String str = new String(new char[5000]);
		int len;
		int i;
		int j;
		int count = 1;
		int[] comma = new int[2000];
		int max;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		comma[0] = -1;
		for (i = 0;i < len;++i)
		{
			if (str.charAt(i) == ',')
			{
				comma[count] = i;
				count++;
			}
		}
		comma[count] = len;
		int[] a = new int[2000];
		int[] b = new int[2000];
		int[] c = new int[2000];
		for (i = 0;i < 1000;++i)
		{
			c[i] = 0;
		}
		for (i = 0;i < count;++i)
		{
			a[i] = convert(comma[i], comma[i + 1], str);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;i < count;++i)
		{
			String tempVar2 = ConsoleInput.scanfRead(",");
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < count;++j)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					c[i]++;
				}
			}
		}
		max = c[0];
		for (i = 1;i < 1000;++i)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		System.out.printf("%d %d",count,max);
	}


}

