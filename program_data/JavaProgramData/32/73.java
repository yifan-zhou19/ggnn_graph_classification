package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int count;
		int k;
		int i;
		int j;
		int l1;
		int l2;
		int m;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			count = 0;
			l1 = str1.length();
			l2 = str2.length();
			j = l1 - 1;
			for (k = l2 - 1;k >= 0;k--)
			{
				if (str1.charAt(j) >= str2.charAt(k))
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j) - str2.charAt(k) + 48);
				}
				else
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str1.charAt(j) + 58 - str2.charAt(k));
					for (m = j - 1;m >= 0;m--)
					{
						if (str1.charAt(m) != '0')
						{
							str1.charAt(m)--;
							break;
						}
						else
						{
						   str1 = tangible.StringFunctions.changeCharacter(str1, m, '9');
						}
					}
				}
				j--;
			}
		   for (k = 0;str1.charAt(k) != '\0';k++)
		   {
			   if (str1.charAt(k) == '0')
			   {
				   count++;
			   }
						 else
						 {
						   break;
						 }
		   }
		   for (k = count;str1.charAt(k) != '\0';k++)
		   {
			   System.out.printf("%c",str1.charAt(k));
		   }
		   System.out.print("\n");
		}
	}



}

