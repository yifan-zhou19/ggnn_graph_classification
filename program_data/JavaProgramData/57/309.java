package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String str = new String(new char[15]);
		void change(char str.charAt(15));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			change(str);
		}
	}

		public static void change(String strr)
		{
			final String cutstr = "";
			final String mstr = "";
			int length;
			length = strr.length();
			mstr = strr.substring(0, length - 2);
			mstr += "ly";
			if (strcmp(mstr,strr) >= 0)
			{
				cutstr = strr.substring(0, length - 2);
			}
			else
			{
				cutstr = strr.substring(0, length - 3);
			}
			System.out.printf("%s\n",cutstr);
		}
}

