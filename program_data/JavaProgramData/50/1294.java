package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w; //a[i]??i?1??????b[i]??i?13?????
		int[] a = new int[13];
		int[] b = new int[13];
		int[] c = new int[13];
		int i;
		c[1] = c[3] = c[5] = c[7] = c[8] = c[10] = c[12] = 31 % 7;
		c[2] = 28 % 7;
		c[4] = c[6] = c[9] = c[11] = 30 % 7;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = w;
		b[1] = (a[1] + 12) % 7;
		for (i = 2;i <= 12;i++)
		{
			a[i] = (a[i - 1] + c[i - 1]) % 7;
			b[i] = (a[i] + 12) % 7;
		}
		for (i = 1;i <= 12;i++)
		{
			if (b[i] == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
	}
}

