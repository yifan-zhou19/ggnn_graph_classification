package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1001];
		a[1000] = 1;
		int i;
		int j;
		while (n-- != 0)
		{
			for (i = 1000;i > 0;i--)
			{
				a[i] *= 2; //????????*2
			}
			 for (i = 1000;i > 0;i--)
			 {
				if (a[i] >= 10) //????????????10???
				{
					a[i] -= 10;
					a[i - 1] += 1;
				}
			 }
		}
		for (i = 0;i <= 1000;i++)
		{
			if (a[i] != 0)
			{
				for (j = i;j <= 1000;j++) //??
				{
				System.out.print(a[j]);
				}
				break;
			}
		}
		return 0;
	}

}

