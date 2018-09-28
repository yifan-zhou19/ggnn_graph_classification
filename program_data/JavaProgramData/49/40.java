package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int p;
		int m;
		int b;
		int c;
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		c = a.length();
		for (i = 0;i < c;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				System.out.printf("%c%c\n",a.charAt(i),a.charAt(i));
			}
		}
		for (p = 3;p < c;)
		{
			for (i = 0;i < c - p;i++)
			{
				b = 0;
				for (m = 0;m < p / 2 + 1;m++)
				{
					if (a.charAt(i + m) == a.charAt(p - m + i))
					{
						b++;
					}
				}
				if (b == (p / 2) + 1)
				{
					for (j = i;j <= i + p;j++)
					{
						System.out.printf("%c",a.charAt(j));
					}
					System.out.print("\n");
				}
			}
			p += 2;
		}
	}

}

