package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int mas = char str[10];

		int i;
		int length;
		int k;
		String str = new String(new char[11]);
		String substr = new String(new char[3]);
		String strs = new String(new char[13]);
		String strw = new String(new char[11]);

		do
		{
		strw = str;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		length = str.length();
		if (strcmp(strw,str) == 0)
		{
			break;
		}

		k = mas(str);
		for (i = 0;i < k;i++)
		{
			strs = tangible.StringFunctions.changeCharacter(strs, i, str.charAt(i));
		}
		for (i = 0;i < 3;i++)
		{
			strs = tangible.StringFunctions.changeCharacter(strs, k + i, substr.charAt(i));
		}
		for (i = 0;i < length - k;i++)
		{
			strs = tangible.StringFunctions.changeCharacter(strs, k + 3 + i, str.charAt(k + i));
		}
		for (i = 0;i < length + 2;i++)
		{
			System.out.printf("%c",strs.charAt(i));
		}
		System.out.printf("%c\n",strs.charAt(length + 2));
		}while (str.length() < 11);
		//while(str[0]!='\0');

	}
	public static int mas(String stra)
	{
		int i;
		int k = 0;
		int j;
		int length;
		int m = 0;
		 length = stra.length();
		for (i = 0;i < length;i++)
		{
			m = 0;
			for (j = 0;j < length;j++)
			{
				if (stra[i].compareTo(stra[j]) < 0)
				{
					m++;
				}
			}
				if (m == 0)
				{
					k = i + 1;
				break;
				}


		}
		 return (k);
	}

}

