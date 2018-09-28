package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int i;
		int[] an = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			an[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = an + n - l;
		do
		{
			System.out.print(p);
			System.out.print(" ");
			p++;
			if (p > an + n - 1)
			{
				p = an;
			}
			if (p == an + n - l - 1)
			{
				break;
			}
		}while (p <= an + n - 1);
		System.out.print((an + n - l - 1));
		System.out.print("\n");
		return 0;
	}
}

