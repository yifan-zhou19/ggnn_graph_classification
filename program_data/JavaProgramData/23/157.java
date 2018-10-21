package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int len;
		int begin;
		int end;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		end = len - 1;
		for (i = end;i >= 0;--i)
		{
			if (a.charAt(i) == ' ' && i != 0)
			{
				begin = i + 1;
				break;
			}
			 begin = 0;
		}
		for (j = begin;j <= end;++j)
		{
			System.out.printf("%c",a.charAt(j));
		}
		while (begin != 0)
		{
			end = begin - 2;
			for (i = end;i >= 0;--i)
			{
				if (a.charAt(i) == ' ' && i != 0)
				{
					begin = i + 1;
					break;
				}
				begin = 0;
			}
			System.out.print(" ");
			for (j = begin;j <= end;++j)
			{
				System.out.printf("%c",a.charAt(j));
			}
		}
	}



}
