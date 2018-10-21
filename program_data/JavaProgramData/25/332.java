package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[1000];
int[] b = new int[1000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
			return 0;
		}
		n--;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int a[1000],b[1000];
		for (int i = 0;i < 1000;i++)
		{
			Main_a[i] = 0;
		}
		Main_a[0] = 1;
		Main_a[1] = 2;
		while (n != 0)
		{
			n--;
			for (int i = 0;i < 1000;i++)
			{
				b[i] = 0;
			}
			b[0] = Main_a[0];
			for (int i = 1;i <= Main_a[0];i++)
			{
				b[i] += Main_a[i] * 2;
				b[i + 1] += b[i] / 10;
				b[i] %= 10;
			}
			if (b[Main_a[0] + 1] > 0)
			{
				b[0]++;
			}
			for (int i = 0;i < 1000;i++)
			{
				Main_a[i] = b[i];
			}
		}
		for (int i = Main_a[0];i >= 1;i--)
		{
			System.out.print(Main_a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

