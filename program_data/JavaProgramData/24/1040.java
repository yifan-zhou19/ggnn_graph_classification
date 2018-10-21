package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String min = new String(new char[50]);
		String max = new String(new char[50]);
		String s = new String(new char[1000]);
		int i;
		int len;
		int len1 = 0;
		int len2 = 50;
		int count;
		int k = 0;
		int j;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i <= len;i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				count = i - k;

				if (count > len1)
				{
					int l = 0;
					for (j = k;j < i;j++)
					{
						max = tangible.StringFunctions.changeCharacter(max, l, s.charAt(j));
						l++;
					}
					max = tangible.StringFunctions.changeCharacter(max, l, '\0');
					len1 = count;
				}
				if (count < len2 && count != 0)
				{
					int l = 0;
					for (j = k;j < i;j++)
					{
						min = tangible.StringFunctions.changeCharacter(min, l, s.charAt(j));
						l++;
					}
					min = tangible.StringFunctions.changeCharacter(min, l, '\0');
					len2 = count;
				}
				k = i + 1;
			}
		}
		System.out.printf("%s\n",max);
		System.out.printf("%s",min);
		return 0;
	}



}

