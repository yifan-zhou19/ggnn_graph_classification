package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] num = new int[130];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i;
		int j;
		int c = 0;
		for (i = 0;i < a.length();i++)
		{
			for (j = 'a';j <= 'z';j++)
			{
				if (a.charAt(i) == j)
				{
					num[j]++;
					c++;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 97;i <= 122;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",(char)i,num[i]);
			}
		}
		}
	}
}

