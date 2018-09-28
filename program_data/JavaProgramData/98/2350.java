package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[1000][100];
		int n;
		int i;
		int j = 0;
		int k = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			if (String.valueOf(a[i]).length() + 1 > 80 - j)
			{
				System.out.print("\n");
				j = 0;
				k++;
			}
			if (j != 0)
			{
				System.out.print(" ");
				j++;
			}
			System.out.printf("%s",a[i]);
			j += String.valueOf(a[i]).length();
		}
	}


}

