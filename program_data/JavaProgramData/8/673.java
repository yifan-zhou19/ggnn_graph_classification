package <missing>;

public class GlobalMembers
{
	public static int[] s1 = new int[100];
	public static int[] s2 = new int[100];
	public static int[] s3 = new int[200];
	public static int a = 0;
	public static int b = 0;

	public static void read()
	{ //??????????????????
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0; i < a; i++)
		 {
			 s1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int i = 0; i < b; i++)
		 {
			 s2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}

	public static void sort1()
	{ //???????????
		for (int i = 0; i < a - 1; i++)
		{
			for (int j = i + 1; j < a; j++)
			{
				if (s1[i] > s1[j])
				{
					int temp = s1[i];
					s1[i] = s1[j];
					s1[j] = temp;
				}
			}
		}
	}

	public static void sort2()
	{
		for (int i = 0; i < b - 1; i++)
		{
			for (int j = i + 1; j < b; j++)
			{
				if (s2[i] > s2[j])
				{
					int temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}
			}
		}
	}

	public static void add()
	{ //  ??????????
		for (int i = 0; i < a; i++)
		{
			s3[i] = s1[i];
		}
		for (int i = 0; i < b; i++)
		{
			s3[i + a] = s2[i];
		}
	}

	public static void write()
	{ //  ?????????
		for (int i = 0; i < a + b - 1; i++)
		{
			System.out.print(s3[i]);
			System.out.print(' ');
		}
		System.out.print(s3[a + b - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		read();
		sort1();
		sort2();
		add();
		write();

		return 0;
	}
}

