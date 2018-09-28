package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b;
		int ch;
		int i;
		int[] a = new int[5];
		i = 0;
		b = 0;

		while ((ch = System.in.read()) != '\n')
		{
			a[i] = ch - 48;
			i++;
			b++;
		}

		for (i = b - 1;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}


	}

}
