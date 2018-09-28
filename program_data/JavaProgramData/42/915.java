package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int x;
		int[] a = new int[999999];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			if (a[i] != x)
			{
				System.out.print(a[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	i++;
	for (;i <= k;i++)
	{
			if (a[i] != x)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
	}
		return 0;

	}
}

