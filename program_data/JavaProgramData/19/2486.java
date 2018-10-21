package <missing>;

public class GlobalMembers
{
	public static int split(tangible.RefObject<String> string, String[] word) //???word[][n]??n??????????sp[50][n]???????
	{ //???????????
		final String seps = " ,\t\n."; //????????????????????
		String token;
		int wordNum = 0;
		token = tangible.StringFunctions.strTok(String,seps);
		while (token != null)
		{
			word[wordNum++] = token;
			token = tangible.StringFunctions.strTok(null,seps);
		}
		return wordNum;
	}
	public static int Main()
	{
		String string = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] sp = new char[50][100];
		int i;
		int j;
		int num;
		int[] count = new int[50];
		String = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_String = new tangible.RefObject<String>(String);
		num = split(tempRef_String, sp);
		String = tempRef_String.argValue;
		for (i = 0;i < num;i++)
		{
			if (strcmp(sp[i],a) == 0)
			{

				sp[i] = b;
			}
			else
			{
				continue;
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			System.out.printf("%s ",sp[i]);
		}
		System.out.printf("%s",sp[num - 1]);
		return 0;

	}

}

