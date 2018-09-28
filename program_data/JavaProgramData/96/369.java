package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int e;
	int n;
	int i;
	int b;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	n = a.length();
	if (n == 2)
	{
		   k = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
		   e = k / 13;
		   b = k % 13;
		   System.out.printf("%d\n%d",e,b);
	}
	  else if (n == 1)
	  {
		   e = 0;
		   b = a.charAt(0) - '0';
		   System.out.printf("%d\n%d",e,b);
	  }
	  else
	  {
		 if ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0') < 13)
		 {
			   e = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) / 13;
				b = ((a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + (a.charAt(2) - '0')) % 13;
				System.out.printf("%d",e);
			 for (i = 1;i < n - 2;i++)
			 {
				 e = (b * 10 + (a.charAt(i + 2) - '0')) / 13;
				 b = (b * 10 + (a.charAt(i + 2) - '0')) % 13;
				 System.out.printf("%d",e);
			 }
			   System.out.printf("\n%d",b);
		 }
		 else
		 {
			   e = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) / 13;
			   b = ((a.charAt(0) - '0') * 10 + (a.charAt(1) - '0')) % 13;
				System.out.printf("%d",e);
				for (i = 1;i < n - 1;i++)
				{
					 e = (b * 10 + (a.charAt(i + 1) - '0')) / 13;
					 b = (b * 10 + (a.charAt(i + 1) - '0')) % 13;
					  System.out.printf("%d",e);
				}
				   System.out.printf("\n%d",b);
		 }
	  }
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

