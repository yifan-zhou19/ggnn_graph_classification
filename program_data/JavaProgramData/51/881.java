package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int s;
		int max;
		int l;
		int k;
		int r;
		int t;
		String str = new String(new char[501]);
		char x;
		char y;
		char z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		l = str.length();
		max = 0;
		for (i = 0;i < l - n + 1;i++)
		{
			s = 0;
			for (j = i + 1;j < l - n + 1;j++)
			{
				t = 0;
				for (r = 0;r < n;r++)
				{
					if (str.charAt(i + r) == str.charAt(j + r))
					{
						t++;
					}
				}
				if (t == n)
				{
					s++;
				}
			}
			if (s > max)
			{
				max = s;
			}
		}
		if (max == 0)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max + 1);
		for (i = 0;i < l - n + 1;i++)
		{
			s = 0;
			x = str.charAt(i);
			y = str.charAt(i + 1);
			z = str.charAt(i + 2);
			for (j = i + 1;j < l - n + 1;j++)
			{
				t = 0;
				for (r = 0;r < n;r++)
				{

					if (str.charAt(i + r) == str.charAt(j + r))
					{
						t++;
					}
				}
				if (t == n)
				{
					s++;
				}
			}
			if (s == max)
			{
				for (r = 0;r < n;r++)
				{
					System.out.printf("%c",str.charAt(i + r));
				}
				System.out.print("\n");
			}
		}
		}
	}

}

