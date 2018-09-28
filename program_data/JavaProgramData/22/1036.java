package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[300];
	int n;
	int i;
	int j;
	int max;
	int sec;
	char c;
	i = 0;
	do
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		c = tempVar2.charAt(0);
	}
	i++;
	} while (c != '\n');
	n = i;
	max = a[0];
	sec = -1;
	for (i = 1;i < n;i++)
	{
	if (a[i] > max)
	{
		sec = max;
		max = a[i];
	}
	else if (a[i] < max && a[i]> sec)
	{
		sec = a[i];
	}
	else
	{
		;
	}
	}
	if (sec != -1)
	{
		System.out.printf("%d",sec);
	}
	else
	{
		System.out.print("No");
	}
	return 0;
	}
}

