package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[105]);
		String = new Scanner(System.in).nextLine();
		int l;
		int i;
		int j;
		l = String.length();
		for (i = 0;i < l;i++)
		{
			if (String[i] == ' ' && string.charAt(i + 1) == ' ')
			{
				for (j = i;j < l;j++)
				{
					String[j] = string.charAt(j + 1);
				}
				i = i - 1;
			}
		}
		System.out.printf("%s",String);
		System.in.read();
		System.in.read();
	}


}
