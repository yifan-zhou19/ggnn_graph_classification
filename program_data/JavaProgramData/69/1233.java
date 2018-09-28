package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		String str1 = new String(new char[250]);
		String str2 = new String(new char[250]);
		String str3 = new String(new char[250]);
		String str = new String(new char[250]);
		String str4 = new String(new char[250]);
		String str5 = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		a = str1.length();
		b = str2.length();
		if (str1.charAt(0) == 48)
		{
			for (int i = 0;i < a;i++)
			{
				if (str1.charAt(i) != '0')
				{
					c = i;
	//				printf("%d\n",c);
					break;
				}
			}
			for (int i = 0;i < (a - c);i++)
			{
				str4 = tangible.StringFunctions.changeCharacter(str4, i, str1.charAt(i + c));
			}
			for (int i = 0;i < (a - c);i++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str4.charAt(i));
			}
			str1 = tangible.StringFunctions.changeCharacter(str1, a - c, '\0');
			a = a - c;
		}
		if (str2.charAt(0) == 48)
		{
			for (int i = 0;i < b;i++)
			{
				if (str2.charAt(i) != '0')
				{
					c = i;
					break;
				}
			}
			for (int i = 0;i < (b - c);i++)
			{
				str5 = tangible.StringFunctions.changeCharacter(str5, i, str2.charAt(i + c));
			}
			for (int i = 0;i < (b - c);i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str5.charAt(i));
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, b - c, '\0');
			b = b - c;
		}
	//	printf("%s %s\n",str1,str2);
		if (a >= b)
		{
			for (int i = 0;i < b;i++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, i + a - b, str2.charAt(i));
			}
			for (int i = 0;i < a;i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, '0');
			}
			for (int i = 0;i < b;i++)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i + a - b, str3.charAt(i + a - b));
			}
	//		printf("%s\n",str2);	    
		}
		else
		{
			for (int i = 0;i < a;i++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, i + b - a, str1.charAt(i));
			}
			for (int i = 0;i < b;i++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, '0');
			}
			for (int i = 0;i < a;i++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i + b - a, str3.charAt(i + b - a));
			}
	//		printf("%s\n",str1);		
		}
		if (a <= b)
		{
		a = b;
		}
		for (int i = 0;i < a;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, str1.charAt(i) + str2.charAt(i) - 48);
		}
	 //   printf("%d,%d,%d\n",str1[0],str2[0],str[0]);
	//	printf("%d\n",a-1);
	//	printf("%d,%d,%d,%d\n",str[3],str[2],str1[2],str2[2]);	
		for (int i = a - 1;i > 0;i = i - 1)
		{
			if (str.charAt(i) >= 58)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 10);
				str = tangible.StringFunctions.changeCharacter(str, i - 1, str.charAt(i - 1) + 1);
	//			printf("%d,%d\n",str[i],str[i-1]);
			}
		}
		str = tangible.StringFunctions.changeCharacter(str, a, '\0');
		if (str.charAt(0) >= ('0' + 10))
		{
			str = tangible.StringFunctions.changeCharacter(str, 0, str.charAt(0) - 10);
			System.out.printf("1%s\n",str);
	//		printf("%s\n",str);
		}

		else
		{
		System.out.printf("%s",str);
		}
	}
}

