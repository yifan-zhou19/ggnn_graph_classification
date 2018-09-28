package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int l1;
		int l2;
		int k;
		int p;
		int o = 0;
		int[] a = new int[200];
		int carry = 0;
		int jump;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		String str3 = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}

			l1 = str1.length();
			l2 = str2.length();

			str1 = tangible.StringFunctions.changeCharacter(str1, 101, '\0');
			jump = 101 - l1;
			for (m = l1 - 1;m >= 0;m--)
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, m + jump, str1.charAt(m));
			}
			for (m = 0;m < jump;m++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, m, '0');
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, 101, '\0');
			jump = 101 - l2;
			for (m = l2 - 1;m >= 0;m--)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, m + jump, str2.charAt(m));
			}
			for (m = 0;m < jump;m++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, m, '0');
			}

			for (j = 100;j >= 100 - l1;j--)
			{
				if (str1.charAt(j) >= (carry + str2.charAt(j)))
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(j) - (str2.charAt(j) + carry) + 48);
					carry = 0;
				}
				else
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(j) + 10 - (str2.charAt(j) + carry) + 48);
					carry = 1;
				}
			}

		   for (k = 101 - l1;k <= 100;k++)
		   {
			   System.out.printf("%c",str3.charAt(k));

		   }
		   System.out.print("\n");
		}
	}
}

