package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int[][] juzhen = new int[101][101];
	public static int sum = 0;
	public static int hang = 0;
	public static void hangxiao()
	{
		int i;
		int j;
		int xiao = 1000;
		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < hang;j++)
			{
				if (xiao > juzhen[i][j])
				{
					xiao = juzhen[i][j];
				}
			}
			for (j = 0;j < hang;j++)
			{
				juzhen[i][j] -= xiao;
			}
			xiao = 1000;
		}
	}
	public static void liexiao()
	{
		int i;
		int j;
		int xiao = 1000;
		for (j = 0;j < hang;j++)
		{
			for (i = 0;i < hang;i++)
			{
				if (xiao > juzhen[i][j])
				{
					xiao = juzhen[i][j];
				}
			}
			for (i = 0;i < hang;i++)
			{
				juzhen[i][j] -= xiao;
			}
			xiao = 1000;
		}
	}
	public static void xiaojian()
	{
		int i;
		int j;
		int xiao = 0;
		for (i = 2;i < hang;i++)
		{
			for (j = 0;j < hang;j++)
			{
				juzhen[i - 1][j] = juzhen[i][j];
			}
		}
		for (j = 2;j < hang;j++)
		{
			for (i = 0;i < hang;i++)
			{
				juzhen[i][j - 1] = juzhen[i][j];
			}
		}
	}

	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = a;

		while (a > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(juzhen,0,(Integer.SIZE / Byte.SIZE));
			sum = 0;
			int b;
			int c;
			int d;
			int e;
			int i;
			int j;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			hang = n;
			while (hang > 1)
			{
				hangxiao();
				liexiao();
				sum += juzhen[1][1];
				xiaojian();
				hang--;
			}
			System.out.print(sum);
			System.out.print("\n");
			a--;
		}
		return 0;
	}
}

