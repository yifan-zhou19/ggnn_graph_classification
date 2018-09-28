package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)

	{
		String a = new String(new char[6]);
		String b = new String(new char[6]);
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0; * (a.Substring(i)) != '\0';i++)
		{
			*(b.Substring(i)) = *(a.Substring(i));
		}
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%c",b.charAt(j));
		}

	}
}

