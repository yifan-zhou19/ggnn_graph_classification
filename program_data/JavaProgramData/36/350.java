package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(char s[]);
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int k = 0;
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
		sort(a);
		sort(b);
		for (i = 0;i < 20;i++)
		{
			if (a[i] != b[i])
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

	public static void sort(String s)
	{
		int i;
		int j;
		char t;
		for (i = 1; !s[i].equals('\0');i++)
		{
		for (j = 1; !s[j].equals('\0');j++)
		{
			if (s[j - 1].compareTo(s[j]) > 0)
			{
				t = s[j - 1];
				s[j - 1] = s[j];
				s[j] = t;
			}
		}
		}
	}
}

