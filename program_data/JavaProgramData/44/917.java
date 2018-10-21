package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int reverse = int num;
	  int a;
	  int b;
	  int i;
	  for (i = 0;i < 6;i++)
	  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = reverse(a);
		System.out.printf("%d\n",b);
	  }
	}

	public static int reverse(int num)
	{
		int num1;
		int n;
		int c1;
		int c2;
		int c3;
		int c4;
		int c5;
		if (num / 10000 != 0)
		{
			c1 = num / 10000;
			c2 = (num / 1000) % 10;
			c3 = (num / 100) % 10;
			c4 = (num / 10) % 10;
			c5 = num % 10;
			num1 = c1 + c2 * 10 + c3 * 100 + c4 * 1000 + c5 * 10000;
		}
		 else if (num / 1000)
		 {
			 c1 = num / 1000;
			 c2 = (num / 100) % 10;
			 c3 = (num / 10) % 10;
			 c4 = (num % 10);
			 num1 = c1 + c2 * 10 + c3 * 100 + c4 * 1000;
		 }
		 else if (num / 100)
		 {
			 c1 = num / 100;
			 c2 = (num / 10) % 10;
			 c3 = num % 10;
			 num1 = c1 + c2 * 10 + c3 * 100;
		 }
		 else if (num / 10)
		 {
			 c1 = num / 10;
			 c2 = num % 10;
			 num1 = c1 + c2 * 10;
		 }
		 else
		 {
			 num1 = num;
		 }
		return (num1);
	}
}

