package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		String str = new String(new char[301]);
		int i;
		int len;
		int no = 1;
		int[] counter = new int[26];
		/* ????? */
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		/* ???????? */
		len = str.length();
		/* ????????????? */
		for (i = 0; i < len; i++)
		{
			ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
				counter[ch - 'a']++;
				no = 0;
			}
		}
		/* ???????? */
		for (ch = 'a'; ch <= 'z'; ch++)
		{
			if (counter[ch - 'a'] > 0)
			{
				System.out.printf("%c=%d\n", ch, counter[ch - 'a']);
			}
		}
		/* ??????????o */
		if (no != 0)
		{
			System.out.print("No");
		}
		return 0;
	}

	/* ???????? */


	public static int main_h5_1_ptr()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[301]);
		int i;
		int no = 1;
		int[] counter = new int[26];
		/* ????? */
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		/* ????????????? */
		for (p = str; * p; p++)
		{
			if (*p >= 'a' && *p <= 'z')
			{
				counter[*p - 'a']++;
				no = 0;
			}
		}
		/* ??????????o */
		if (no != 0)
		{
			System.out.print("No");
		}
		/* ??????????? */
		else
		{
			for (i = 0; i < 26; i++)
			{
			if (counter[i] > 0)
			{
				System.out.printf("%c=%d\n", 'a' + i, counter[i]);
			}
			}
		}
		return 0;
	}

}

