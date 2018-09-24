package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		char[] b = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a.charAt(i) == b[j])
				{
					c[j] = c[j] + 1;
				t = 1;
				}
			}
		}
			if (t == 0)
			{
				System.out.print("No");
			}
			else
			{
				for (i = 0;i < 26;i++)
				{
					if (c[i] != 0)
					{
					System.out.printf("%c=%d\n",b[i],c[i]);
					}
				}
			}
	}

}

