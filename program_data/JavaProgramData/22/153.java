package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int t;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300];
		int[] a = new int[300];
		char c;
		for (i = 0;i <= 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		if (i == 0)
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto a;
		}
		else
		{
		for (j = i;j >= 1;j--)
		{
			for (k = 0;k < j;k++)
			{
				if (a[k] < a[k + 1])
				{
					t = a[k];
					a[k] = a[k + 1];
					a[k + 1] = t;
				}
			}
		}
		}
		if (a[0] == a[i])
		{
			System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto a;
		}
		else
		{
			for (j = 0;j <= i;j++)
			{
			if (a[j + 1] < a[j])
			{
				System.out.printf("%d\n",a[j + 1]);
				break;
			}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a:
	;
	}

}

