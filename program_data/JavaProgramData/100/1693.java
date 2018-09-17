package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yw = new String(new char[302]);
		char tang = 0;
		char c;
		char x = 0;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yw = tempVar.charAt(0);
		}
		n = yw.length();
		for (c = 'A';c <= 'Z';c++)
		{
			x = 0;
			for (i = 0;i < n;i++)
			{
				if (c == yw.charAt(i))
				{
					x++;
				}
			}
			if (x != 0)
			{
				System.out.printf("%c=%d\n",c,x);
				tang++;
			}
		}
		for (c = 'a';c <= 'z';c++)
		{
			x = 0;
			for (i = 0;i < n;i++)
			{
				if (c == yw.charAt(i))
				{
					x++;
				}
			}
			if (x != 0)
			{
				System.out.printf("%c=%d\n",c,x);
				tang++;
			}
		}
		if (tang == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

