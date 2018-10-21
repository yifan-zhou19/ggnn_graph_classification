package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char c = ' ';
	String str1;
	String str2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	str1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	str2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));

	char[][] str = new char[100][100];
	int i;
	int n = 0;
	for (i = 0;i < 100;i++)
	{
		str[i] = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str[i] = tempVar.charAt(0);
		}
		if (c = System.in.read() != ' ')
		{
			break;
		}
		n++;
	}
	str1 = "\0";
	str2 = "\0";
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

	for (i = 0;i <= n;i++)
	{
		if (strcmp(str1,str[i]) == 0)
		{
			str[i] = str2;
		}
	}
	for (i = 0;i <= n - 1;i++)
	{
	System.out.printf("%s ",str[i]);
	}
	System.out.printf("%s",str[n]);

	}
}

