package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		String zfc = new String(new char[200]);
		char x;
		int i;
		int j;
		int h;
		int len1;
		int len2;
		int m = 0;
		int n = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		len1 = str.length();
		len2 = zfc.length();
		if (len1 != len2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				s = 0;
				m = 0;
				for (j = 0;j < len2;j++)
				{
					if (str.charAt(i) == zfc.charAt(j))
					{
						m++;
					}
				}
				x = str.charAt(i);
				for (h = 0;h < len1;h++)
				{
					if (str.charAt(h) == x)
					{
						s++;
					}
				}
				if (m != s)
				{
				System.out.print("NO");
				break;
				}
				else
				{
					n++;
				}
			}
			if (n == len1)
			{
				System.out.print("YES");
			}
		}
		return 0;
	}
}

