package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void swap(char str[]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("NO");
		}
		else
		{
			swap(a);
			swap(b);
			if (strcmp(a,b) == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}

	public static void swap(String str)
	{
		int length;
		int i;
		int j;
		char t;
		length = str.length();
		for (i = 0;i < length - 1;i++)
		{
			for (j = 0;j < length - 1 - i;j++)
			{
				if (str[j + 1].compareTo(str[j]) > 0)
				{
					t = str[j];
					str[j] = str[j + 1];
					str[j + 1] = t;
				}
			}
		}
	}
}

