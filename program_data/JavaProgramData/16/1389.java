package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n = 0;
	   int num;
	   int m;
	   int a;
	   int b;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   num = Integer.parseInt(tempVar);
	   }
	   m = num;
	   do
	   {
		   n = n * 10 + num % 10;
		num = num / 10;
	   }while (num != 0);

	   int weishu = int x;
	   a = weishu(m);
	   b = weishu(n);
	   if (a - b == 4)
	   {
		   System.out.printf("0000%d\n",n);
	   }
	   else if (a - b == 3)
	   {
		   System.out.printf("000%d\n",n);
	   }
	   else if (a - b == 2)
	   {
		   System.out.printf("00%d\n",n);
	   }
	   else if (a - b == 1)
	   {
		   System.out.printf("0%d\n",n);
	   }
	   else
	   {
		   System.out.printf("%d\n",n);
	   }
	}

	public static int weishu(int x)
	{
		int y;
		if (x >= 10000)
		{
			y = 5;
		}
		else if (x >= 1000)
		{
			y = 4;
		}
		else if (x >= 100)
		{
			y = 3;
		}
		else if (x >= 10)
		{
			y = 2;
		}
		else
		{
			y = 1;
		}
		return (y);
	}

}

