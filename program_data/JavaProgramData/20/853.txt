package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		String str = new String(new char[20]);
		String sub = new String(new char[20]);
		String max;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char temp;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			l = str.length();
			sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
			max = str;
			for (p = str;p <= str.Substring(l);p++) //??????????
			{
				if (max < *p)
				{
					max = p; //????????
				}
			}
			temp = max;
			max = null;
			System.out.print(str);
			System.out.print(temp);
			System.out.print(sub);
			System.out.print(max.Substring(1));
			System.out.print("\n");
		}
		return 0;
	}




}

