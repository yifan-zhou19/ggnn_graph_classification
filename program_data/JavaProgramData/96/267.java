package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[100]);
		  int n;
		  int i;
		  int[] b = new int[100];
		  int e;
		  int f;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  n = a.length();
		  if (n >= 3)
		  {
			  e = a.charAt(0) - '0';
		  f = a.charAt(1) - '0';
		  e = e * 10 + f;
		  f = e / 13;
		  b[0] = f;
		  e = e % 13;
		  for (i = 2;i <= n - 1;i++)
		  {
		  f = a.charAt(i) - '0';
		  e = e * 10 + f;
		  f = e / 13;
		  b[i - 1] = f;
		  e = e % 13; //yushu//
		  }
		  if (b[0] == 0)
		  {
			  for (i = 1;i <= n - 2;i++)
			  {
		  System.out.printf("%d",b[i]);
			  }
		  System.out.print("\n");
		  System.out.printf("%d",e);
		  }
		  else
		  {
			  for (i = 0;i <= n - 2;i++)
			  {
		  System.out.printf("%d",b[i]);
			  }
		  System.out.print("\n");
		  System.out.printf("%d",e);
		  }
		  }
		  else
		  {
			  if (n == 1)
			  {
			  e = a.charAt(0) - '0';
		  System.out.print("0\n");
		  System.out.printf("%d",e);
			  }
		  if (n == 2)
		  {
			  e = a.charAt(0) - '0';
		  f = a.charAt(1) - '0';
		  e = e * 10 + f;
		 if (e <= 12)
		 {
			 System.out.print("0\n");
		 System.out.printf("%d",e);
		 }
		 else
		 {
			 f = e / 13;
		 e = e % 13;
		 System.out.printf("%d\n",f);
		 System.out.printf("%d",e);
		 }
		  }
		  }




		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

