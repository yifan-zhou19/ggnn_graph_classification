package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		String b = new String(new char[1000]);
		int[] num = new int[1000];
		int sum = 1;
		int t = 1;
		int i;
		int j;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 1;a.charAt(i - 1) != 0;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) - a.charAt(i - 1) == 32 || a.charAt(i - 1) - a.charAt(i) == 32)
			{
				sum++;
			}
			else
			{
				num[t] = sum;
				if (a.charAt(i - 1) >= 97)
				{
					b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i - 1) - 32);
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i - 1));
				}
				sum = 1;
				t++;
			}

		}
		for (j = 1;j < t;j++)
		{
			System.out.print("(");
			System.out.print(b.charAt(j));
			System.out.print(",");
			System.out.print(num[j]);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}

}

