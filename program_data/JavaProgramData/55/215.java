package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int sum = 0;
		int t;
		int r;
		String str1 = new String(new char[255]);
		String str2 = new String(new char[255]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = str1.length();
		for (i = 0;i < n;i++)
		{
			if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
			{
				t = str1.charAt(i) - '0';
			}
			else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				t = str1.charAt(i) - 'A' + 10;
			}
			else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				t = str1.charAt(i) - 'a' + 10;
			}
				sum = sum * a + t;
		}
		i = 0;
		if (sum == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			while (sum != 0)
			{


			while (sum != 0)
			{
				r = sum % b;
				if (r < 10)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, r + '0');
				}
				else if (r >= 10)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, r - 10 + 'A');
				}
				sum = sum / b;
				i++;
			}
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
			i = str2.length() - 1;
			while (str2.charAt(i) == '0')
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.printf("%c",str2.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

