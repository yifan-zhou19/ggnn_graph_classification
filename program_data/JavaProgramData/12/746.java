package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
	while (true)
	{
	   int s = 0;
	   for (i = 0;;i++)
	   {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[i] == 0)
		{
			break;
		}
		if (a[i] == -1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
	   }
	   for (j = 0;j <= i - 1;j++)
	   {
		for (k = 0;k <= i - 1;k++)
		{
		 if (a[j] % a[k] == 0 && a[j] / a[k] == 2)
		 {
			 s++;
		 }
		}
	   }
		 System.out.print(s);
		 System.out.print("\n");
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	return 0;
	}

}

