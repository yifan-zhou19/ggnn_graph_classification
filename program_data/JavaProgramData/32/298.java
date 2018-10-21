package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static void fuc(tangible.RefObject<String> num0, int n) //??j-1?
	{
		if (num0.argValue.charAt(n) > '0')
		{
			num0.argValue.charAt(n) = num0.argValue.charAt(n) - 1;
		}
		else
		{
			num0.argValue.charAt(n) = '9';
			fuc(num0, n - 1);
		}

	}
	public static void minus(String num0, String num1)
	{
		int[] last = new int[2];
		int i;
		int j;
		int k;
		last[0] = num0.length() - 1; //??????
		last[1] = num1.length() - 1;
		a = tangible.StringFunctions.changeCharacter(a, last[0] + 1, '\0');
		for (i = last[1],j = last[0];j >= 0;i--,j--)
		{
			if (i >= 0)
			{
				if (num0[j] - num1[i] >= 0 != null)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, num0[j] - num1[i] + '0');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, num0[j] - num1[i] + '0' + 10);
				tangible.RefObject<String> tempRef_num0 = new tangible.RefObject<String>(num0);
					fuc(tempRef_num0, j - 1);
					num0 = tempRef_num0.argValue;
				}
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, num0[j]);
			}

		}
		if (a.charAt(0) == '0')
		{
			for (i = 0;;i++)
			{
				if (a.charAt(i) == '0')
				{
					continue;
				}
				else
				{
					j = i;
					for (k = j;k <= last[0] + 1;k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k - j, a.charAt(k));
					}
					break;
				}

			}
		}


	}
	public static void Main()
	{
		int n;
		int i;
		char[][] num = new char[3][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[0] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				num[1] = tempVar3.charAt(0);
			}
			minus(num[0], num[1]);
			System.out.printf("%s\n",a);
		}
	}
}

