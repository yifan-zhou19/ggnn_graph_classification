package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 int[] b = new int[101];
	 int[] c = new int[101];
	   int i;
	   int l;
	   int m;
	  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  l = a.length();
	  if (l == 1)
	  {
		  System.out.print("0");
		  System.out.print("\n");
	   System.out.print(a[0]);
	   System.out.print("\n");
	  }
	  else if (l == 2 && a[0] == '1' && (a[1] == '0' || a[1] == '1' || a[1] == '2'))
	  {
		   System.out.print("0");
		   System.out.print("\n");
		System.out.print(a);
		System.out.print("\n");
	  }
	else
	{
	  for (i = 0;i < l;i++)
	  {
		  b[i] = a[l - 1 - i] - '0';
	  }
	  for (i = l - 1;i >= 1;i--)
	  {
		  m = b[i] * 10 + b[i - 1];
	   b[i - 1] = m % 13;
	   c[i - 1] = m / 13;
	  }
	i = l - 1;
	 while (c[i] == 0)
	 {
		 i--;
	 }
	 for (;i >= 0;i--)
	 {
	 System.out.print(c[i]);
	 }
	 System.out.print("\n");
	 System.out.print(b[0]);
	}
	return 0;
	 }
}

