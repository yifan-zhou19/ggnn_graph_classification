package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int i = 0;
		char fuhao;
		int j;
		int k;
		int number = 0;
		int same = 0;
		int[] a = new int[300];
		do
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			fuhao = tempVar2.charAt(0);
		}
		i++;
		} while (fuhao != '\n');
		for (j = 0;j <= i - 1;j++)
		{
			for (k = 0;k <= i - 1;k++)
			{
				if (a[k] == a[j] && k != j)
				{
					a[k] = 0;
				same++;
				}

			}
			if (same == i - 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto result;
			}
		}







		for (j = 0;j <= i - 1;j++)
		{
			for (k = 0;k <= i - 1;k++)
			{
				if (a[k] > a[j])
				{
					number = number + 1;

				}
			}
			if (number == 1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto result;
			}
			number = 0;

		}

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	result:
	if (number == 1)
	{
		System.out.printf("%d",a[j]);
	}

			else
			{
				System.out.print("No");
			}










		return 0;
	}

}

