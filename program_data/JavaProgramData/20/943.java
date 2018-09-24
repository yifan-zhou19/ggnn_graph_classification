package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (ConsoleInput.lastReadWasGood())
		{
			final String str = "";
			final String substr = "";
			final String ansstr = "";
			char cmax = 0;
			int point = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int length = str.length();
			for (int i = 0;i < length;i++)
			{
				if (str.charAt(i) > cmax)
				{
					cmax = str.charAt(i);
					point = i;
				}
			}
			for (int i = 0;i < point + 1;i++)
			{
				System.out.print(str.charAt(i));
			}
				//ansstr[i]=str[i];
			//for(int i=point+1;i<point+4;i++)
				//ansstr[i]=substr[i-point-1];
			System.out.print(substr);
			for (int j = point + 1;j < length;j++)
			{
				System.out.print(str.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

