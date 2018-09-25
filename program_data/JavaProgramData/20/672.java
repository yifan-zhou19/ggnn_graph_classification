package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int ceshi;
		int i = 0;
		int j;
		int max;
		int weizhi;
		int chang;
		int k;
		final String str = "";
		final String substr = "";
		final String a = "";
		while (scanf("%s %s",str.charAt(i),substr.charAt(i)) != EOF)
		{
		 i++;
		} //????????????eof???????????i

		 ceshi = i;


		 for (i = 0;i < ceshi;i++)
		 {
			 max = str.charAt(i)[0];
			weizhi = 0;

			for (j = 0;str.charAt(i)[j] != '\0';j++)
			{ //????i?????????????j????weizhi?
				if (str.charAt(i)[j] > max)
				{
							  weizhi = j;
						   max = str.charAt(i)[j];
				}
			}

			a = tangible.StringFunctions.changeCharacter(a, i, String.valueOf(str.charAt(i)).substring(0, weizhi + 1));
			a.charAt(i)[weizhi + 1] = '\0'; //???????str[i]????a[i]??

			a.charAt(i) += substr.charAt(i); //?substr?i????a[i]???


			for (j = 1;str.charAt(i)[j + weizhi] != '\0';j++)
			{
				   a.charAt(i)[weizhi + 3 + j] = str.charAt(i)[j + weizhi]; //????????????????a[i]
			}

			chang = String.valueOf(str.charAt(i)).length();

			a.charAt(i)[chang + 3] = '\0'; //?????????str[i]??????a[i]????????\0

				 System.out.printf("%s\n",a.charAt(i));

		 }

	}
}

