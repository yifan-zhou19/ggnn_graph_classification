package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String max = new String(new char[100]);
		String min = new String(new char[100]);
		String result = new String(new char[100]);
		int n;
		int i;
		int a;
		int b;
		int j;
		int k;
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
				max = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				min = tempVar3.charAt(0);
			}
			a = max.length();
			b = min.length();
			k = 0;
			if (a == b)
			{
				for (j = (a - 1);j >= 0;j--)
				{
					max = tangible.StringFunctions.changeCharacter(max, j, max.charAt(j) - k);
					if (max.charAt(j) >= min.charAt(j))
					{
						result = tangible.StringFunctions.changeCharacter(result, j, max.charAt(j) - min.charAt(j) + 48);
						k = 0;
					}
					else
					{
						result = tangible.StringFunctions.changeCharacter(result, j, max.charAt(j) - min.charAt(j) + 58);
						k = 1;
					}
				}
			}
			else
			{
				min = tangible.StringFunctions.changeCharacter(min, a, '\0');
				for (j = 1;j <= b;j++)
				{
					min = tangible.StringFunctions.changeCharacter(min, a - j, min.charAt(b - j));
				}
				for (j = (a - b - 1);j >= 0;j--)
				{
					min = tangible.StringFunctions.changeCharacter(min, j, '0');
				}
				for (j = (a - 1);j >= 0;j--)
				{
					max = tangible.StringFunctions.changeCharacter(max, j, max.charAt(j) - k);
					if (max.charAt(j) >= min.charAt(j))
					{
						result = tangible.StringFunctions.changeCharacter(result, j, max.charAt(j) - min.charAt(j) + 48);
						k = 0;
					}
					else
					{
						result = tangible.StringFunctions.changeCharacter(result, j, max.charAt(j) - min.charAt(j) + 58);
						k = 1;
					}
				}
			}
			for (j = 0;j < a;j++)
			{
				if (result.charAt(j) != '0')
				{
					for (k = j;k < a;k++)
					{
						System.out.printf("%c",result.charAt(k));
					}
					System.out.print("\n");
				}
				break;
			}

		}
	}
}

