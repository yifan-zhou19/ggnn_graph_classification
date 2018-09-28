package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//n??????
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i1;
		for (i1 = 0;i1 <= n - 1;i1++)
		{
			String str = new String(new char[100000]);

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			int length;
			length = str.length();
			int counter;
			int i3;
			for (i3 = 0;i3 <= length - 1;i3++)
			{
				counter = 0;
				char tmp;
				tmp = str.charAt(i3);
				int i4;
				for (i4 = 0;i4 <= length - 1;i4++)
				{
					if (str.charAt(i3) == str.charAt(i4))
					{
						counter++;
					}
					//????????????????
					if (counter > 1)
					{
						break;
					}
				}
				if (counter == 1)
				{
					System.out.printf("%c\n",str.charAt(i3));
					break;
				}
			}
			if (i3 == length)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

