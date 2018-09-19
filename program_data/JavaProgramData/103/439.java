package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String yasuoc = new String(new char[1000]);
		int[] yasuoi = new int[1000];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 1;
		int temp = 1;
		int sum = 0;
		while (i < a.length())
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) - a.charAt(i - 1) == 32 || a.charAt(i) - a.charAt(i - 1) == -32)
			{
				temp++;
				i++;
			}
			else
			{
				if (a.charAt(i - 1) - 'a' >= 0)
				{
					yasuoc = tangible.StringFunctions.changeCharacter(yasuoc, sum, a.charAt(i - 1) - 32);
				}
				else
				{
					yasuoc = tangible.StringFunctions.changeCharacter(yasuoc, sum, a.charAt(i - 1));
				}
				yasuoi[sum++] = temp;
				temp = 1;
				i++;
			}
		}
		if (a.charAt(i - 1) - 'a' >= 0)
		{
			yasuoc = tangible.StringFunctions.changeCharacter(yasuoc, sum, a.charAt(i - 1) - 32);
		}
		else
		{
			yasuoc = tangible.StringFunctions.changeCharacter(yasuoc, sum, a.charAt(i - 1));
		}
		yasuoi[sum++] = temp;
		for (i = 0 ; i < sum ; i++)
		{
			System.out.print("(");
			System.out.print(yasuoc.charAt(i));
			System.out.print(",");
			System.out.print(yasuoi[i]);
			System.out.print(")");
		}
		return 0;
	}
}

