package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] x = new int[250];
		int min = 100;
		int max = 0;
		char[][] s =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  *(s + i) = tempVar2;
			  }
		}

		for (i = 0;i < n;i++)
		{
			x[i] = String.valueOf(*(s + i)).length();
		}

		for (i = 0;i < n;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
			if (x[i] < min)
			{
				min = x[i];
			}
		}

		for (i = 0;i < n;i++)
		{
			if (x[i] == max)
			{
				System.out.printf("%s\n",*(s + i));
				break;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (x[i] == min)
			{
				System.out.printf("%s\n",*(s + i));
				break;
			}
		}






		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

