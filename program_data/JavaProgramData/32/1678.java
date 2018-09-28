package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[101][101];
		int[] len1 = new int[101];
		int len2;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		String str3 = new String(new char[101]);
		String Tempstr2 = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			if (j != n - 1)
			{
				str3 = new Scanner(System.in).nextLine();
			}
			len1[j] = str1.length();
			len2 = str2.length();
			for (i = 0;i < len1[j] - len2;i++)
			{
				Tempstr2 = tangible.StringFunctions.changeCharacter(Tempstr2, i, '0');
			}
			for (;i < len1[j];i++)
			{
				Tempstr2 = tangible.StringFunctions.changeCharacter(Tempstr2, i, str2.charAt(i - (len1[j] - len2)));
			}
			for (i = 0;i < len1[j];i++)
			{
				a[j][i] = str1.charAt(i) - Tempstr2.charAt(i);
			}
			for (i = len1[j] - 1;i >= 0;i--)
			{
				if (a[j][i] < 0)
				{
					a[j][i] += 10;
					a[j][i - 1] -= 1;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < len1[j];i++)
			{
				if (a[j][i] != 0)
				{
					break;
				}
			}
			for (;i < len1[j];i++)
			{
				System.out.printf("%d",a[j][i]);
			}
			System.out.print("\n");
		}
	}
}

