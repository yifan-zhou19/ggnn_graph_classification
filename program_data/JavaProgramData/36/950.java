package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] c = new int[100];
		int flag = 0;
		int j;
		int i;
		int end = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() == b.length())
		{
		for (i = 0;i < a.length();i++)
		{
			flag = 0;
			for (j = 0;j < b.length();j++)
			{
				if (a.charAt(i) == b.charAt(j) && c[j] == 0)
				{
					c[j] = 1;
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				end = 0;
				break;
			}
		}
		}
		else
		{
			end = 0;
		}
		if (end == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
		return 0;
	}
}

