package <missing>;

public class GlobalMembers
{
	public static void order(String ch, int len)
	{
		int i;
		char temp;
		if (len == 1)
		{
			;
		}
		else
		{
			for (i = 0;i < len - 1;i++)
			{
				if (ch[i].compareTo(ch[i + 1]) > 0)
				{
					temp = ch[i];
					ch[i] = ch[i + 1];
					ch[i + 1] = temp;
				}
			}
			order(ch, len - 1);
		}
	}
	public static int Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			ch2 = tempVar2.charAt(0);
		}
		len1 = ch1.length();
		len2 = ch2.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
			order(ch1, len1);
			order(ch2, len1);
			if (strcmp(ch1,ch2) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

