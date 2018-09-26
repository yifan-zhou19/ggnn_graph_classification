package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int len_1;
		int len_2;
		int j;
		int k;
		int temp;
		String str = new String(new char[50]);
		String str1 = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		len_1 = str.length();
		len_2 = str1.length();
		for (j = 0;j <= (len_2 - len_1);j++)
		{
				temp = j;
				for (k = 0;k < len_1;k++)
				{
					if (str.charAt(k) == str1.charAt(j + k))
					{
					}
					else
					{
					   break;
					}
				}
				if (k >= len_1)
				{
					System.out.printf("%d\n",temp);
					break;
				}
		}
	}
}

