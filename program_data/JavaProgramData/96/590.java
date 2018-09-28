package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[N];
		int[] c = new int[N];
	  int i;
	  int l;
	  int d;
	  int b = 13;
	  String a1 = new String(new char[N]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a1 = tempVar.charAt(0);
	  }
	  l = a1.length();
	  for (i = 0;i < l;i++)
	  {
		  a[i] = a1.charAt(l - i - 1) - '0';
	  }
	  d = 0;
	  for (i = l - 1;i >= 0;i--)
	  {
		  d = d * 10 + a[i];
		c[i] = d / b;
		d = d % b;
	  }
	  while (c[l - 1] == 0 && l > 1)
	  {
		  l--;
	  }
	  for (i = l - 1;i >= 0;i--)
	  {
		  System.out.printf("%d",c[i]);
	  }
	  System.out.printf("\n%d",d);
	}
}

