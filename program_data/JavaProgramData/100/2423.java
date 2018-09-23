public class word
{
	public char a;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static word[] w = tangible.Arrays.initializeWithDefaultwordInstances(52);
	public static word tmp = new word();

	public static int Main()
	{
		String s = new String(new char[301]);
		int i;
		int sign = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}

		for (i = 0;i <= 25;i++)
		{
			w[i].a = 65 + i;
		w[i].n = 0;
		}
		for (i = 26;i < 52;i++)
		{
			w[i].a = 71 + i;
		w[i].n = 0;
		}


		for (i = 0;s.charAt(i) != '\0';i++)
		{
			for (j = 0;j < 52;j++)
			{
				if (s.charAt(i) == w[j].a)
				{
					w[j].n++;
					sign = -1;
					break;
				}
			}
		}
		if (sign == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 52;i++)
			{
				if (w[i].n == 0)
				{
					continue;
				}
				else
				{
					System.out.printf("%c=%d\n",w[i].a,w[i].n);
				}
			}
		}
		return 0;
	}


}

