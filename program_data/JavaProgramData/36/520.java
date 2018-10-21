package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int c;
		int d;
		int[] m = new int[123];
		int[] n = new int[123];
		int i;
		int x;
		int y;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		c = a.length();
		d = b.length();
		if (c != d)
		{
			y2;
		}
		else
		{
			for (i = 0;i < c;i++)
			{
				x = a.charAt(i);
				m[x]++;
				y = b.charAt(i);
				n[y]++;
			}
			for (i = 65;i <= 122;i++)
			{
				if (m[i] != n[i])
				{
					break;
				}
			}
			if (i != 123)
			{
				y2;
			}
			else
			{
				y1;
			}
		}
	}


}

