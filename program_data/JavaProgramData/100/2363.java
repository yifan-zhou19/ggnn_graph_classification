package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] k = new int[52];
		int i;
		int j;
		int n;
		int m;
		int h = 0;
		String a = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (j = 0;j < 26;j++)
		{
			m = 0;
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == 'A' + j)
				{
					m++;
				h++;
				}
			}

			if (m > 0)
			{
				System.out.printf("%c=%d\n",'A' + j,m);
			}
		}
		  for (j = 0;j < 26;j++)
		  {
			m = 0;
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == 'a' + j)
				{
						m++;
				h++;
				}
			}
			if (m > 0)
			{
				System.out.printf("%c=%d\n",'a' + j,m);
			}
		  }
		  if (h == 0)
		  {
			  System.out.print("No");
		  }
	}

}

