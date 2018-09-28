package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int[] c = new int[100];
		int B;
		int C;
		int k;
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		b[0] = 0;
		B = 1;
		C = 0;
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (((a.charAt(i) != ' ') && (a.charAt(i + 1) == ' ')) || a.charAt(i + 1) == '\0')
			{
				c[C] = i;
				C = C + 1;
			}
		}
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i - 1) == ' ') && (a.charAt(i) != ' '))
			{
				b[B] = i;
				B = B + 1;
			}
		}
		for (i = B - 1;i > 0;i--)
		{
			for (j = b[i];j <= c[i];j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			System.out.print(" ");
		}
		for (j = b[0];j <= c[0];j++)
		{
				System.out.printf("%c",a.charAt(j));
		}
	}

}
