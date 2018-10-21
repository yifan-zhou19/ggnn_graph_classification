package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		(char)(*p)[50];
		String q;
		int n;
		int[] b = new int[6];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *w;
		int w;
		for (p = a;p < a + 6;p++)
		{
			p = new Scanner(System.in).nextLine();
		}
		for (p = a,w = b;p < a + 6;p++,w++)
		{
			n = p.length();
			if (**p == '-')
			{

				for (q = *p + n - 1;q > *p;q--)
				{
					w = w * 10 + (q - '0');
				}
				w = - w;
			}
			else
			{
				for (q = *p + n - 1;q >= *p;q--)
				{
					w = w * 10 + (q - '0');
				}
			}
		}
		for (w = b;w < b + 6;w++)
		{
			System.out.printf("%d\n", w);
		}
	}
}
