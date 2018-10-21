package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String children = new String(new char[100]);
		children = new Scanner(System.in).nextLine();
		int[] boys = new int[50];
		int i;
		int top = 0;
		boys[0] = 0;
		for (i = 1; children.charAt(i); i++)
		{
			if (children.charAt(i) == children.charAt(0))
			{
				boys[++top] = i;
			}
			else
			{
				System.out.printf("%d %d\n", boys[top--], i);
			}
		}
		return 0;
	}
}
