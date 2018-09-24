package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int t;
	  int i;
	  int Y;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] s = new int[n];
	  for (i = 0;i <= (n - 1);i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		s[i] = t;
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
		int a = 1;
		int b = 1;
		int c = 1;
		for (Y = 3;Y <= s[i];Y++)
		{
		c = a + b;
		a = b;
		b = c;
		}
		System.out.printf("%d\n",c);
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}
}

