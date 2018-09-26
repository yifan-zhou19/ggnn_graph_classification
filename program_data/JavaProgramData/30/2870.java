package <missing>;

public class GlobalMembers
{
	//?7?????????
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = i + 1;
			if ((a[i] % 7 != 0) && (a[i] % 10 != 7) && (a[i] / 10 != 7)) //????????n????????7????
			{
				sum = sum + a[i] * a[i];
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

