package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = new int[12];
		int sum = 0;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = (w + 5) % 7; //???13???????0?????
		for (int i = 1;i < 12;i++)
		{
				sum += a[i - 1];
				b[i] = (sum + 12 + w) % 7; //?i+1??????
		}
		for (int j = 0;j < 12;j++)
		{
				if (b[j] == 5)
				{
					System.out.print(j + 1);
					System.out.print("\n");
				}
		}
		return 0;
	}
}

