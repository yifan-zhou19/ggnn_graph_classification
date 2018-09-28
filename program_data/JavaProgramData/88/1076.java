package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int i;
		int n;
		int[] b = new int[20];
		int k = 0;
		int num = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		a = tangible.StringFunctions.changeCharacter(a, n, ' ');
		for (i = 0;i < n + 1;i++)
		{
			if (a.charAt(i) - '0' >= 0 && a.charAt(i) - '0' < 10)
			{
				num = num * 10 + a.charAt(i) - '0';
			}
			else if ((a.charAt(i - 1) - '0' >= 0 && a.charAt(i - 1) - '0' < 10) && (a.charAt(i) - '0' < 0 || a.charAt(i) - '0' >= 10))
			{
				b[k] = num;
				num = 0;
				k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i]);
			}
			else
			{
				System.out.printf("\n%d",b[i]);
			}
		}

		return 0;
	}
}

