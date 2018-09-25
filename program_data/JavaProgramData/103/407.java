package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int[] times = new int[100]; //?????????????
		int[] start = new int[100]; //?????????????
		int sum = 0;
		int i;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				times[sum]++;
			}
			else
			{
				times[sum]++;
				sum++;
				start[sum] = i + 1;
			}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.print('(');
			System.out.print(a.charAt(start[i]));
			System.out.print(',');
			System.out.print(times[i]);
			System.out.print(')');
		}
		return 0;
	}
}

