package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[301]);
		final String zm = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		zf = new Scanner(System.in).nextLine();
		int n;
			n = zf.length();
		int[] sz = new int[52];
		for (int k = 0;k < 52;k++)
		{
			sz[k] = 0;
		}
		int a;
		int m;
		for (a = 0;a < n;a++)
		{
			for (m = 0;m < 52;m++)
			{
				if (zf.charAt(a) == zm.charAt(m))
				{
					sz[m]++;
				}
			}
		}
		int c = 0;
		int b;
		for (b = 0;b < 52;b++)
		{
		   if (sz[b] != 0)
		   {
				   System.out.printf("%c",zm.charAt(b));
				   System.out.printf("=%d\n",sz[b]);
				   c++;
		   }
		}
		if (c == 0)
		{
			   System.out.print("No");
		}
		   return 0;
	}

}
