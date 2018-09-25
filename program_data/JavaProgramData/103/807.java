package <missing>;

public class GlobalMembers
{
	//?????????
	public static void change(tangible.RefObject<String> a)
	{
		int l = a.argValue.length();
		int i;
		for (i = 0;i < l;i++)
		{
			if ((a.argValue.charAt(i) >= 'a') && (a.argValue.charAt(i) <= 'z'))
			{
				a.argValue.charAt(i) = a.argValue.charAt(i) - 'a'+'A';
			}
		}
		return;
	}

	public static int Main()
	{
		int temp_num;
		int l;
		int i;
		char temp_char;
		String st = new String(new char[1024]); //?????????????????�????�
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
	tangible.RefObject<String> tempRef_st = new tangible.RefObject<String>(st);
		change(tempRef_st);
		st = tempRef_st.argValue;
		//printf("%s",st);  //debug
		l = st.length();
		temp_num = 1;
		temp_char = st.charAt(0);
		for (i = 1;i <= l;i++) //?<???????????
		{
			if (st.charAt(i) == temp_char)
			{
				temp_num++;
			}
			else
			{
				System.out.printf("(%c,%d)",temp_char,temp_num);
				temp_char = st.charAt(i);
				temp_num = 1;
			}
		}
		return 0;
	}
}

