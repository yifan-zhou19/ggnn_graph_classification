package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int t;
		int count = 0;
		int num1;
		int num2;
		String a = new String(new char[1000]);
		String b = new String(new char[1100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		while (a.charAt(i) != '\0')
		{
			i++;
		}
		num1 = i;
		i = 0;
		while (b.charAt(i) != '\0')
		{
			i++;
		}
		num2 = i;
		i = 0;
		if (num1 != num2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 1;i <= num1;i++)
			{
				for (j = 0;j < num1 - i;j++)
				{
					if (a.charAt(j) > a.charAt(j + 1))
					{
						t = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						a = tangible.StringFunctions.changeCharacter(a, j + 1, t);
					}
					if (b.charAt(j) > b.charAt(j + 1))
					{
						t = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
						b = tangible.StringFunctions.changeCharacter(b, j + 1, t);
					}
				}
			}
			for (i = 0;i < num1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					count++;
				}
			}
			if (count == num1)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}
}

