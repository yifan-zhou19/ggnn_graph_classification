package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int p = 0;
		int[] a = new int[101];
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		for (j = 1;j <= n - 1;j++)
		{
			  for (i = 1;i <= n - j;i++)
			  {
					if (a[i] < a[i + 1])
					{
						  p = a[i];
						  a[i] = a[i + 1];
						  a[i + 1] = p;
					}
			  }
		}
		System.out.print(a[1]);
		System.out.print("\n");
		System.out.print(a[2]);
		return 0;
	}

}

