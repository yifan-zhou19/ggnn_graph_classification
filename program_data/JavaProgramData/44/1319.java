package <missing>;

public class GlobalMembers
{
	 public static int f(int a)
	 {
		  int[] n = new int[32];
		  int i;
		  int p = 10;
		  int q;
		  int b = 0;
		  for (i = 0; ;i++)
		  {
				  n[i] = a % 10;
				  a = a / p;
				  if (a == 0)
				  {
				  break;
				  }
		  }
		  for (int j = i;j >= 0;j--)
		  {
				   q = 1;
				  for (int s = 0;s < j;s++)
				  {
					  q = q * 10;
				  }
				  a = a + n[b] * q;
				  b++;
		  }
		  System.out.printf("%d\n",a);
	 }
	public static int Main()
	{
		  int a;
		  int f = int;
		  for (int c = 0;c < 6;c++)
		  {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
			 f(a);
		  }
		  System.in.read();
		   System.in.read();
			System.in.read();
			System.in.read();
	}

}

