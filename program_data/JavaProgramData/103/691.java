package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		final String letter = "";
		int i;
		int j;
		int[] times = new int[1000];
		for (i = 0; i < 1000; i++)
		{
			times[i] = 1;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (i = 0, j = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) == str.charAt(i + 1) || str.charAt(i) == str.charAt(i + 1) + 32 || str.charAt(i) == str.charAt(i + 1) - 32)
			{
				times[j]++;
			}
			else
			{
				if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
				{
					letter = tangible.StringFunctions.changeCharacter(letter, j, str.charAt(i));
				}
				else
				{
					letter = tangible.StringFunctions.changeCharacter(letter, j, str.charAt(i) - 32);
				}
				j++;
			}
		}
		for (j = 0; letter.charAt(j) != '\0'; j++)
		{
			System.out.printf("(%c,%d)",letter.charAt(j),times[j]);
		}
		System.out.print("\n");
	}
}

