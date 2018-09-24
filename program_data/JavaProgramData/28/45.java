package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		int n;
		int[] b = new int[300];
		int s = 0;
		int[] c = new int[300];
		int t = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		a = tangible.StringFunctions.changeCharacter(a, n, 32);
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) != 32) && (a.charAt(i + 1) == 32))
			{
				b[s] = i;
				s++;
			}
			if ((a.charAt(i) == 32) && (a.charAt(i + 1) != 32))
			{
				c[t] = i;
				t++;
			}
		}
		for (i = 0;i < s;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",b[i] + 1);
			}
			else
			{
				System.out.printf(",%d",b[i] - c[i - 1]);
			}
		}

	}
}

