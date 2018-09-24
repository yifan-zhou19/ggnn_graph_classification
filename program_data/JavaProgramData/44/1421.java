package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	  int a = 0;
	  int i;
	  int b = 1;
	  int j = 0;
	  int[] m = new int[5];
	  for (i = 0;(i <= 5) && (num != 0);i++)
	  {
		 m[i] = num % 10;
		 num = num / 10;
		 j++;
	  }
		 for (i = j - 1;i >= 0;i--)
		 {
			a = a + m[i] * b;
			b = b * 10;
		 }
	  return a;
	}
	public static int Main()
	{
	  int i;
	  int n;
	  int c;
	  for (i = 1;i <= 6;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  c = reverse(n);
		  System.out.printf("%d\n",c);
	  }
	  System.in.read();
	  System.in.read();
	}

}

