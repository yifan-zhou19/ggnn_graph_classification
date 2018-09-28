package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String numA = new String(new char[MAXN]);
		String numB = new String(new char[MAXN]);
		String ans = new String(new char[MAXN]);
		char c;
		int maxLen;
		int i;
		int aLen;
		int bLen;
		int cx;
		int ax;
		int j;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			numA = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			numB = tempVar2.charAt(0);
		}
		aLen = numA.length();
		bLen = numB.length();
		for (i = 0;i != aLen / 2; i++)
		{
			c = numA.charAt(i);
			numA = tangible.StringFunctions.changeCharacter(numA, i, numA.charAt(aLen - 1 - i));
			numA = tangible.StringFunctions.changeCharacter(numA, aLen - 1 - i, c);
		}
		for (i = 0;i != bLen / 2; i++)
		{
			c = numB.charAt(i);
			numB = tangible.StringFunctions.changeCharacter(numB, i, numB.charAt(bLen - 1 - i));
			numB = tangible.StringFunctions.changeCharacter(numB, bLen - 1 - i, c);
		}
		cx = 0;
		maxLen = aLen > bLen != 0 ? aLen : bLen;
		for (i = 0;i != maxLen;i++)
		{
			if (i < aLen && i < bLen)
			{
				ax = (numA.charAt(i) - '0') + (numB.charAt(i) - '0') + cx;
				ans = tangible.StringFunctions.changeCharacter(ans, i, (ax % 10) + '0');
				if (ax >= 10)
				{
					cx = 1;
				}
				else
				{
					cx = 0;
				}
			}
			else if (i >= bLen)
			{
				ax = (numA.charAt(i) - '0') + cx;
				ans = tangible.StringFunctions.changeCharacter(ans, i, (ax % 10) + '0');
				if (ax >= 10)
				{
					cx = 1;
				}
				else
				{
					cx = 0;
				}
			}
			else if (i >= aLen)
			{
				ax = (numB.charAt(i) - '0') + cx;
				ans = tangible.StringFunctions.changeCharacter(ans, i, (ax % 10) + '0');
				if (ax >= 10)
				{
					cx = 1;
				}
				else
				{
					cx = 0;
				}
			}
		}
		if (cx != 0)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i++, cx + '0');
		}
		flag = 0;
		for (j = i - 1;j >= 0;j--)
		{
			if (ans.charAt(j) != '0')
			{
			  flag = 1;
			}
			  if (flag == 1)
			  {
			   System.out.printf("%c",ans.charAt(j));
			  }
			   if (flag == 0 && j == 0)
			   {
				 System.out.print("0");
			   }
		}
		return 0;
	}

}

