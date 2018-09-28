package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[6]);
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		for (i = 0,k = 0;line.charAt(i) != '\0';i++)
		{
			k = k + 1;
		}
		for (j = k - 1;j >= 0;j--)
		{
			System.out.printf("%c",line.charAt(j));
		}
	}

}

