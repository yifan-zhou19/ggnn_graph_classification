package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String string;
	String str = new String(new char[20]);
	char c;
	int i;
	int l;
	int j = 0;
	int k = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	string = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	str = (char[20])calloc(1000,20 * (Integer.SIZE / Byte.SIZE));
	String = new Scanner(System.in).nextLine();
	for (i = 0;(c = (string.Substring(i))) != '\0';i++)
	{
		if (c != ' ')
		{
		*(*(str.Substring(k)) + j) = c;
		j++;
		}
	else
	{
		k++;
		j = 0;
	}
	}
	for (l = k;l > 0;l--)
	{
	System.out.printf("%s ",*(str.Substring(l)));
	}
	System.out.printf("%s",*(str));



	}
}
