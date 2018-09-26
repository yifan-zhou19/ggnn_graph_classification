package <missing>;

public class GlobalMembers
{
	public static int f(String str1, String str2)
	{
		String p;
		String q;
	int s;
	int[] a = new int[26];
	int[] b = new int[26];
	int i = 0;
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		for (p = str1;p < str1.length() + str1;p++)
		{
			for (i = 0;i < 26;i++)
			{
		if (p == i + 97)
		{
			a[i]++;
		}
			}
		}
		for (q = str2;q < str2.length() + str2;q++)
		{
			for (i = 0;i < 26;i++)
			{
			if (q == i + 97)
			{
				b[i]++;
			}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] != b[i])
			{
				break;
			}

		}
	if (i == 26)
	{
		System.out.print("YES");
	}
			else
			{
				System.out.print("NO");
			}


	}

	public static void Main()
	{
		String str1 = new String(new char[100]);
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
		f(str1, str2);


	}








}

