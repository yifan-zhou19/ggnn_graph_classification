package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 s = tempVar.charAt(0);
		 }
		 int[] a = new int[100];
		 int b;
		 int c;
		 int d;
		 int e;
		 c = s[0] - '0';
		 d = s[1] - '0';
		 e = c * 10 + d;
		 int l = s.length();
		 if (l == 1)
		 {
				 System.out.print("0\n");
				 System.out.printf("%c",s[0]);
		 }
		 else if ((e < 13) && (l == 2))
		 {
			  System.out.print("0");
			  System.out.print("\n");
			  System.out.printf("%d",e);
		 }
		 else
		 {
			 for (int i = 0;i < l - 1;i++)
			 {
				   a[i] = e / 13;
				   c = e-13 * a[i];
				   d = s[i + 2] - '0';
				   e = c * 10 + d;
			 }
			 for (int q = 0;q < l - 1;q++)
			 {
					  if ((q == 0) && (a[q] != 0))
					  {
					  System.out.printf("%d",a[q]);
					  }
					  else if (q != 0)
					  {
					  System.out.printf("%d",a[q]);
					  }
			 }

			 System.out.print("\n");
			 System.out.printf("%d\n",c);
		 }

	}

}

