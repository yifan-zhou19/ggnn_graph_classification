package <missing>;

public class GlobalMembers
{
	public static void pause()
	{
		int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	}

	public static void find_huiwen(tangible.RefObject<String> str, int len, int n)
	{
		void reverse(char * huiwen,char * rev,int geshu);
	String huiwen;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	huiwen = (String)malloc((len + 1) * (Character.SIZE / Byte.SIZE));
	String rev;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	rev = (String)malloc((len + 1) * (Character.SIZE / Byte.SIZE));

	int i;
	int j;

	for (i = 0;i <= n - len;i++)
	{
			for (j = 0;j <= len - 1;j++)
			{
				huiwen = tangible.StringFunctions.changeCharacter(huiwen, j, *(str.argValue.Substring(i) + j));
			}
		huiwen = tangible.StringFunctions.changeCharacter(huiwen, len, '\0');
	tangible.RefObject<String> tempRef_huiwen = new tangible.RefObject<String>(huiwen);
	tangible.RefObject<String> tempRef_rev = new tangible.RefObject<String>(rev);
		reverse(tempRef_huiwen, tempRef_rev, len); //rev???
		rev = tempRef_rev.argValue;
		huiwen = tempRef_huiwen.argValue;
		if (strcmp(rev,huiwen) == 0)
		{
		System.out.printf("%s\n",huiwen);
		}
	}
	}
	public static void reverse(tangible.RefObject<String> huiwen, tangible.RefObject<String> rev, int geshu)
	{
	int j;
	for (j = 0;j <= geshu;j++)
	{
		rev.argValue.charAt(j) = huiwen.argValue.charAt(geshu - 1 - j);
	}
	rev.argValue.charAt(geshu) = '\0';
	}

	public static int Main()
	{ //void pause();
	String str = new String(new char[500]);
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	n = str.length();
	//???????
	int i;

	for (i = 2;i <= n;i++)
	{
	tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		find_huiwen(tempRef_str, i, n);
		str = tempRef_str.argValue;
	}


	pause();
		return 0;
	}

}

