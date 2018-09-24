package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	int i;
	char[] n = {0, '\0', '\0', '\0', '\0'};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = tempVar.charAt(0);
	}
	for (i = 4;i >= 0;i--)
	{
	if (n[i] != '0' && n[i] != '\0')
	{
	System.out.printf("%c",n[i]);
	}
	}
	}

}

