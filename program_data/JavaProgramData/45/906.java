package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int a;
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		j = 0;
		k = 0;
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
		for (i = 0;i < 50;j++)
		{
			if (str1.charAt(i) == str2.charAt(j))
			{
				i++;
				k++;
			}
			if ((str1.charAt(i) != '\0') && (str1.charAt(i) != str2.charAt(j + 1)))
			{
				k = 0;
				i = 0;
			}
			if (str1.charAt(i) == '\0')
			{
				break;
			}

		}
		a = j - k + 1;
	System.out.printf("%d\n",a);
			return 0;
	}
}

