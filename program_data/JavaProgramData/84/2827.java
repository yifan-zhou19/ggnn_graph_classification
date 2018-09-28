package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int m;
	int a;
	int b;
	int p;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (int i = 1;i <= n;i++)
	{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}

		if (i == 1)
		{
			a = m;


		}

		else if (i == 2)
		{

			b = m;

			if (b >= a)
			{
				p = a;

		   a = b;

		   b = p;

			}


		}

		else if (i >= 3)
		{


			if (m > a && m > b)
			{


				p = a;

				a = m;

				b = p;


			}

			else
			{

				if (m < a && m> b)
				{


					b = m;

				}






			}



		}
	}



	System.out.printf("%d\n%d\n",a,b);





		return 0;


	}
}

