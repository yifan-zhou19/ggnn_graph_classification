package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int r;
		int t = 0;
		int[] a = new int[301];
		String c = new String(new char[301]);
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		l = c.length();
		for (x = 'A';x <= 'Z';x++)
		{
			r = 0;
			for (i = 0;i < l;i++)
			{
				if (c.charAt(i) == x)
				{
				r++;
				t = 1;
				}
			}
			if (r > 0)
			{
				System.out.printf("%c=%d\n",x,r);
			}
		}
		for (x = 'a';x <= 'z';x++)
		{
				r = 0;
				for (i = 0;i < l;i++)
				{
					if (c.charAt(i) == x)
					{
					r++;
					t = 1;
					}
				}
				if (r > 0)
				{
					System.out.printf("%c=%d\n",x,r);
				}
		}

			if (t == 0)
			{
				System.out.print("No\n");
			}


	}
}

