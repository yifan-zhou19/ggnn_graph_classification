package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char temp;
		int i;
		int j;
		int l;
		int k;
		int m;
		int num;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
					  k = 0;
			l = str.length();
			if (str.charAt(0) == '-')
			{
				k = 1;
				l++;
				System.out.printf("%c",str.charAt(0));


			}
			for (j = k;j < l / 2;j++)
			{
				temp = str.charAt(j);
				str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(l - 1 - j));
				str = tangible.StringFunctions.changeCharacter(str, l - 1 - j, temp);
			}


			num = str.charAt(k) - '0';
			if (k != 0)
			{
					  for (j = k + 1;j < l - 1;j++)
					  {
						num = num * 10 + str.charAt(j) - '0';
					  }
					  System.out.printf("%d\n",num);
			}
			else
			{
					for (j = k + 1;j < l;j++)
					{
						num = num * 10 + str.charAt(j) - '0';
					}
					  System.out.printf("%d\n",num);
			}
		}
	}


}

