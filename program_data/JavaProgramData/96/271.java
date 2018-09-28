package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[N];
		  int[] c = new int[N];
		  int i;
		  int k;
		  int d;
		  String a1 = new String(new char[N]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a1 = tempVar.charAt(0);
		  }
		  k = a1.length();
		  for (i = 0; i < k; i++)
		  {
				a[i] = a1.charAt(k - i - 1) - '0';
		  }
		  d = 0;
		  for (i = k - 1; i >= 0 ; i--)
		  {
				d = d * 10 + a[i];
				c[i] = d / 13;
				d = d % 13;
		  }
		  while (c[k - 1] == 0 && k > 1)
		  {
		  k--;
		  }
		  for (i = k - 1; i >= 0; i--)
		  {
		  System.out.printf("%d", c[i]);
		  }
		  System.out.printf("\n%d", d);
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}


}

