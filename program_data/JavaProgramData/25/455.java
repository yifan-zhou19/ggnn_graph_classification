package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] a = new int[200];
		int[] b = new int[200];
		int length = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		a[0] = 2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (n == 0)
	   {
		   System.out.print(1);
	   }
	   else
	   {
		for (t = 1;t < n;t++)
		{
			 for (i = 0;i <= length - 1;i++)
			 {
			   b[i] = a[i] * 2 + b[i];
			   if (b[i] >= 10)
			   {
					  b[i + 1] = b[i + 1] + 1;
					  b[i] = b[i] - 10;
			   }
			 }
		   for (i = 199;i >= 0;i++)
		   {
			 if (b[i] != 0)
			 {
				  length = i;
				  break;
			 }
		   }
		   for (i = 0;i <= 199;i++)
		   {
				  a[i] = b[i];
				  b[i] = 0;
		   }
		}
		for (i = 199;i >= 0;i--)
		{
		 if (a[i] > 0)
		 {
		   break;
		 }
		}
		for (j = i;j >= 0;j--)
		{
		  System.out.print(a[j]);
		}
	   }

		  return 0;
	}


}

