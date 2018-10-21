package <missing>;

public class GlobalMembers
{
	public static int strbigint(tangible.RefObject<String> str, int[] a)
	{
		int len = str.argValue.length();
		int i;
		for (i = 0;i < len;i++)
		{
		a[len - i - 1] = str.argValue.charAt(i) - '0';
		}
		return len;
	}
	public static void print_bigint(int[] a, int len)
	{
		 int k = len - 1;
		 while (a[k] == 0 && k > 1)
		 {
							k--;
		 }
		 int i;
		 for (i = k;i > 0;i--)
		 {
		 System.out.printf("%d",a[i]);
		 }
	}
	public static int Main()
	{
		  int[] a = new int[100];
		  int alen;
		  int[] b = new int[100];
		  int blen;
		  int i;
		  String c = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
	  tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		  alen = strbigint(tempRef_c, a);
		  c = tempRef_c.argValue;
		  if (alen == 1)
		  {
		  System.out.printf("%d\n%d",0,a[0]);
		  }
		  else
		  {
		  for (i = alen - 1;i > 0;i--)
		  {
							b[i] = (10 * a[i] + a[i - 1]) / 13;
							a[i - 1] = (10 * a[i] + a[i - 1]) % 13;
		  }
		  print_bigint(b, alen);
		  System.out.print("\n");
		  System.out.printf("%d",a[0]);
		  }
	}
}

