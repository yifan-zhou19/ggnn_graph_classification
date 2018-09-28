package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}

		for (int i = 0;i < n;i++) //????
		{
			b[i] = a[n - i - 1];
		}
	  for (int i = 0;i < n - 1;i++)
	  {
					System.out.printf("%d ",b[i]); //????
	  }
	   System.out.printf("%d",b[n - 1]);
	}
}

