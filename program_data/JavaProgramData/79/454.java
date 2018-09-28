package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int m = 1;
		int[] res = new int[100];
		int t = 0;

		for (;t < 100;t++)
		{
				res[t] = 0;
		}
		t = 0;

		for (;n != 0 && m != 0;)
		{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct per
	//	{
	//		int a;
	//		int b;
	//	}
	//	*p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			p = (per)malloc(sizeof(per) * n);

		int i;

		for (i = 0;i < n;i++)
		{
			(p + i).a = i + 1;
			(p + i).b = i + 1;
		}

		int[] out;
		out = new int[n];

		for (i = 0;i < n;i++)
		{
			out[i] = 0;
		}

		int r = n;
		int j = 0;


		for (;out[n - 1] == 0;)
		{


			for (i = 0;i < n;i++)
			{

				if ((p + i).b == 0)
				{
					continue;
				}

				else if ((p + i).b - m * j == m)
				{
					out[j] = (p + i).a;
					(p + i).b = 0;
					j++;
				}
				else
				{
					(p + i).b += (n - j);
				}
			}
		}

					   if (n != 0 && m != 0)
					   {
					   res[t] = out[n - 1];

					   t++;
					   }
			 p = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(out);


		}

		for (t = 0;res[t] != 0;t++)
		{
							   System.out.printf("%d\n",res[t]);
		}

		return 0;
	}
}

