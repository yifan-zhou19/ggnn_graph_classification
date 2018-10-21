package <missing>;

public class GlobalMembers
{
	public static int len1;
	public static int len2;
	public static int[] array1 = new int[100];
	public static int[] array2 = new int[100];
	public static int[] sa = new int[100];
	public static void zp1(int[] a1, int l1)
	{
		int cur1;
		for (int i = 0; i < l1 - 1; i++)
		{
			for (int j = 0; j < l1 - 1 - i; j++)
			{
				if (a1[j] > a1[j + 1])
				{
					cur1 = a1[j];
					a1[j] = a1[j + 1];
					a1[j + 1] = cur1;
				}
			}
		}
	}
	public static void zp2(int[] a2, int l2)
	{
		int cur2;
		for (int i = 0; i < l2 - 1; i++)
		{
			for (int j = 0; j < l2 - 1 - i; j++)
			{
				if (a2[j] > a2[j + 1])
				{
					cur2 = a2[j];
					a2[j] = a2[j + 1];
					a2[j + 1] = cur2;
				}
			}
		}
	}
	public static void connection(int[] a1, int[] a2)
	{
		for (int i = 0;i < len1;i++)
		{
			sa[i] = array1[i];
		}
		for (int i = len1;i < len1 + len2;i++)
		{
			sa[i] = array2[i - len1];
		}
	}

	public static int Main()
	{

		len1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < len1;i++)
		{
			array1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < len2;i++)
		{
			array2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		zp1(array1, len1);
		zp2(array2, len2);
		connection(array1, array2);
		System.out.print(sa[0]);
		for (int i = 1;i < len1 + len2;i++)
		{
			System.out.print(" ");
			System.out.print(sa[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

