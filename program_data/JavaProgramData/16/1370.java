package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		int i;
		int n;
		int c;
		int b;
		int[] a = new int[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = 1;
		i = 0;
		while (b != 0)
		{
			a[i] = n % 10; //??????i+1??
		  b = n / 10;
		  n = b;
		  i++;
		}
		c = i;
		i = 0;
		while (i < c)
		{
			System.out.print(a[i]);
			i++;
		} //?????
		return 0;
	}
}

