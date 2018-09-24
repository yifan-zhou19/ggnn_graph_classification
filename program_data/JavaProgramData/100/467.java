package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p = 0;
		int j;
		int n;
		int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char i;
		String a = new String(new char[301]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		//printf("%s",a);
		n = a.length();
		for (j = 0;j < n;j++)
		{
			i = a.charAt(j);
			if (i <= 'z' && i >= 'a')
			{
			   count[i - 97]++;
			}
		}
		for (i = 'a';i <= 'z';i++)
		{
			if (count[i - 97] != 0)
			{
				System.out.printf("%c=%d\n",i,count[i - 97]);
				p++;
			}
		}
		if (p == 0)
		{
		System.out.print("No");
		}
		return 0;
	}

}

