package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		char boy;
		char girl;
		int i;
		int k;
		int len;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		boy = a.charAt(0);
		len = a.length();
		for (i = 0;i < len;i++)
		{
			 if (a.charAt(i) != boy)
			 {
				girl = a.charAt(i);
				break;
			 }
		}

		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == girl)
			{
				for (k = i - 1;k >= 0;k--)
				{
					if (a.charAt(k) == ' ')
					{
						continue;
					}
					else if (a.charAt(k) == boy)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, k, ' ');
						System.out.printf("%d %d\n",k,i);
						break;
					}
				}
			}
		}
		return;
	}




}

