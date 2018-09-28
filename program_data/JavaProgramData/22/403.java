package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int t;
		int sub;
		int[] a = new int[10000];
		String str = new String(new char[10000]);
		char c;
		str = tangible.StringFunctions.changeCharacter(str, 0, '.');
		for (i = 0,j = 1;(c = str.charAt(j - 1)) != '\n';i++,j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, tempVar2);
			}
		}
		n = i;
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i + 1];
					a[i + 1] = a[i];
					a[i] = t;
				}
			}
		}
		for (i = n - 2,j = 0;i >= 0;i--)
		{
			if (a[i] < a[i + 1])
			{
				sub = a[i];
				break;
			}
			else
			{
				j++;
			}
		}
		if (j == n - 1)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",sub);
		}
	}
}

