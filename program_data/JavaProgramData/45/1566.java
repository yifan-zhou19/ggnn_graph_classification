package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		char a;
		char b;
		int i;
		int j;
		int n;
		int l1;
		int l2;
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		l1 = str1.length();
		l2 = str2.length();
		for (i = 0;((a = str1.charAt(i)) != '\0');i++)
		{
			for (;((b = str2.charAt(j)) != '\0');j++)
			{
				if (a == b)
				{
					j = j + 1;
					break;
				};
			}
		}
		System.out.printf("%d\n",j - l1);
	}

}

