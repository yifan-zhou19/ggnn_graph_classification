package <missing>;

public class GlobalMembers
{
	/*???????
	???10/31*/
	public static int Main()
	{
		int[] a = new int[20000];
		int i;
		int j;
		int k;
		int n;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1, k = 1; i < n; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
			}
			if (j == i)
			{
				a[k] = a[i];
				k++;
				count++; //????????
			}

		}
		System.out.print(a[0]);
		for (k = 1; k <= count; k++)
		{
			System.out.print(" ");
			System.out.print(a[k]);
		}
		return 0;
	}
}

