package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[N];
	public static int temp;
	public static void Main()
	{
		int i = 0;
		int j;
		int max;
		int n = 0;
		String tag = new String(new char[N]);
		while (tag.charAt(i - 1) != '\n')
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				tag = tangible.StringFunctions.changeCharacter(tag, i, tempVar2);
			}
			i++;
			n++;
		}
		for (i = 0;i < n - 1;i++)
		{
			max = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[max] < a[j])
				{
					max = j;
				}
			}
				if (i != max)
				{
					temp = a[i];
					a[i] = a[max];
					a[max] = temp;
				}
		}
		if (n == 1 || a[0] == a[n - 1])
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				if (a[i] < a[0])
				{
					System.out.printf("%d\n",a[i]);
					break;
				}
			}
		}
	}
}

