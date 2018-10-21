package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n0;
	int i0;
	n0 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i0 = 0;i0 < n0;i0++)
	{
	int time = 0;
	int[] a = new int[100];
	int i;
	int n;
	int s;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
		System.out.print(60);
		System.out.print("\n");
		continue;
	}
	for (i = 0;i < n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] + 3 * time < 60)
		{
			time++;
		}
	   else
	   {
		   break;
	   }
	}
	if (a[i - 1] + 3 * time < 60)
	{
		s = 60 - 3 * time;
	System.out.print(s);
	System.out.print("\n");
	continue;
	}
	if (a[i - 1] + 3 * (time-1) < 60)
	{
		s = 60 - 3 * time + a[i - 1] + 3 * time-60;
	}
	else
	{
		s = 60 - 3 * time;
	}
	System.out.print(s);
	System.out.print("\n");
	}

	return 0;
	}

}

