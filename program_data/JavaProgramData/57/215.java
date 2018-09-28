package <missing>;

public class GlobalMembers
{
	public static void Main(String args)
	{
		int n;
		String str = new String(new char[30]);
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n - .0.getValue() != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			switch (str.charAt(len - 1))
			{
				case 'r': //er
				case 'y': //ly
					str = str.substring(0, len - 2);
					break;
				case 'g': //ing
					str = str.substring(0, len - 3);
					break;
			}
			System.out.printf("%s\n",str);
		}
	}

}

