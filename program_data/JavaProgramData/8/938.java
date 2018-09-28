package <missing>;

public class GlobalMembers
{
	public static void read(int[] s, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
		}
	}
	public static void arrange(int[] s, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (s[j] > s[j + 1])
				{
					t = s[j + 1];
					s[j + 1] = s[j];
					s[j] = t;
				}
			}
		}
	}
	public static void connect(int[] array1, int[] array2, int p1, int p2)
	{
		int i;

		for (i = p1;i < p1 + p2;i++)
		{
			array1[i] = array2[i - p1];
		}
	}
	public static void print(int[] array, int num)
	{
		int i;
		System.out.printf("%d", array[0]);
		for (i = 1;i < num;i++)
		{
			System.out.printf(" %d", array[i]);
		}
	}
	public static int Main()
	{
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		read(s1, n1);
		read(s2, n2);
		arrange(s1, n1);
		arrange(s2, n2);
		connect(s1, s2, n1, n2);
		print(s1, n1 + n2);
		return 0;
	}
}

