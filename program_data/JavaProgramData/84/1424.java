package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] num = new int[100];
	int i = 0;
	int temp1 = 0;
	int temp2 = 0;
	int t = 0;
	for (i = 0;i < n;i++)
	{
	num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (temp1 < num[i])
	{
	temp1 = num[i];
	t = i;
	}
	}
	for (i = 0;i < n;i++)
	{
	if (i == t)
	{
		continue;
	}
	else
	{
	if (temp2 < num[i])
	{
		temp2 = num[i];
	}
	}
	}
	System.out.print(temp1);
	System.out.print("\n");
	System.out.print(temp2);
	System.out.print("\n");
	return 0;
	}

}

