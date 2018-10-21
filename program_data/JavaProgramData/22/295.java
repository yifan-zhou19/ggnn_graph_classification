package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int temp;
		int n;
		int[] a = new int[300];
		String array = new String(new char[1000]);
		String p = array;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			array = tempVar.charAt(0);
		}
		for (i = 0,j = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) == ',')
			{
				j++;
			}
			else
			{
				a[j] = 10 * a[j] + *(p.Substring(i)) - 48;
			}
		}
		n = j + 1;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i] != a[0])
			{
			System.out.printf("%d\n",a[i]);
			break;
			}
		}
			if (i == n)
			{
				System.out.print("No\n");
			}
	}
}

