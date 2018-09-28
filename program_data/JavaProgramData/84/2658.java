package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(int a,int b);
		int n;
		int[] m = new int[100];
		int i;
		int m1 = -32768;
		int m2 = -32768;
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
			m[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
			m1 = max(m[i], m1);
		}
		  for (i = 0;i < n;i++)
		  {
			if (m[i] == m1)
			{
				m[i] = -32768;
			}
		  }
		for (i = 0;i < n;i++)
		{
			m2 = max(m[i], m2);
		}
		System.out.printf("%d\n%d",m1,m2);

	}
	  public static int max(int a,int b)
	  {
		  int c;
		  c = a > b != 0?a:b;
		  return (c);
	  }

}

