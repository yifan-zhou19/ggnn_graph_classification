package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int w;
		int i;
		int m = 0;
	int[] a = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
	int[] b = new int[12];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 12;i++)
	{
		b[i] = (w + a[i]) % 7;
	w = b[i];
	if (b[i] == 5)
	{
		System.out.printf("%d\n",i + 1);
	}
	}
	}
}

