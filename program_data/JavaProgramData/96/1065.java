package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int len;
		  int p;
		  int n;
		  String str = new String(new char[100]);
		  int[] a = new int[100];
		  int[] b = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str = tempVar.charAt(0);
		  }
		  len = str.length();
		  for (i = 0;i < len;i++)
		  {
				  a[i] = str.charAt(i) - '0';
		  }
	if (len == 2 && a[0] * 10 + a[1] < 13)
	{
	System.out.print("0\n");
	System.out.printf("%d",a[0] * 10 + a[1]);
	}
	else
	{
		  if (len == 1)
		  {
				  System.out.print("0\n");
				  System.out.printf("%d",a[0]);
		  }
		  else
		  {

			  b[0] = (a[0] * 10 + a[1]) / 13;
			   n = (a[0] * 10 + a[1]) % 13;
		  for (i = 1;i < len - 1;i++)
		  {
				b[i] = (10 * n + a[i + 1]) / 13;
				n = (n * 10 + a[i + 1]) % 13;
		  }
		  if (b[0] != 0)
		  {
					 for (i = 0;i < len - 2;i++)
					 {
					 System.out.printf("%d",b[i]);
					 }
		  }
		  else
		  {
					 for (i = 1;i < len - 2;i++)
					 {
					 System.out.printf("%d",b[i]);
					 }
		  }
		  System.out.printf("%d\n",b[len - 2]);
		  System.out.printf("%d",n);
		  }
	}
	}

}

