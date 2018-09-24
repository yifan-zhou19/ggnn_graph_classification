package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] p = a;
		int[] q = a;
		for (;p < a + n;p++)
		{
			p[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int temp;
		for (p--;q < p;q++,p--)
		{
			temp = q[0];
			q[0] = p[0];
			p[0] = temp;
		}
		p = a;
		System.out.print(p++);
		for (;p < a + n;p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
	}
}

