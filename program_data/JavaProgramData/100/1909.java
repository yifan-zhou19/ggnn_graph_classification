package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	int[] sz = new int[300];
	int tag = 0;
	String zf = new String(new char[303]);
	final String bz = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	zf = new Scanner(System.in).nextLine();
	 for (i = 0;i < 52;i++)
	 {
			sz[i] = 0;
			m = 0;
				while (zf.charAt(m) != '\0')
				{
				if (zf.charAt(m) == bz.charAt(i))
				{
					   sz[i]++;
					   tag = 1;
				}
				m++;
				}

			if (sz[i] != 0)
			{
				System.out.printf("%c=%d\n",bz.charAt(i),sz[i]);
			}
	 }
	if (tag == 0)
	{
	System.out.print("No");
	}
	return 0;
	}


}
