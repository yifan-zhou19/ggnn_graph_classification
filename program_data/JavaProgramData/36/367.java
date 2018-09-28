package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String a1 = new String(new char[100]);
		String a2 = new String(new char[100]);
		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int i;
		int j;
		int n1;
		int n2;
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
		n1 = str1.length();
		n2 = str2.length();
		for (i = 0;i < n1;i++)
		{
			a1 = tangible.StringFunctions.changeCharacter(a1, i, str1.charAt(i));
		}
		for (i = 0;i < n2;i++)
		{
			a2 = tangible.StringFunctions.changeCharacter(a2, i, str2.charAt(i));
		}
		for (i = 0;i < 100;i++)
		{
			num1[i] = 0;
			num2[i] = 0;
		}
		if (n1 != n2)
		{
			System.out.print("NO");
		}
		else
		{
			if (n1 == n2)
			{
				for (i = 0;i < n1;i++)
				{
					for (j = 0;j < n1;j++)
					{
						if (a1.charAt(i) == a1.charAt(j))
						{
							num1[i] = num1[i] + 1;
						}
					}
					for (j = 0;j < n1;j++)
					{
						if (a1.charAt(i) == a2.charAt(j))
						{
							num2[i] = num2[i] + 1;
						}
					}
				}
				for (i = 0;i < n1;i++)
				{
					if (num1[i] != num2[i])
					{
						break;
					}
				}
				if (i >= n1)
				{
					System.out.print("YES");
				}
				else
				{
					if (i < n1)
					{
					System.out.print("NO");
					}
				}
			}
		}
	}
}

