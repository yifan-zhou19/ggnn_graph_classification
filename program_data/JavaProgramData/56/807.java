package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[7]);
		String b = new String(new char[7]);
		int j;
		int i;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < 7;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				n++;
			}
		}
	for (i = n - 1;i >= 0;i--)
	{
			System.out.printf("%c",a.charAt(i));
	}
	}
}

