package <missing>;

public class GlobalMembers
{
	public static void sort(String str)
	{
		int i;
		int j;
		int k;
		int len;
		len = str.length();
		char t;
		for (i = 0;i < len - 1;i++)
		{
			k = i;
			for (j = i + 1;j < len;j++)
			{
				if (str[j].compareTo(str[k]) > 0)
				{
					k = j;
				}
			}
				if (k != i)
				{
					t = str[i];
					str[i] = str[k];
					str[k] = t;
				}
		}
	}
	public static void output(String str1, String str2)
	{
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
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
		sort(str1);
		sort(str2);
		output(str1, str2);
	}
}

