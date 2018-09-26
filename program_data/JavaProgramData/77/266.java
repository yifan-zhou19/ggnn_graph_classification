package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] b = new int[100];
		int i;
		int j = 0;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		x = a.charAt(0);
		/*for(i=1;i<strlen(a);i++)
		{
			if(a[i]!=a[0]) y=a[i];
		}*/
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == x)
			{
				b[j] = i;
				j++;
			}
			else
			{
				System.out.printf("%d %d\n", b[j - 1], i);
				j--;
			}
		}
		return 0;
	}
}

