package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][41];
		int[] b = new int[1000];
		int num = 0;
		char * (p);
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(a[i]).length();
		}
		p = a[0][0];
		for (i = 0;i < n;i++)
		{
			num = num + b[i];
			if (num == b[i])
			{
				System.out.print(a[i]);
			}
			if (num <= 80 && num != b[i])
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
			if (num > 80)
			{
				System.out.print("\n");
				System.out.print(a[i]);
				num = b[i];
			}
			num = num + 1;
		}
		return 0;
	}
}

