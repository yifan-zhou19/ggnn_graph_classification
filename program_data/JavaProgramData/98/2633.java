package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] l = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int num = 0;
		int i;
		char[][] a = new char[500][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = String.valueOf(a[i]).length();
		}
		p = l[1];
		for (i = 1;i <= n;i++)
		{
			if (num == 0)
			{
				System.out.print(a[i]);
				num = p + num + 1;
				p++;
				continue;
			}
			num = num + p + 1;
			if (num <= 81)
			{
				System.out.print(" ");
				System.out.print(a[i]);
				p++;
				continue;
			}
			if (num > 81)
			{
				num = 0;
				i--;
				System.out.print("\n");
				continue;
			}
		}
		return 0;
	}
}

