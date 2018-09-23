package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int l;
		int sum;
		int temp = 0;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		j = 65;
		while (j <= 90 || (j >= 97 && j <= 122))
		{
			sum = 0;
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == j)
				{
					sum = sum + 1;
				}
			}
			if (sum > 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, j);
				System.out.printf("%c=%d\n",b.charAt(j),sum);
				temp = 1;
			}
			j = j + 1;
		}
		j = 97;
		while (j >= 97 && j <= 122)
		{
			sum = 0;
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == j)
				{
					sum = sum + 1;
				}
			}
			if (sum > 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, j);
				System.out.printf("%c=%d\n",b.charAt(j),sum);
				temp = 1;
			}
			j = j + 1;
		}
		if (temp == 0)
		{
			System.out.print("No");
		}
	}



}

