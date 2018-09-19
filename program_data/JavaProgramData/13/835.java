package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //temp??????b[100001]???????
		int i;
		int j;
		int[] a = new int[100001];
		int[] b = new int[100001];
		int temp = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[0] = a[0];
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					break; //??????????????
				}
				if (j == i - 1) //????????
				{
					b[temp] = a[i];
					temp++;
				}
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

