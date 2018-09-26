package <missing>;

public class GlobalMembers
{
	public static final int MAX = 1010;

	public static int n;
	public static int[] a = new int[MAX];
	public static int[] b = new int[MAX];

	public static int cmp(Object p1, Object p2)
	{
	  return *(int)p2 - (int)p1;
	}

	public static int Main()
	{
	  int i;
	  int j;
	  int s1;
	  int s2;
	  while ((n,n > 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	  {
		s1 = 0;
		s2 = -200 * n;
		for (i = 0;i < n;i++)
		{
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
		  b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
		qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);
		//new
		for (j = 0;j < n;j++)
		{
		  s1 = 0;
		  for (i = 0;i + j < n;i++)
		  {
			if (a[i] > b[i + j])
			{
			  s1++;
			}
			if (a[i] < b[i + j])
			{
			  s1--;
			}
		  }
		  s2 = Math.max(s2,s1 - j);
		}
		System.out.print(s2 * 200);
		System.out.print("\n");
	  }
	  return 0;
	}

}

