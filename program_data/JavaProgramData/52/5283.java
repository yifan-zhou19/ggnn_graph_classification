package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int[] m = new int[102];
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < a;i++)
	{
	m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int i = a - b;i < a;i++)
	{
	System.out.print(m[i]);
	System.out.print(" ");
	}
	for (int i = 0;i < a - b;i++)
	{
	System.out.print(m[i]);
	if (i != a - b - 1)
	{
	System.out.print(" ");
	}
	}
	}
}

