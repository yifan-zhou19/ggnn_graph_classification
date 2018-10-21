package <missing>;

public class GlobalMembers
{
	public static void kjj(String a, int len)
	{
		int i;
		int j;
		char c;
		len = a.length();
		for (i = 1;i < len;i++)
		{
			for (j = 0;(j < len - i) && (!a[j].equals('\0'));j++)
			{
				if (a[j].compareTo(a[j + 1]) > 0)
				{
					c = a[j];
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}

	}

	public static void Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
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
		kjj(a, len1);
		kjj(b, len2);
		if (strcmp(a,b) == 0 && len1 == len2)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}

}

