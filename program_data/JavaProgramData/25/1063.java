package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int te;
		int[] a = new int[100];
		int yu = 0;
		int io = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		if (n == 0)
		{
			System.out.print(a[0]);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= n; i++)
			{
			  for (k = 0; k < 100; k++)
			  {
				  io = yu; //io?????, yu????
				  te = a[k] * 2;
				  if (te > 9)
				  {
					  yu = 1;
					  a[k] = te - 10 + io;
				  }
				  else
				  {
					  a[k] = te + io;
					  yu = 0;
				  }
			  }
			}
		  for (k = 99; a[k] == 0; k--)
		  {
			  ;
		  }
		  for (i = k; i >= 0; i--)
		  {
			System.out.print(a[i]);
		  }
		}
		return 0;
	}
}

