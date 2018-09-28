package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int g;
		int[] a = new int[50]; //?????????a[0]????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;
		a[1] = 1; //???
		for (i = 1;i <= n;i++)
		{
			g = 0; //?????
			for (j = 1;j <= a[0];j++)
			{
				a[j] = a[j] * 2 + g; //???*2??????
				g = a[j] / 10;
				a[j] = a[j] % 10; //??????????
			}
			while (g > 0)
			{
				a[0]++;
				a[a[0]] = g % 10;
				g = g / 10;
			} //?????
		}
		for (i = a[0];i > 0;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}
}

