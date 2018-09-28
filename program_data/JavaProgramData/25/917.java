package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k = 1;
	public static int[] a = new int[35];
	public static int[] b = new int[35];
	public static void multiple() //????????2???
	{
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else
		{
			if (k == n)
			{
				for (i = 34;i >= 0;i--)
				{
					if (a[i] != 0)
					{
						break;
					}
				}
				for (j = i;j >= 0;j--)
				{
					System.out.print(a[j]);
				}
			}
			else
			{
				b[0] = (a[0] * 2) % 10;
				for (i = 1;i < 35;i++)
				{
					b[i] = (a[i] * 2) % 10 + a[i - 1] * 2 / 10; //???+??
				}
				for (i = 0;i < 35;i++)
				{
					a[i] = b[i];
				}
				k++;
				multiple();
			}
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 2;
		multiple();
		return 0;
	}
}

