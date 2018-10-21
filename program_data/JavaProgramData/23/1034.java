package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int k;
		int j;
		String substr = new String(new char[100]);
		k = str.length();
		int recorder = 0; //recorder????????????????
		for (i = 0;i <= k;i++) //???i<k????????????????
		{
			if (str.charAt(i) == ' ')
			{
							   substr = tangible.StringFunctions.changeCharacter(substr, k - i - 1, ' ');
				for (j = 0;recorder + j < i;j++) //???j=recorder,j<=i???j??????????????????????????????????j?????????
				{
					substr = tangible.StringFunctions.changeCharacter(substr, k - i + j, str.charAt(recorder + j)); //???substr[k-i+j]=str[j]
				}
				recorder = i + 1;
			}
			else if (str.charAt(i) == '\0')
			{
				for (j = 0;recorder + j < k;j++)
				{
					substr = tangible.StringFunctions.changeCharacter(substr, k - i + j, str.charAt(recorder + j));
				}
			} //?????????????????

		}
		for (i = k;i < 100;i++)
		{
			substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
		}
		System.out.println(substr);
		return 0;
	}


}

