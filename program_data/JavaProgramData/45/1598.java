package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[10]);
		int i;
		int a;
		int b;
		int j;
		b = -1;
		a = 0;
		String str2 = new String(new char[100]);
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
		for (i = 0;i < 10;i++)
		{
			if (str1.charAt(i) != '\0')
			{
				a++;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < 100;i++)
		{
			if (str2.charAt(i) == str1.charAt(0))
			{
				for (j = 0;j < a;j++)
				{
				if (str2.charAt(i + j) != str1.charAt(j))
				{
					break;
				}
				if (j == a - 1)
				{
				b = i;
				}
				}
			}
			if (b != -1)
			{
				System.out.printf("%d",b);
				break;
			}
		}
	}

}

