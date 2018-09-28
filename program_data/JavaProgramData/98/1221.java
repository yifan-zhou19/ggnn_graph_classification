package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] ch = new char[300][50];
		int[] lengthch = new int[300];
		for (int i = 0;i < n;i++)
		{
			*(ch + i) = ConsoleInput.readToWhiteSpace(true);
			lengthch[i] = String.valueOf(*(ch + i)).length();
		}
		int num = 80;
		for (int i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.print((ch + i));
			}
			else
			{
			if (num - lengthch[i] - lengthch[i + 1] > 0)
			{
				System.out.print((ch + i));
				System.out.print(' ');
				num = num - lengthch[i] - 1;
			}
			else
			{
				System.out.print((ch + i));
				System.out.print("\n");
				num = 80;
			}
			}
		}
		return 0;
	}
}

