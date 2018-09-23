package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int j;
		int k;
		int num;
		int length;
		String words = new String(new char[1000]);
		words = new Scanner(System.in).nextLine();
		length = words.length();
		for (i = 0;i < length;i++)
		{
		words = tangible.StringFunctions.changeCharacter(words, i, Character.toUpperCase(words.charAt(i)));
		}
		for (i = 0;i < length;i++)
		{
				num = 1;
			for (j = i;j < length;j++)
			{
				if (words.charAt(j) == words.charAt(j + 1))
				{
					num++;
				}
				else
				{
					break;
				}
			}
			if (words.charAt(i) != words.charAt(i - 1))
			{
				System.out.printf("(%c,%d)",words.charAt(i),num);
			}
		}

	}
}

