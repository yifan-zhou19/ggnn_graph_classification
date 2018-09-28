package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int num;
		int n;
		int i;
		int t;
		for (i = 0;i <= 5;i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   num = Integer.parseInt(tempVar);
		   }
		   if (num > 0 || num == 0)
		   {
			  n = reverse(num);
			  System.out.printf("%d\n",n);
		   }
		   else if (num < 0)
		   {
			   t = 0 - num;
			   n = reverse(t);
			   t = 0 - n;
			   System.out.printf("%d\n",t);
		   }

		}
	}
	public static int reverse(int num)
	{
		int w;
		w = num % 10; //????????
			num /= 10;
			while (num > 0)
			{
				w = (num % 10) + w * 10;
				num /= 10;
			}

		return w;
	}
}

