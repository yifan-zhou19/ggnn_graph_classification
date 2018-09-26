package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[500]); //??????
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = 0; //?????????
		len = ch.length();
		for (int templen = 2; templen <= len; templen++) //??????
		{
			for (int i = 0; i <= len - templen; i++) //?????????????
			{
				for (int j = i; j < i + templen; j++) //????????????????
				{
					if (ch.charAt(j) != ch.charAt(templen + i - 1 - (j - i)))
					{
						break;
					}
					if (j == i + templen - 1)
					{
						for (int k = i; k < i + templen; k++)
						{
							System.out.print(ch.charAt(k));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

