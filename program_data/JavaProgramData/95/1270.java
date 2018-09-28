package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int t = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		for (i = 0;(a[i] = System.in.read()) != '\n';i++)
		{
			if (a[i] > 96 && a[i] < 123)
			{
				a[i] = a[i] - 32;
			}
		}
		a[i] = '\0';
		for (i = 0;(b[i] = System.in.read()) != '\n';i++)
		{
			if (b[i] > 96 && b[i] < 123)
			{
				b[i] = b[i] - 32;
			}
		}
		b[i + 1] = '\0';
		for (i = 0;a[i] != '\0' && b[i] != '\0';i++)
		{
			if (a[i] > b[i])
			{
				t = 1;
				break;
			}
			else if (a[i] < b[i])
			{
				t = -1;
				break;
			}
		}
		if (t == 1)
		{
				System.out.print(">");
				System.out.print("\n");
		}
		else if (t == 0)
		{
				System.out.print("=");
				System.out.print("\n");
		}
		else
		{
				System.out.print("<");
				System.out.print("\n");
		}
		return 0;

	}

}
