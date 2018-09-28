package <missing>;

public class GlobalMembers
{
	public static void change(String aa)
	{
		int len;
		int i;
		int j;
		char cha;
		len = aa.length();
		for (i = 0;i < len - 1;i++)
		{
			for (j = len - 2;j >= i;j--)
			{
				if (aa[j].compareTo(aa[j + 1]) > 0)
				{
					cha = aa[j];
					aa[j] = aa[j + 1];
					aa[j + 1] = cha;
				}
			}
		}
	}

	public static void Main()
	{
		int i;
		int j;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
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
		change(a);
		change(b);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

