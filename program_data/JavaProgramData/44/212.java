package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a = 0;
		if (num > 0)
		{
		   do
		   {
		a = a * 10 + num % 10;
		num = num / 10;
		   } while (num != 0);
		}
		if (num < 0)
		{
		   num = num * (-1);
		do
		{
			a = a * 10 + num % 10;
		num = num / 10;
		} while (num != 0);
		a = a * (-1);
		}
		return a;
	}
	public static int Main()
	{
		  int[] a = new int[6];
		  int[] b = new int[6];
		  int i;
		   for (i = 0;i < 6;i++)
		   {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
			 b[i] = reverse(a[i]);
		   }
		   for (i = 0;i < 6;i++)
		   {
		   System.out.printf("%d\n",b[i]);
		   }
		   System.in.read();
		   System.in.read();
	}

}

