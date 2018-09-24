package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string1 = new String(new char[250]);
		String string2 = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			string1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			string2 = tempVar2.charAt(0);
		}
		int a;
		int b;
		a = string1.length();
		b = string2.length();
		int c;
		c = a > b != 0?a:b;
		int[] string3 = new int[250];
		int[] string4 = new int[250];
		int i;
		for (i = 0;i < a;i++)
		{
			string3[i] = string1.charAt(a - i - 1) - 48;
		}
		for (i = 0;i < b;i++)
		{
			string4[i] = string2.charAt(b - i - 1) - 48;
		}
		if (a > b)
		{
			for (i = b;i < a;i++)
			{
				string4[i] = 0;
			}
		}
		if (a < b)
		{
			for (i = a;i < b;i++)
			{
				string3[i] = 0;
			}
		}


		int[] string5 = new int[250];
		int[] string6 = new int[250];
		for (i = 0;i <= c;i++)
		{
			string5[i] = 0;
		}
		for (i = 0;i < c;i++)
		{
			string6[i] = string3[i] + string4[i] + string5[i];
			if (string6[i] > 9)
			{
				string6[i] -= 10;
				string5[i + 1] = 1;
			}
		}
		if (string5[c] != 0)
		{
			System.out.printf("%d",string5[c]);
			for (i = c - 1;i >= 0;i--)
			{
			System.out.printf("%d",string6[i]);
			}
			System.out.print("\n");
		}
		else
		{
			for (i = c - 1;i >= 0;i--)
			{
				if (string6[i] != 0)
				{
					break;
				}
			}
			int m;
			for (m = i;m >= 0;m--)
			{
			System.out.printf("%d",string6[m]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

