package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int line;
		int n;
		for (line = 1;;line++)
		{
			int[] a = new int[16];
			n = 0;
		for (i = 0;i < 16;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		if (a[0] == -1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto A;
		}
		else if (a[i] == 0)
		{
			break;
		}
		}
		for (i = 0;i < 16;i++)
		{
			for (j = 0;j < 16;j++)
			{
				if (a[i] == 2 * a[j] && a[i] != 0)
				{
				n++;
				break;
				}

			}
		}
		System.out.printf("%d\n",n);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
		return 0;
	}
}

