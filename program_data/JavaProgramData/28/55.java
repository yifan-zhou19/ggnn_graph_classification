package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[300][50];
		char c;
		int i = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i++] = tempVar.charAt(0);
		}
		while ((c = System.in.read()) != '\n')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i++] = tempVar2.charAt(0);
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d",String.valueOf(a[j]).length());
			if (j != i - 1)
			{
				System.out.print(",");
			}
		}
	}
}

