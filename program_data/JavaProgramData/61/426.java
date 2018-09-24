package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] b = new int[k];
	for (int i = 0;i < k;i++)
	{
		int a;
	b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	double n;
	n = b[i];
	a = Math.sqrt(5);
	a = ((Math.pow(((1 + Math.sqrt(5)) / 2),n) - (Math.pow(((1 - Math.sqrt(5)) / 2),n))) / Math.sqrt(5));
	System.out.print(a);
	System.out.print("\n");
	}
	return 0;
	}
}

