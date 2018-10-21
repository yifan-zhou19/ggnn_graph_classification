package <missing>;

public class GlobalMembers
{
	public static void turn(String a)
	{
		int i;
		int j;
		int k;
		char[][] b = new char[100][100];
		i = 0;
		j = 0;
		k = 0;
		while (!a[i].equals('\0'))
		{
			if (!a[i].equals(' '))
			{
				b[j][k] = a[i];
				k++;
			}
			if (a[i].equals(' '))
			{
				b[j][k] = '\0';
				k = 0;
				j++;
			}
			i++;
		}
		b[j][k] = '\0';
		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s",b[i]);
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		turn(a);
	}
}
