package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] word = new char[300][50];
		char c = ' ';
		int[] num = new int[300];
		int i;
		int t;
		for (i = 1;c == ' ';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
			c = System.in.read();
			num[i] = String.valueOf(word[i]).length();
			t = i;
		}
		for (i = 1;i < t;i++)
		{
			System.out.printf("%d,",num[i]);
		}
			System.out.printf("%d",num[t]);


	}
}

