package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[14444];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	a[0] = n;
	i = 0;
	while (n > -1)
	{
	n = a[i] % 2;
	if (n == 0)
	{
	a[i + 1] = a[i] / 2;
	System.out.printf("%d/2=%d\n",a[i],a[i + 1]);
	}
	else if (n == 1 && a[i] != 1)
	{
		a[i + 1] = 3 * a[i] + 1;
		System.out.printf("%d*3+1=%d\n",a[i],a[i + 1]);
	}
	else if (a[i] == 1)
	{
		System.out.print("End\n");
	break;
	}





	i++;
	}






	return 0;
	}
}

