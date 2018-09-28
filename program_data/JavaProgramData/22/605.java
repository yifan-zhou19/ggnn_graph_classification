package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300],i=1,t=0,j;
		int[] a = new int[300];
		int i = 1;
		int t = 0;
		int j;
		while (1 > 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[t] = Integer.parseInt(tempVar);
			}
			t++;
			char b;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b != ',')
			{
				break;
			}
		}

		while (a[i] == a[0])
		{
				i++;
		}

		if (t == 1 || i == t || t == 0)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < t - 1;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				if (a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 1;i < t;i++)
		{
			if (a[i] != a[0])
			{
		System.out.printf("%d",a[i]);
		break;
			}
		}
		}


	}
}

