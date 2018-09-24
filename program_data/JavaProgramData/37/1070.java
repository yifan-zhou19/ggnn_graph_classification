package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100000]);
		int[] c = new int[26];
		int i;
		int l;
		int t;
		int j;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < t;i++)
		{
			b = 0;
			s = new Scanner(System.in).nextLine();
			l = s.length();
			for (j = 0;j < l;j++)
			{
			   c[s.charAt(j) - 'a']++;
			}
			for (j = 0;j < l;j++)
			{
				if (c[s.charAt(j) - 'a'] == 1)
				{
					System.out.printf("%c\n",s.charAt(j));
					b = 1;
					break;
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			if (b != 1)
			{
				System.out.print("no\n");
			}
		}
		return 0;
		//???????? 
	}
}

