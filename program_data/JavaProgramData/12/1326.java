package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int b;
		int n = 0;
		int num = 0;
		while ((b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (b == -1)
			{
			break;
			}
			else if (b == 0)
			{
				for (int i = 0;i < n;i++)
				{
				for (int j = i;j < n;j++)
				{
				if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
				{
				num++;
				}
				}
				}
				n = 0;
				System.out.print(num);
				System.out.print("\n");
				num = 0;
			}
			else
			{
				a[n] = b;
				n++;
			}
		}
		return 0;
	}
}

