package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[400]);
		int[] b = new int[400];
		int n;
		int m;
		int i;
		int j;
		int k;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				b[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			}
			if (a.charAt(i) != ',')
			{
				break;
			}
		}
		for (j = 1;j <= i;j++)
		{
			for (k = 1;k <= i - j;k++)
			{
				if (b[k] <= b[k + 1])
				{
					m = b[k];
					b[k] = b[k + 1];
					b[k + 1] = m;
				}
			}
		}
		for (j = 2;j <= i;j++)
		{
			if (b[j] < b[1])
			{
				System.out.printf("%d",b[j]);
				break;
			}
		}
			 if (j == i + 1)
			 {
				 System.out.print("No");
			 }
	}
}

