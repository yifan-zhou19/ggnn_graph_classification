package <missing>;

public class GlobalMembers
{
	//551-????
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int t;
		int m;
		int n;
		int s;
		int temp = 0;
		final String p = "\0"; //p[20]??????????q[20]?????????
		final String q = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		System.in.read(); //??????????????
		for (i = 0;i < 20;i++) //???????????????????????
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				p = tangible.StringFunctions.changeCharacter(p, i, tempVar2);
			}
			if (p.charAt(i) == ' ')
			{
				break;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (j = 0;j < i;j++)
		{
			if (p.charAt(j) >= 48 && p.charAt(j) <= 57)
			{
				t = p.charAt(j) - 48;
			}
			else if (p.charAt(j) >= 65 && p.charAt(j) <= 90)
			{
				t = p.charAt(j) - 55;
			}
			else if (p.charAt(j) >= 97 && p.charAt(j) <= 122)
			{
				t = p.charAt(j) - 87;
			}
			if (j == i - 1)
			{
				temp += t;
			}
			else
			{
				for (m = 1;m < i - j;m++)
				{
					t = t * a;
				}
				temp += t;
			}
		}
		s = 0;
		if (temp > b)
		{
			for (s = 0;s < 20;s++)
			{
				n = temp % b;
				if (n <= 9)
				{
					q = tangible.StringFunctions.changeCharacter(q, s, n + 48);
				}
				else
				{
					q = tangible.StringFunctions.changeCharacter(q, s, n + 55);
				}
				temp = temp / b;
				if (temp == 0)
				{
					break;
				}
			}
			for (j = s;j >= 0;j--)
			{
				System.out.printf("%c",q.charAt(j));
			}
			System.out.print("\n");
		}
		else
		{
			System.out.printf("%d",temp);
		}
		return 0;
	}




}

