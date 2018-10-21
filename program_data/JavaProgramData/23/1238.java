package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int i = 0;
		int j;
		int k;
		int t;
		char[][] str = new char[30][30];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			i++;
		}while ((c = System.in.read()) != '\n');
		t = i;
		System.out.printf("%s",str[t - 1]);
		for (i = t - 2;i >= 0;i--)
		{
		System.out.printf(" %s",str[i]);
		}
	}

}

