package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int z;
		int i;
		int l;
		String word = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (z = 0;z < n;z++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			l = word.length();

			for (i = 0;i < l;i++)
			{
				if (word.charAt(l - 3) == 'i' && word.charAt(l - 2) == 'n' && word.charAt(l - 1) == 'g')
				{
					for (i = 0;i < l - 3;i++)
					{
						System.out.printf("%c",word.charAt(i));
					}
					System.out.print("\n");
					break;
				}
				else
				{
					for (i = 0;i < l - 2;i++)
					{
						System.out.printf("%c",word.charAt(i));
					}
					System.out.print("\n");
					break;

				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

