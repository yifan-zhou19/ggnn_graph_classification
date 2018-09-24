package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int group = 0;
		int i;
		int[] num = new int[26];
		int maxc;
		int max;
		String string = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		for (i = 0;i <= 25;i++)
		{
			num[i] = 0;
		}
		for (p = String; * p != '\0';p++)
		{
			num[*p - 'a']++;
		}

		for (i = 0;i <= 25;i++)
		{
			if (num[i] != 0)
			{
				System.out.printf("%c=%d\n",i + 'a',num[i]);
				group = group + num[i];
			}
		}
		if (group == 0)
		{
			System.out.print("No\n");
		}




	}

}

