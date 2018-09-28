package <missing>;

public class GlobalMembers
{
	public static final int maxn = 250 + 10;

	public static int[] a = new int[maxn];
	public static int[] b = new int[maxn];
	public static int[] c = new int[maxn];
	public static int la;
	public static int lb;
	public static int lc;
	public static String s = new String(new char[maxn]);
	public static String t = new String(new char[maxn]);

	public static int Main()
	{
		//freopen("8.in", "r", stdin);

		while (scanf("%s%s", s, t) != EOF)
		{
			  int la = s.length();
			  int lb = t.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(b, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(c, 0, (Integer.SIZE / Byte.SIZE));
			  for (int i = 0; i < la; i++)
			  {
				  a[la - i - 1] = s.charAt(i) - '0';
			  }
			  for (int i = 0; i < lb; i++)
			  {
				  b[lb - i - 1] = t.charAt(i) - '0';
			  }
			  while (a[la - 1] == 0 && la > 1)
			  {
					la--;
			  }
			  while (b[lb - 1] == 0 && lb > 1)
			  {
					lb--;
			  }
			  if (la > lb)
			  {
				 lc = la;
			  }
			  else
			  {
				  lc = lb;
			  }
			  int add = 0;
			  for (int i = 0; i < lc;i++)
			  {
				  c[i] = (add + a[i] + b[i]) % 10;
				  add = (add + a[i] + b[i]) / 10;
			  }
			  if (add != 0)
			  {
				 c[lc++] = add;
			  }
			  for (int i = lc - 1; i >= 0; i--)
			  {
				  System.out.printf("%d", c[i]);
			  }
			  System.out.print("\n");
		}

		//while (1);
	}

}
