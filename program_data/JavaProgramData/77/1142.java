package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	String string = new String(new char[101]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		String = tempVar;
	}
	int len = String.length();
	int i;
	int[] a = new int[100];
	int num = 0;
	int j;
	for (i = 0;i < len;i++)
	{
		if (String[i] == string.charAt(0))
		{
			a[num] = i;
			num++;
		}
		if (String[i] != string.charAt(0))
		{
			for (j = num - 1;j >= 0;j--)
			{
				if (a[j] != -1)
				{
					System.out.printf("%d",a[j]);
					a[j] = -1;
					break;
				}
			}
			System.out.printf(" %d\n",i);
		}

	}


	}
}

