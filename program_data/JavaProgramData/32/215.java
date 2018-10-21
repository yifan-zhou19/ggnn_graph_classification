package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String bjs = new String(new char[200]);
		String js = new String(new char[200]);
		int i;
		int j;
		int k;
		int l;
		int count;
		int n;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (strcmp(bjs,js) != 0)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bjs = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				js = tempVar3.charAt(0);
			}
			c = bjs.length() - js.length();
			for (j = js.length() - 1;j >= 0;j--)
			{
				if (bjs.charAt(c + j) < js.charAt(j))
				{
					for (k = 1;;k++)
					{
						if (bjs.charAt(c + j - k) > 48)
						{
							break;
						}
					}
					bjs.charAt(c + j - k) -= 1;
					for (l = 1;l < k;l++)
					{
						bjs = tangible.StringFunctions.changeCharacter(bjs, c + j - l, 57);
					}
					bjs = tangible.StringFunctions.changeCharacter(bjs, c + j, 58 + bjs.charAt(c + j) - js.charAt(j));
				}
				else
				{
					bjs = tangible.StringFunctions.changeCharacter(bjs, c + j, bjs.charAt(c + j) - js.charAt(j) + 48);
				}
			}
			for (j = 0;;j++)
			{
				if (bjs.charAt(j) != 48)
				{
					break;
				}
			}
			for (k = j;k < bjs.length();k++)
			{
				System.out.printf("%c",bjs.charAt(k));
			}
			System.out.print(10);
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

