package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[16]);
		String substr = new String(new char[4]);
		String output = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * string;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * max;
		int i;
		int j;
		while ((scanf("%s",str)) != EOF)
		{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			substr = tempVar.charAt(0);
		}
		string = str;
		max = str;
		for (i = 0;i < (str.length());i++)
		{
			if (*string > *max)
			{
				max = String;
			}
			string++;
		}
		string = str;
		for (i = 0;(*string) != (*max);string++,i++)
		{
		output = tangible.StringFunctions.changeCharacter(output, i, *string);
		}
		output = tangible.StringFunctions.changeCharacter(output, i, *max);
		max++;
		for (j = i + 1;j <= (3 + i);j++)
		{
			output = tangible.StringFunctions.changeCharacter(output, j, substr.charAt(j - i - 1));
		}
		for (;j < (str.length() + substr.length());j++,i++)
		{
			output = tangible.StringFunctions.changeCharacter(output, j, str.charAt(i + 1));
		}
		for (i = 0;i < (str.length() + substr.length());i++)
		{
		System.out.printf("%c",output.charAt(i));
		}
		System.out.print("\n");
		}
	}





}

