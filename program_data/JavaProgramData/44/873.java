package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;

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
	public static int reverse(int num)
	{
	  int[] a = new int[100];
	  int i;
	  int j;
	  int z = 0;
	  int b = 1;
		for (i = 0;;i++)
		{
			 a[i] = num % 10;
		  num = num / 10;
		  if (num == 0)
		  {
		  break;
		  }
		}
		  for (j = i;j >= 0;j--)
		  {
			  z = z + a[j] * b;
		   b = b * 10;
		  }
		return (z);
	}
}

