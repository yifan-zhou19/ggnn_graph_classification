package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[150][300];
		char c;
		int i;
		int[] a = new int[300];
		int j = 0;
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str[i] = tempVar.charAt(0);
			}
			a[i] = String.valueOf(str[i]).length();
			j++;
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",a[i]);
		}
	}
}

