package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		int[] b = new int[150];
		int i;
		int j;
		int s = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			j = a.charAt(i) - '\0';
			b[j]++;
		}
		for (i = 65;i <= 90;i++)
		{
			if (b[i] != 0)
			{
			   System.out.printf("%c=%d\n",i,b[i]);
			   s++;
			}
		}
		for (i = 97;i <= 122;i++)
		{
			if (b[i] != 0)
			{
			   System.out.printf("%c=%d\n",i,b[i]);
			   s++;
			}
		}
		if (s == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

