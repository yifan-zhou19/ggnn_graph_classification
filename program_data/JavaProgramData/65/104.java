package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] a = new int[1000];
	int[] b = new int[1000];
	int q = 0;
	int w = 0;
	int e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] == b[i])
	{
		q++;
	}
	if (a[i] < b[i])
	{
	if (a[i] == 0 && b[i] == 2)
	{
		e++;
	}
	else
	{
		w++;
	}
	}
	if (a[i] > b[i])
	{
	if (a[i] == 2 && b[i] == 0)
	{
		w++;
	}
	else
	{
		e++;
	}
	}
	}
	if (e > w)
	{
		System.out.print("B");
	}
	if (e < w)
	{
		System.out.print("A");
	}
	if (e == w)
	{
		System.out.print("Tie");
	}
		return 0;
	}

}

