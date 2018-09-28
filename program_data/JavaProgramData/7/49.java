package <missing>;

public class GlobalMembers
{
	public static int[] f = new int[MAX_LEN];

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 't', so pointers on this parameter are left unchanged:
	public static int kmp(char * p, char * t)
	{
		int cur_p = 0;
		int cur_t = 0;
		int len_p = p.length();
		int len_t = t.length();
		while (cur_p < len_p && cur_t < len_t)
		{
			if (p.charAt(cur_p) == t.charAt(cur_t))
			{
				cur_p++;
				cur_t++;
			}
			else
			{
				if (cur_p == 0)
				{
					cur_t++;
				}
				else
				{
					cur_p = f[cur_p - 1] + 1;
				}
			}
		}
		if (cur_p == len_p)
		{
			return cur_t - len_p;
		}
		else
		{
			return -1;
		}
	}

	public static void fail(tangible.RefObject<String> p)
	{
		int len_p = p.argValue.length();
		f[0] = -1;
		for (int i = 1; i < len_p; i++)
		{
			int j = f[i - 1];
			while (p.argValue.charAt(i) != p.argValue.charAt(j + 1) && j >= 0)
			{
				j = f[j];
			}
			if (p.argValue.charAt(i) == p.argValue.charAt(j + 1))
			{
				f[i] = j + 1;
			}
			else
			{
				f[i] = -1;
			}
		}
	}

	public static int Main()
	{
		String string = new String(new char[257]);
		String subString = new String(new char[257]);
		String replacement = new String(new char[257]);
		String output = new String(new char[512]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			subString = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
	tangible.RefObject<String> tempRef_subString = new tangible.RefObject<String>(subString);
		fail(tempRef_subString);
		subString = tempRef_subString.argValue;
		int index = kmp(subString, String);
		if (index > -1)
		{
			int len = String.length();
			int sub_len = subString.length();
			int rep_len = replacement.length();
			int j = 0;
			for (int i = 0; i < index; i++)
			{
				output = tangible.StringFunctions.changeCharacter(output, j, string.charAt(i));
				j++;
			}
			for (int i = 0; i < rep_len; i++)
			{
				output = tangible.StringFunctions.changeCharacter(output, j, replacement.charAt(i));
				j++;
			}
			for (int i = index + sub_len; i < len; i++)
			{
				output = tangible.StringFunctions.changeCharacter(output, j, string.charAt(i));
				j++;
			}
			output = tangible.StringFunctions.changeCharacter(output, j, '\0');
			System.out.printf("%s", output);
		}
		else
		{
			System.out.printf("%s", String);
		}
	}
}

