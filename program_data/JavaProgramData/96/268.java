package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String c = new String(new char[100]);
		  int x;
		  int y;
		  int z;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c = tempVar.charAt(0);
		  }
		  int L = c.length();
		  int a = 0;
		  int i;
		  int k;
		  if (L == 1)
		  {
		  System.out.printf("%d\n",a);
		  System.out.printf("%c",c.charAt(0));
		  }
		  else if (L == 2 && (c.charAt(0) == '1') && c.charAt(1) < '3')
		  {
		  System.out.printf("%d\n",a);
		  System.out.printf("%c%c",c.charAt(0),c.charAt(1));
		  }
		  else
		  {
			   if ((c.charAt(0) == '1') && c.charAt(1) < '3')
			   {
			  x = c.charAt(0) - '0';
			  y = c.charAt(1) - '0';
			  z = (x * 100 + y * 10 + c.charAt(2) - '0') / 13;
			  System.out.printf("%d",z);
			  a += ((x * 100 + y * 10 + c.charAt(2) - '0') % 13) * 10;
		   for (i = 3;i < L;i++)
		   {
						   a += c.charAt(i) - '0';
						   k = a / 13;
						   System.out.printf("%d",k);
						   a = (a % 13) * 10;
		   }
		  System.out.printf("\n%d",a / 10);
			   }
		  else
		  {
					  x = c.charAt(0) - '0';
					  y = (x * 10 + c.charAt(1) - '0') / 13;
					  System.out.printf("%d",y);
					  a += ((x * 10 + c.charAt(1) - '0') % 13) * 10;

		  for (i = 2;i < L;i++)
		  {
						   a += c.charAt(i) - '0';
						   k = a / 13;
						   System.out.printf("%d",k);
						   a = (a % 13) * 10;
		  }
		  System.out.printf("\n%d",a / 10);
		  }
		  }
	}
}

