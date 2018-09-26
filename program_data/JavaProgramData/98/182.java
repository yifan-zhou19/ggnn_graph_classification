package <missing>;

public class GlobalMembers
{
	public static int len(String word)
	{
		String p;
		p = word;
		int i = 0;
		int count = 0;
		for (i = 0;i < 81;i++)
		{
			if (*(p.Substring(i)) == 0)
			{
				break;
			}
			else
			{
				count++;
			}
		}
			return count;
	}
	public static int Main()
	{
		String word = new String(new char[81]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(word,0,(Character.SIZE / Byte.SIZE));
		int n = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		System.out.print(word);
		num = len(word) + 1;
		for (i = 2;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			if (len(word) + num > 80)
			{
				System.out.print("\n");
				System.out.print(word);
				num = len(word) + 1;
			}
			else
			{
				System.out.print(" ");
				System.out.print(word);
				num = num + len(word) + 1;
			}
		}
		return 0;
	}
}

