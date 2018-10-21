package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k;
		int a;
		int b;
		int carry;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		final String str3 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{

			a = str3.length();
			for (j = 0;j < a;j++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, j, '\0');
			}
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

			a = str1.length();
			b = str2.length();
			carry = 0;
			for (j = a - 1,k = b - 1;j > a - b - 1;j--,k--)
			{
			   str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(j) - str2.charAt(k) + '0' - carry);
			   if (str3.charAt(j) - '0' < 0)
			   {
				   carry = 1;
				   str3.charAt(j) += 10;
			   }
			   else
			   {
				   carry = 0;
			   }
			}
			for (j = a - b - 1;j >= 0;j--)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(j) - carry);
				if (str3.charAt(j) - '0' < 0)
				{
				   carry = 1;
				   str3.charAt(j) += 10;
				}
				else
				{
					carry = 0;
				}
			}
			if (str3.charAt(0) == '0')
			{
				for (j = 0;j < a;j++)
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, j, str3.charAt(j + 1));
				}
			}
			System.out.printf("%s",str3);
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
	}


}

