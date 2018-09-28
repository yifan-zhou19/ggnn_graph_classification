package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int length1;
		int length2;
		int cha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String beijianshu = new String(new char[101]);
		String jianshu = new String(new char[101]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				beijianshu = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				jianshu = tempVar3.charAt(0);
			}
			length1 = beijianshu.length();
			length2 = jianshu.length();
			for (j = 1;j <= length2;j++)
			{
				cha = beijianshu.charAt(length1 - j) - jianshu.charAt(length2 - j);
				if (cha >= 0)
				{
					beijianshu = tangible.StringFunctions.changeCharacter(beijianshu, length1 - j, cha + '0');
				}
				else
				{
					beijianshu.charAt(length1 - j - 1)--;
					beijianshu = tangible.StringFunctions.changeCharacter(beijianshu, length1 - j, 10 + cha + '0');
				}
			}
			while (beijianshu.charAt(length1 - j) < '0')
			{
				beijianshu.charAt(length1 - j) += 10;
				j++;
				beijianshu.charAt(length1 - j) -= 1;
			}

			System.out.printf("%s\n",beijianshu);
		}

	}
}

