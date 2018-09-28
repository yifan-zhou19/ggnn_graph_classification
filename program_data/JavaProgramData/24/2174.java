package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] a = new char[100][20];
	char c;
	int[] b = new int[100];
	int k = 0;
	int i;
	int max = 0;
	int min = 100;
	int s;
	int t;
	do
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[k] = tempVar.charAt(0);
			}
			k++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
	} while (c != '\n');
	for (i = 0;i < k;i++)
	{
		b[i] = String.valueOf(a[i]).length();
		if (b[i] > max)
		{
			max = b[i];
			s = i;
		}
		if (b[i] < min)
		{
			min = b[i];
			t = i;
		}
	}
	System.out.printf("%s\n%s\n",a[s],a[t]);
	}

}

