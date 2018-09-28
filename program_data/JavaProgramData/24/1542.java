package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[3000]);
		zfc = new Scanner(System.in).nextLine();
		int n = zfc.length();
		int w;
		for (w = 0;w <= n;w++)
		{
			if (zfc.charAt(w) == ' ' || zfc.charAt(w) == ',' || zfc.charAt(w) == '\0')
			{
				break;
			}
		}
		if (w == n)
		{
			System.out.printf("%s\n%s",zfc,zfc);
		}
		else
		{
		  int b;
		  int d;
		  int k;
		  int j;
		  int a = -1;
		  int c = -1;
		  b = w;
		  d = w;
		  k = w;
		  int i;
		  for (i = b + 1;i < n;i++)
		  {
			if ((zfc.charAt(i) == ' ' || zfc.charAt(i) == ',') && zfc.charAt(i + 1) != ' ' && zfc.charAt(i + 1) != ',')
			{
				j = k;
				k = i;
				if (k - j > b - a)
				{
					a = j;
					b = k;
				}
				else
				{
				   if (k - j < d - c)
				   {
					c = j;
					d = k;
				   }
				}
			}
		  }
		 if (n - k > b - a)
		 {
			 a = k;
			 b = n;
		 }
		 if (n - k < d - c)
		 {
			 c = k;
			 d = n;
		 }
		 int p;
		 int q;
		 for (p = a + 1;p < b - 1;p++)
		 {
			System.out.printf("%c",zfc.charAt(p));
		 }
		 System.out.printf("%c\n",zfc.charAt(b - 1));
		 for (q = c + 1;q < d;q++)
		 {
			System.out.printf("%c",zfc.charAt(q));
		 }
		}
		return 0;
	}

}
