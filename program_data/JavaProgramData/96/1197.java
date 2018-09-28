package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String s = new String(new char[100]);
		 int i;
		 int n;
		 int[] a = new int[100];
		 int[] b = new int[100];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 n = s.length();
		 if (n > 2)
		 {
		 a[0] = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
		 if (a[0] >= 13)
		 {
		  System.out.printf("%d",a[0] / 13);
		 }
		  b[0] = a[0] % 13;
		  for (i = 1;i < n - 1;i++)
		  {
		   a[i] = b[i - 1] * 10 + (s.charAt(i + 1) - '0');
		   System.out.printf("%d",a[i] / 13);
		   b[i] = a[i] % 13;
		  }
		   System.out.print("\n");
		   System.out.printf("%d",b[n - 2]);
		 }
		  else if (n == 2)
		  {
			a[0] = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
			System.out.printf("%d\n",a[0] / 13);
			System.out.printf("%d",a[0] % 13);
		  }
		  else
		  {
		   System.out.print("0\n");
		   System.out.printf("%c",s.charAt(0));
		  }
	}

}

