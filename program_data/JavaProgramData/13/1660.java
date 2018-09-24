package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int[] w = new int[200];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(w,0,(Integer.SIZE / Byte.SIZE));
	for (int i = 0;i < n;i++)
	{
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (w[k] == 0)
	{
	if (i != 0)
	{
		System.out.print(' ');
	}
	w[k] = 1;
	System.out.print(k);
	}
	}
	return 0;
	}

}

