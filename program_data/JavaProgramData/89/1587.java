package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[n * n];
		int[] q = new int[n * n];
		for (l = 0;l < n * n;l++)
		{
			p[l] = 0;
			q[l] = 0;
		}

		for (k = 0;k < n * n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		   if (a == 0 && b == 0)
		   {
				break;
		   }
			for (i = 0;i < n;i++)
			{
				if (a == i)
				{
					p[i] = p[i] + 1;
				}
				if (b == i)
				{
					q[i] = q[i] + 1;
				}

			}


		}
		for (j = 0;j < n;j++)
		{
				if (p[j] == 0 && q[j] == (n - 1))
				{
					s = 0;
					s++;
					System.out.printf("%d\n",j);
				}
		}
		if (s == 0)
		{
			System.out.print("NOT FOUND");
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(q);
		return 0;
	}

}

