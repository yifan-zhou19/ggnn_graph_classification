package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][1000];
		char p;
		int i = 0;
		int count;
		do
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				p = tempVar2.charAt(0);
			}
		}while (p != '\n');
		count = i;
		for (i = count;i >= 2;i--)
		{
			System.out.printf("%s ",a[i]);
		}
		System.out.printf("%s",a[1]);
	}
}

