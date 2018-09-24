package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30}; //????a??1?11???????b??1?12?13??1?1??????w
		int[] b = new int[12];
		int w;
	w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b[0] = 12; //??b????
	for (int i = 1;i < 12;i++) //?????b???
	{
		b[i] = b[i - 1] + a[i - 1];
	}
	for (int i = 0;i < 12;i++) //???????13?????
	{
		if ((w + b[i] % 7) % 7 == 5)
		{
			System.out.print(i + 1);
			System.out.print("\n");
		}
	}
	return 0;
	}
}

