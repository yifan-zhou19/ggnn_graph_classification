package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String b = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j = 1;
		int k = 1;
		int[] a = new int[1000];
		int len;
		len = str.length();
		for (i = 0;i < len;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, 0, str.charAt(0));
			if (str.charAt(i) == str.charAt(i + 1) || str.charAt(i) == str.charAt(i + 1) - 32 || str.charAt(i) == str.charAt(i + 1) + 32)
			{
				k++;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, str.charAt(i + 1));
				a[j - 1] = k;
				j++;
				k = 1;
			}
		}
			if (j == 1)
			{
				a[j - 1] = k;
			}
		else if (str.charAt(len - 1) == str.charAt(len))
		{
			a[j - 2] += 1;
		}
		for (i = 0;i < j - 1;i++)
		{
			if (b.charAt(i) <= 122 && b.charAt(i) >= 97)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			System.out.printf("(%c,%d)",b.charAt(i),a[i]);
		}
		return 0;
	}
}

