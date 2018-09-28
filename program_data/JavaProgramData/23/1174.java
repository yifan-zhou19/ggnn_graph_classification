package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[50][100];
		char b;
		int i;
		int j = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
				b = System.in.read();
			if (b != ' ')
			{
				break;
			}
			j++;
		}
		for (i = j;i > 0;i--)
		{
			System.out.printf("%s ",str[i]);
		}
		System.out.printf("%s",str[0]);
	}
}

