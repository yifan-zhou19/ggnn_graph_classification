package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		int n;
		int[] a = new int[100];
		int s = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 while (i % 10 == 7 || i / 10 == 7 || i % 7 == 0)
						 {
								 a[j] = i;
								 j++;
								 break;
						 }
		}
		for (i = 1;i <= n;i++)
		{
		s = s + i * i;
		}
		for (i = 1;i <= j - 1;i++)
		{
		k = k + a[i] * a[i];
		}
		System.out.print(s - k);
		System.out.print("\n");
		return 0;
	}

}

