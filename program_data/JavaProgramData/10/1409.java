package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int h[26],n;
	public static int[] h = new int[26];
	public static int n;
	public static int go(int maxh,int cp)
	{
		int x;
		int y;
		int max;
		while (h[cp] > maxh)
		{
			cp = cp + 1;
		}
		if (h[cp] == 0)
		{
			return 0;
		}
		x = go(maxh, cp + 1);
		maxh = h[cp];
		y = 1 + go(maxh, cp + 1);
		max = (x > y)?x:y;
		return max;
	}
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,c,t;
		int i;
		int c;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		h[n] = 0;
		t = go(65535, 0);
		System.out.printf("%d",t);
		return 0;
	}


}

