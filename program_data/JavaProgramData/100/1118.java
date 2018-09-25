package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[25];
	public static int Main()
	{
		int k = 0;
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		int ii = 0;
		String aa;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		aa = (String)malloc((Character.SIZE / Byte.SIZE) * 27);
		aa = 'a';
		*(aa.Substring(1)) = 'b';
		*(aa.Substring(2)) = 'c';
	   *(aa.Substring(3)) = 'd';
	*(aa.Substring(4)) = 'e';
	*(aa.Substring(5)) = 'f';
	*(aa.Substring(6)) = 'g';
	*(aa.Substring(7)) = 'h';
	*(aa.Substring(8)) = 'i';
	*(aa.Substring(9)) = 'j';
	*(aa.Substring(10)) = 'k';
	*(aa.Substring(11)) = 'l';
	*(aa.Substring(12)) = 'm';
	*(aa.Substring(13)) = 'n';
	*(aa.Substring(14)) = 'o';
	*(aa.Substring(15)) = 'p';
	*(aa.Substring(16)) = 'q';
	*(aa.Substring(17)) = 'r';
	*(aa.Substring(18)) = 's';
	*(aa.Substring(19)) = 't';
	*(aa.Substring(20)) = 'u';
	*(aa.Substring(21)) = 'v';
	*(aa.Substring(22)) = 'w';
	*(aa.Substring(23)) = 'x';
	*(aa.Substring(24)) = 'y';
	*(aa.Substring(25)) = 'z';
	for (ii = 0;ii < 26;ii++)
	{
		for (ps = str; * ps != '\0';ps++)
		{
			if (*ps == *(aa.Substring(ii)))
			{
				sum[ii]++;
				k = 1;
			}
		}
		if (k == 1)
		{
		   if (sum[ii] == 0)
		   {
			   continue;
		   }
		   else if (sum[ii] != 0)
		   {
			   System.out.printf("%c=%d\n",*(aa.Substring(ii)),sum[ii]);
		   }
		}
	}
	if (k != 1)
	{
		System.out.print("No");
	}
	return 0;
	}




}

