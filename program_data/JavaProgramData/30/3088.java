package <missing>;

public class GlobalMembers
{
	//?7???????
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = i + 1; //????
			if (a[i] % 7 != 0 && a[i] % 10 != 7 && (a[i] < 70 || a[i]>79))
			{
				sum = sum + a[i] * a[i]; //?????
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

