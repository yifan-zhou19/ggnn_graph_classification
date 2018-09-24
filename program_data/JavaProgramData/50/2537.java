package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int temp;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			temp = 0;
			for (j = 1;j < i;j++)
			{
				temp += a[j];
			}
			temp += 12;
			temp = (temp + w) % 7;
			if (temp == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

