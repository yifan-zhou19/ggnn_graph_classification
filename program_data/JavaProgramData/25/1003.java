package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[40];
		int[] b = new int[40];
		a[0] = 1,b[0] = 1;
		for (int i = 1;i < 40;i++)
		{
		a[i] = 0,b[i] = 0;
		}
		for (int i = 0;i < N;i++)
		{
		   for (int k = 0;k < 39;k++)
		   {
			   a[k] = a[k] * 2;
		   }
			for (int k = 0;k < 39;k++)
			{
			b[k] = a[k];
			}
			for (int k = 0;k < 39;k++)
			{

			   if (b[k] >= 10)
			   {
				b[k + 1]++;
				b[k] = b[k] - 10;
			   }
			}
				 for (int k = 0;k < 39;k++)
				 {
				 a[k] = b[k];
				 }
		}
		int m;
		for (int i = 39;i >= 0;i--)
		{
		  if (b[i] != 0)
		  {
			  m = i;
			  break;
		  }
		}
		for (int i = m;i >= 0;i--)
		{
		System.out.print(b[i]);
		}
		return 0;
	}

}

