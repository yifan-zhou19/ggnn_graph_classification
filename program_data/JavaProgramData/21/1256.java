package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	float sum;
	int[] a = new int[300];
	for (int i = 0;i <= n - 1;i++)
	{

	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	sum = sum + a[i];
	}
	int k;
	for (int i = 0;i < n - 1;i++)
	{
	for (int s = 0;s < n - 1 - i;s++)
	{
	if (a[s] > a[s + 1])
	{
	k = a[s];
	a[s] = a[s + 1];
	a[s + 1] = k;
	}
	}
	}
	float pingjun = sum / n;
	float h = pingjun - a[0];
	float t = a[n - 1] - pingjun;
	if (h == t)
	{
	System.out.print(a[0]);
	System.out.print(",");
	System.out.print(a[n - 1]);
	System.out.print("\n");
	}
	else if (h > t)
	{
	System.out.print(a[0]);
	}
	else if (h < t)
	{
	System.out.print(a[n - 1]);
	}
	return 0;
	}





}

