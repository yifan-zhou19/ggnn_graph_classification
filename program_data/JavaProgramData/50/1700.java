package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int j(int x);
	public static int Main()
	{
	int[] b = new int[12];
	int w;
	int i;
	int[] a = {13, 44, 72, 103, 133, 164, 194, 225, 256, 286, 317, 347};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 12;i++)
	{
		b[i] = a[i] % 7 - 1;
		b[i] = (b[i] + w) % 7;
	}
	for (i = 0;i < 12;i++)
	{
		if (b[i] == 5)
		{
			System.out.printf("%d\n",i + 1);
		}
	}
	return 0;
	}

}

