package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		char x;
		char y;
		int[] a = new int[100];
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		j = 0;
		for (i = 0;i < 100;i++)
		{
			a[i] = -1;
		}
		x = s.charAt(0);
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == x)
			{
				a[j] = i;
				j++;
			}
			else
			{
				System.out.printf("%d %d\n",a[j - 1],i);
				j--;
				a[j] = -1;
			}
		}
		return 0;
	}

}

