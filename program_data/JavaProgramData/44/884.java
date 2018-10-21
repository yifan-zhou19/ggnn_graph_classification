package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[10];
		int i;
		int j;
		if (num == 0)
		{
		return (0);
		}
		else
		{
		   int c = 0;
		   int sum = 0;
		   for (i = 0;num != 0;i++)
		   {
			   c++;
			   a[i] = num % 10;
			   num = num / 10;
		   }
		   for (i = 0;i < c;i++)
		   {
		   for (j = 1;j < c - i;j++)
		   {
		   a[i] = a[i] * 10;
		   }
		   }
			for (i = 0;i < c;i++)
			{
			 sum = sum + a[i];
			}
			return (sum);
		}
	}
	public static int Main()
	{
		  int i;
		  for (i = 1;i <= 6;i++)
		  {
				  int a;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  System.out.printf("%d\n",reverse(a));
		  }
		  System.in.read();
		  System.in.read();

	}
}

