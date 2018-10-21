package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int del;
		int counter = 0;
		int p = 0;
		int[] a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new int[n];
		;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (j = 0;j < n;j++)
		{
			if (a[j] == del)
			{
				 counter = counter + 1;
				 for (k = j + 1;k < n;k++)
				 {
					 if (a[k] != del)
					 {
						 a[j] = a[k];
						 for (i = k;i < n;i++)
						 {
							 a[i] = a[i + 1];
						 }

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						 goto end;
					 }
				 }

			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			end:
			;
		}

		for (i = 0;i < n - counter;i++)
		{
			if (p != 0)
			{
			System.out.print(" ");
			}
			System.out.print(a[i]);
			p = 1;
		}


		return 0;
	}

}

