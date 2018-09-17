package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int s = 0;
		int len;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct b
	//	{
	//		char x;
	//		int y;
	//	}
	//	c[52];
		for (i = 0;i < 52;i++)
		{
			if (i >= 0 && i < 26)
			{
				c[i].x = 65 + i;
			}
			else if (i >= 26 && i < 52)
			{
				c[i].x = 71 + i;
			}
			c[i].y = 0;
		}
		len = a.length();
		for (i = 0;i < len;i++)
		{
			for (k = 65;k < 123;k++)
			{
				if (a.charAt(i) == k)
				{
					if (k >= 65 && k < 91)
					{
						c[k - 65].y = c[k - 65].y + 1;
						s = 1;
					}
					else if (k > 96 && k < 123)
					{
						c[k - 71].y = c[k - 71].y + 1;
						s = 1;
					}
				}

			}
		}
		 for (i = 0;i < 52;i++)
		 {
			if (c[i].y != 0)
			{
				System.out.printf("%c=%d\n",c[i].x,c[i].y);
			}
		 }
		if (s == 0)
		{
			System.out.print("No");
		}
		return 0;


	}
}

