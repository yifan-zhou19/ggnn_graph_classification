package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int[] Main_a = new int[100];
	public static int Main()
	{
	String ch = new String(new char[301]);
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//static int a[100];
	int i;
	int j;
	int flag;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ch = tempVar.charAt(0);
	}
	for (i = 0;i < ch.length();i++)
	{
	if (ch.charAt(i) >= 97 && ch.charAt(i) <= 'z')
	{
	Main_a[ch.charAt(i) - 97] = Main_a[ch.charAt(i) - 97] + 1;
	}
	}
		flag = 0;
	for (i = 0;i < 26;i++)
	{

	if (Main_a[i] != 0)
	{
		flag = 1;
	System.out.printf("%c=%d\n",i + 97,Main_a[i]);
	}
	}
	if (flag == 0)
	{
		System.out.print("No");
	}
	}
}

