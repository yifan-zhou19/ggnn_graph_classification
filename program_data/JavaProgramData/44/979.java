package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int reverse = int num;
	  int[][] a = new int[6][1];
	  int i;
	  for (i = 0;i < 6;i++)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i][0] = Integer.parseInt(tempVar);
	  }
	  }
	  for (i = 0;i < 6;i++)
	  {
	  System.out.printf("%d\n",reverse(a[i][0]));
	  }
	}
	 public static int reverse(int num)
	 {
		 int i;
		 int wei;
		 int z = 0;
		 int[] b = new int[100];
		 if (num < 0)
		 {
		  num = -num;
		  wei = Math.log10(num) + 1;

		   for (i = 0;i < wei;i++)
		   {
			   b[i] = num / (Math.pow(10,(wei - i - 1)));
			   num = num - b[i] * Math.pow(10,(wei - i - 1));
		   }
		   for (i = 0;i < wei;i++)
		   {
			 z += b[i] * Math.pow(10,i);
		   }
	z = -z;
		 }
	else if (num > 0)
	{
			wei = Math.log10(num) + 1;

		   for (i = 0;i < wei;i++)
		   {
			   b[i] = num / (Math.pow(10,(wei - i - 1)));
			   num = num - b[i] * Math.pow(10,(wei - i - 1));
		   }
		   for (i = 0;i < wei;i++)
		   {
			 z += b[i] * Math.pow(10,i);
		   }
	}
	else
	{
		z = 0;
	}
		 return (z);
	 }


}

