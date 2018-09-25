package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] ch = new int[26];
		int t = 0;
		char inp;
		char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for (i = 0;i < 26;i++)
		{
			ch[i] = 0;
		}
		inp = System.in.read();
		do
		{
			for (i = 0;i < 26;i++)
			{
				if (inp == c[i])
				{
					ch[i]++;
				}
			}
		inp = System.in.read();
		}while (inp != '\n');

		for (i = 0;i < 26;i++)
		{
			if (ch[i] != 0)
			{
				System.out.printf("%c=%d\n",c[i],ch[i]);
				t++;
			}
		}

		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
