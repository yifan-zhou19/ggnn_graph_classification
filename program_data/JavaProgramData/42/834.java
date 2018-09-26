package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //temp??????b[100001]??????
		int i;
		int k;
		int[] a = new int[100001];
		int[] b = new int[100001];
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				b[temp] = a[i]; //a[i]???k?????
				temp++;
			}
		}
		for (i = 0;i < temp - 1;i++)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		System.out.print(b[temp - 1]);
		return 0;
	}
}

