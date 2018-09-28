package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[max]);
		char c;
		int size = 0;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			size = Integer.parseInt(tempVar);
		}

		for (i = 0; i < size; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			c = str.charAt(0);
			j = 0;
			while (c != '\0')
			{
				switch (c)
				{
					case 'A':
						System.out.print("T");
						break;
					case 'T':
						System.out.print("A");
						break;
					case 'G':
						System.out.print("C");
						break;
					case 'C':
						System.out.print("G");
						break;
				} //switch
				j++;
				c = str.charAt(j);
			} //while
			System.out.print("\n");
		} //for

	}
}

