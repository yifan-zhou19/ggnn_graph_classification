package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		int n;
		int m;
		int i;
		int j;
		int x;
		int y;
		int z;
		int k = 0;
		int[] c = new int[255];
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
		m = a.length();
		n = b.length();
		x = m - 1;
		y = n - 1;
		while (true)
		{
				 if (x < 0 && y < 0)
				 {
					 break;
				 }
				 if (x >= 0 && y >= 0)
				 {
							  c[k] = a.charAt(x) - '0' + b.charAt(y) - '0';
							  k++;
							  x--;
							  y--;
				 }
				 if (x >= 0 && y < 0)
				 {
							  c[k] = a.charAt(x) - '0';
							  k++;
							  x--;
							  y--;
				 }
				 if (x < 0 && y >= 0)
				 {
							  c[k] = b.charAt(y) - '0';
							  k++;
							  x--;
							  y--;
				 }
		}
		 for (i = 0;i < k - 1;i++)
		 {
						  z = c[i];
						  c[i] = z % 10;
						  c[i + 1] += z / 10;
		 }
		 if (c[k - 1] > 10)
		 {
					z = c[k - 1];
					c[k - 1] = z % 10;
					System.out.printf("%d",(z / 10));
		 }
		for (i = k - 1;i >= 0;i--)
		{
							if (c[i] != 0 || k == 1)
							{
								break;
							}
							if (c[i] == 0)
							{
								k--;
							}
		}
		for (i = k - 1;i >= 0;i--)
		{
							System.out.printf("%d",c[i]);
		}

		return 0;
	}
}

