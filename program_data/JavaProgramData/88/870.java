package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a;
	int i;
	int ok;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a = (String)malloc((Character.SIZE / Byte.SIZE) * 30);
	a = new Scanner(System.in).nextLine();
	for (i = 0;i < a.length();i++)
	{
	if (!(*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9'))
	{
		ok = 1;
		continue;
	}
	else
	{
	if (ok != 0)
	{
		System.out.print("\n");
	}
	ok = 0;
	System.out.printf("%c",*(a.Substring(i)));
	}
	}
	return 0;
	}


}
