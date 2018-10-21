package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[13];
		b[1] = w;
		for (i = 2;i <= 12;i++)
		{
						  if (a[i - 1] == 31)
						  {
						  b[i] = (b[i - 1] + 3) % 7;
						  }
						  else if (a[i - 1] == 30)
						  {
						  b[i] = (b[i - 1] + 2) % 7;
						  }
						  else if (a[i - 1] == 28)
						  {
						  b[i] = b[i - 1];
						  }
		}
		for (i = 1;i <= 12;i++)
		{
						  if (b[i] == 0 || b[i] == 7)
						  {
						  System.out.printf("%d", i);
						  System.out.print("\n");
						  }
		}

		return 0;
	}

}

