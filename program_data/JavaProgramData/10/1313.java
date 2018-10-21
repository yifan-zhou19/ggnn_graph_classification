package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int[] n = new int[25];
	public static int[] h = new int[25];

	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0;i < k;i++)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(n,(Integer.SIZE / Byte.SIZE),0);
		int tem = 0;
		for (i = 0;i < k;i++)
		{
			tem = 0;
		   for (j = 0;j < i;j++)
		   {
			   if (h[j] >= h[i])
			   {
				   if (n[j] > tem)
				   {
					   tem = n[j];
				   }
			   }
		   }
		   n[i] = 1 + tem;
		}
		tem = 0;
		for (i = 0;i < k;i++)
		{
			if (n[i] > tem)
			{
				tem = n[i];
			}
		}
		System.out.print(tem);
		System.out.print("\n");
		return 0;
	}
}

