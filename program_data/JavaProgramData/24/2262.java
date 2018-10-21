package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		int[] length = new int[100];
		int[] point = new int[100];
		int i;
		int j;
		int a;
		int b;
		int k;
		int p;
		int q;
		word = new Scanner(System.in).nextLine();
		k = word.length();
		a = 0;
		b = 0;
		point[1] = 0;
		for (i = 0;i <= k;i++)
		{
			if (word.charAt(i) == 44 || word.charAt(i) == 32 || word.charAt(i) == '\0')
			{
				b = b + 1;
				length[b] = i - a;
				a = i + 1;
				point[b + 1] = i + 1;
			}
		}
		a = length[1];
		p = 1;
		for (i = 2;i <= b;i++)
		{
			if (length[i] > a)
			{
				a = length[i];
				p = i;
			}
		}
		for (i = point[p];i <= point[p] + a - 1;i++)
		{
			System.out.printf("%c",word.charAt(i));
		}
		System.out.print("\n");
		a = length[1];
		p = 1;
		for (i = 2;i <= b;i++)
		{
			if (length[i] < a && length[i] != 0)
			{
				a = length[i];
				p = i;
			}
		}
		for (i = point[p];i <= point[p] + a - 1;i++)
		{
			System.out.printf("%c",word.charAt(i));
		}
		return 0;
	}
}
