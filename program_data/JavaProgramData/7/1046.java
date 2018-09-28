package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			String = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			substring = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replacement = tempVar3.charAt(0);
		}
		int lenth = 0;
		int judge = 0;
		for (int i = 0;substring.charAt(i) != '\0';i++)
		{
			lenth++;
		}
		for (int i = 0;i < 256;i++)
		{
			if (String[i] == substring.charAt(0))
			{
				int count;
				for (count = 0;substring.charAt(count) != '\0';count++)
				{
					if (String[i + count] != substring.charAt(count))
					{
						break;
					}
				}
				if (count == lenth)
				{
					for (int j = 0;j < i;j++)
					{
						System.out.printf("%c",string.charAt(j));
					}
					System.out.printf("%s",replacement);
					for (int j = i + lenth;string.charAt(j) != '\0';j++)
					{
						System.out.printf("%c",string.charAt(j));
					}
					judge = 1;
					break;
				}
			}
		}
		if (judge == 0)
		{
			System.out.printf("%s",String);
		}
		return 0;
	}
}

