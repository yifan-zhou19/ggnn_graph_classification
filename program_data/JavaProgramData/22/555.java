package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		char c;
		c = ',';
		m = -99990;
		n = -88880;
		while (c == ',')
		{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  i = Integer.parseInt(tempVar);
			  }
			  if (i > m)
			  {
				 n = m;
				 m = i;
			  }
			  else if ((i > n) && (i < m))
			  {
				  n = i;
			  }
			  c = System.in.read();
		}
		if ((n != -88880) && (n != -99990))
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}
	}

}

