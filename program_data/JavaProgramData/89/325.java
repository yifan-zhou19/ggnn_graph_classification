package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int j;
	int flag = 0;
	int tempa;
	int tempb;
	int[] a = new int[100000];
	int[] b = new int[100000];

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while ((tempa = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (tempb = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
	if (tempa == 0 && tempb == 0)
	{
	break;
	}
	b[tempb]++;
	a[tempa]++;
	}
	for (i = 0;i < n;i++)
	{
	if (b[i] == n - 1 && a[i] == 0)
	{
	System.out.print(i);
	System.out.print("\n");
	}
	flag = 1;
	}
	if (flag == 0)
	{
	System.out.print("NOT FOUND");
	System.out.print("\n");
	}
	return 0;
	}

}

