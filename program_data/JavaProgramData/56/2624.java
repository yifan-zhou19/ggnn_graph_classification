package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < 6;i++)
		{
			if (a[5 - i] != null)
			{
				System.out.printf("%c",a[5 - i]);
			}
		}
	}

}

